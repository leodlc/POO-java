package ec.edu.espe.veterinaria;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class Veterinario {
    List<Cliente> clientes = new ArrayList<>();
    List<RegistroCalendario> registroEnfermedades = new ArrayList<>();
    List<RegistroCalendario> registroVacunacion = new ArrayList<>();
    
    public Veterinario() {}
    
    public void registrarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    
    public void registrarEnfermedad(Mascota mascota, String enfermedad, LocalDate fecha) {
        RegistroCalendario registro = new RegistroCalendario(mascota, enfermedad, fecha);
        registroEnfermedades.add(registro);
    }
    
    public void registrarVacunacion(Mascota mascota, String enfermedad, LocalDate fecha) {
        RegistroCalendario registro = new RegistroCalendario(mascota, enfermedad, fecha);
        registroVacunacion.add(registro);
    }

    List<Mascota> getMascotasCliente(Cliente cliente) {
        for (Cliente c : clientes) {
            if (c.getCodigo().equalsIgnoreCase(cliente.getCodigo())) {
                return c.getMascotas();
            }
        }
        
        return new ArrayList<>();
    }

    void guardarCalendarioVacunacion(Mascota mascota) {
        String contenido = "codigo, enfermedad, fecha\n";
        
        for (RegistroCalendario registro : registroVacunacion) {
            contenido += registro.getMascota().getCodigo() + ", " + registro.getEnfermedad() + ", " + registro.getFecha().format(DateTimeFormatter.ISO_DATE) + "\n";
        }
        
        try {
            if (!Paths.get("calendario_vacunacion.txt").toFile().exists()) {
                Files.createFile(Paths.get("calendario_vacunacion.txt"));
            }
            
            Files.write(Paths.get("calendario_vacunacion.txt"), contenido.getBytes(), StandardOpenOption.TRUNCATE_EXISTING);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    String mostrarMayorRaza() {
        HashMap<String, Integer> totalPorRaza = new HashMap<>();
        
        for (Cliente cliente : clientes) {
            List<Mascota> mascotas = cliente.getMascotas();
            
            for (Mascota mascota : mascotas) {
                int cantidad = 1;
                
                if (totalPorRaza.containsKey(mascota.getRaza().toLowerCase())) {
                    cantidad = totalPorRaza.get(mascota.getRaza().toLowerCase()) + 1;
                }
                
                totalPorRaza.put(mascota.getRaza().toLowerCase(), cantidad);
            }
        }
        
        int mayor = 0;
        String salida = "";
        
        for (Map.Entry<String, Integer> entry : totalPorRaza.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            
            if (entry.getValue() > mayor) {
                salida = entry.getKey();
                mayor = entry.getValue();
            }
        }
        
        return salida;
    }
}

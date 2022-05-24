package ec.edu.espe.veterinaria;

import java.time.LocalDate;
import java.util.List;

public class Gestor {

    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario();
        Cliente cliente = new Cliente("C00001", "John Doe", "100002663224", "", "555-265-321");
        Mascota perro = null;
        Mascota gato = null;
        
        try {
            perro = new Mascota(1, "max", "Labrador", "cafe", LocalDate.now(), 60, 70);
            gato = new Mascota(2, "yuki", "Ragdoll", "blanco", LocalDate.now(), 40, 50);
        } catch (Exception ex) {
            System.err.println("la mascota no pudo ser creada");
            System.err.println(ex.getMessage());
        }
        
        cliente.agregarMascota(perro);
        cliente.agregarMascota(gato);
        veterinario.registrarCliente(cliente);
        
        veterinario.registrarEnfermedad(perro, "rabia", LocalDate.parse("2021-06-22"));
        veterinario.registrarVacunacion(perro, "rabia", LocalDate.parse("2021-07-22"));
        
        veterinario.registrarEnfermedad(perro, "sarna", LocalDate.parse("2021-07-29"));
        veterinario.registrarVacunacion(perro, "sarna", LocalDate.parse("2021-08-29"));
        
        List<Mascota> mascotas = veterinario.getMascotasCliente(cliente);
        
        System.out.println("mascotas del cliente " + cliente.getNombre() + "#" + cliente.getCodigo());
        System.out.println();
        
        for (Mascota mascota  : mascotas) {
            System.out.println(mascota);
        }
        
        veterinario.guardarCalendarioVacunacion(perro);
        
        String mayorRaza = veterinario.mostrarMayorRaza();
        System.out.println("raza mayor numero de mascotas: " + mayorRaza);
    }
    
}

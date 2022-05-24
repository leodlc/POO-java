package coreccion2examenapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Locale;

public class Veterinario {
    private ArrayList<Mascota> pacientes = new ArrayList<Mascota>();
    private String nombre;

    public Veterinario(String nombre) {
        this.nombre = nombre;
    }
public void agregarPaciente(Mascota mascota){
        pacientes.add(mascota);
}
    public String mostrarRazaDominante() {
        Mascota aux;
        ArrayList<Integer> nincidencias = new ArrayList<Integer>();
        ArrayList<String> razas = new ArrayList<String>();
        for (int i = 0; i < pacientes.size(); i++) {
            aux = pacientes.get(i);
            String auxRaza = aux.getRaza();
            int contador = 0;
            for (int j = 0; j < pacientes.size(); j++) {
                Mascota aux2 = pacientes.get(j);
                if (aux2.getRaza().toUpperCase(Locale.ROOT).equals(aux.getRaza().toUpperCase(Locale.ROOT))) {
                    contador += 1;
                }
            }
            nincidencias.add(contador);
            razas.add(auxRaza);
        }
        return "La raza dominante es : " + razas.get(nincidencias.indexOf(Collections.max(nincidencias)));
    }
}


package examencorreccion2app;

import java.util.ArrayList;

public class Veterinario {
    private ArrayList<Mascota> pacientes= new ArrayList<Mascota>();
    private String nombre;
    
    public Veterinario(String nombre){
        this.nombre= nombre;
    }
    public String mostrarRazaDominante(){
        Mascota aux;
        ArrayList<Integer> nindicencias= new ArrayList<Integer>();
        ArrayList<String>razas= new ArrayList<String>();
        for(int i=0;i<pacientes.size();i++){
            aux= pacientes.get(i);
            String auxRaza= aux.getRaza();
            int contador=0;
            for(int j=0;j<pacientes.size();j++){
                Mascota aux2= pacientes.get(j);
                if (aux2.getRaza(.toUpperCase(Locale.R00T).equals(aux.getRaza().toUpperCase(Locale.R00T)))){
                
                }
            }
        }
    }
}


package asociacion1n_app;

import java.util.ArrayList;
import java.util.Iterator;


public class Departamento {
    
    private String nombreDpto;
    private ArrayList<Empleado>listEmp=new ArrayList<Empleado>();

    public Departamento() {
    }

    public Departamento(String nombreDpto) {
        this.nombreDpto = nombreDpto;
    }

    public String getNombreDpto() {
        return nombreDpto;
    }

    public void setNombreDpto(String nombreDpto) {
        this.nombreDpto = nombreDpto;
    }
    
    public void adicionarEmpleado(Empleado e){
        listEmp.add(e);
    }
    
    public int definirCantidadEmpleados(){
        return listEmp.size();
    }
    
    public Empleado obtenerEmpleado(int indice){
        return listEmp.get(indice);
    }
    
    public void mostrarEmpleados(){
        Empleado aux;
        Iterator it=listEmp.iterator();
        while(it.hasNext()){
            aux=(Empleado) it.next();
            System.out.println(aux.toString());
        }
    }

    @Override
    public String toString() {
        return "Departamento{" + "nombreDpto=" + nombreDpto + '}';
    }
    
}

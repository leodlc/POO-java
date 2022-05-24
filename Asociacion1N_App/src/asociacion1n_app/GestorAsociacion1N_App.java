
package asociacion1n_app;

public class GestorAsociacion1N_App {

    public static void main(String[] args) {

        Departamento d1=new Departamento("Finanzas");
        Departamento d2=new Departamento("Ventas");
        
        Empleado e1=new Empleado("Paul",d1);
        Empleado e2=new Empleado("Belen",d1);
        Empleado e3=new Empleado("Carmen",d2);
        
        d1.adicionarEmpleado(e1);
        d1.adicionarEmpleado(e2);
        
        d2.adicionarEmpleado(e3);
        
        d1.mostrarEmpleados();
        
        System.out.println("otro departamento");
        d2.mostrarEmpleados();
    }
    
}

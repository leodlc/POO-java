
package polimorfismodeberapp;


public class GestorPolimorfismoDeberApp {

    
    public static void main(String[] args) {
        EmpleadoAsalariado objemp1= new EmpleadoAsalariado(300,"Andres",13);
        EmpleadoPorHoras objemp2= new EmpleadoPorHoras(5,30,"Pedro",14);
        EmpleadoPorComision objemp3= new EmpleadoPorComision(40,10,"Juan",12);
        EmpleadoBasemasComision objemp4= new EmpleadoBasemasComision(600,12,10,"Miguel",11);
        
        Empleado [] arrEmpleado= new Empleado[4];
        arrEmpleado[0]=objemp1;
        arrEmpleado[1]=objemp2;
        arrEmpleado[2]=objemp3;
        arrEmpleado[3]=objemp4;
        
        for(int i=0;i<4;i++){
           System.out.println("Sueldo: " + arrEmpleado[i].calcularSalario());
        }
    }
    
}

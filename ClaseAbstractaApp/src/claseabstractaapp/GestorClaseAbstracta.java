
package claseabstractaapp;

public class GestorClaseAbstracta {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Empleado objEm = new Empleado(550,"Quito","Fernando",30);
        objEm.tomarMedicamentos();
        objEm.tomarTemperatura();
        objEm.mostrarInfformacion();
    }
    
}

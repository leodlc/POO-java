package bancoabstractfactory;

public class GestorBancoAbstractFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaJoven cuenta1= new CuentaJoven("Menores de 25 años");
        cuenta1.imprimir();
        cuenta1.Cuenta();
        cuenta1.TarjetaDebito();
        cuenta1.TarjetaCredito();
        cuenta1.Regalo();
        System.out.println("=======================");
        Cuenta10 cuenta2= new Cuenta10("Entre 25 y 65 años");
        cuenta2.imprimir();
        cuenta2.Cuenta();
        cuenta2.TarjetaDebito();
        cuenta2.TarjetaCredito();
        cuenta2.Regalo();
        System.out.println("=======================");
        CuentaVip cuenta3= new CuentaVip("Mayores de 65 años");
        cuenta3.imprimir();
        cuenta3.Cuenta();
        cuenta3.TarjetaDebito();
        cuenta3.TarjetaCredito();
        cuenta3.Regalo();
        System.out.println("=======================");
        CuentaEstandar cuenta4= new CuentaEstandar("Clientes VIP");
        cuenta4.imprimir();
        cuenta4.Cuenta();
        cuenta4.TarjetaDebito();
        cuenta4.TarjetaCredito();
        cuenta4.Regalo();
        
    }
    
}

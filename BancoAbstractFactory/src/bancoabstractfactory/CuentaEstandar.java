package bancoabstractfactory;

public class CuentaEstandar implements Cuenta{
    public String tipoCliente;

    public CuentaEstandar(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    public void imprimir(){
        System.out.println("Cliente: " + tipoCliente);
    }
    @Override
    public void Cuenta() {
        System.out.println("Cuenta : " +"0.5 de interes");
    }

    @Override
    public void TarjetaDebito() {
        System.out.println("TarjetaDebito : " +"5 dolares");
    }

    @Override
    public void TarjetaCredito() {
        System.out.println("TarjetaCredito : " +"No");
    }

    @Override
    public void Regalo() {
        System.out.println("Regalo: " +"No");
    }
    
}

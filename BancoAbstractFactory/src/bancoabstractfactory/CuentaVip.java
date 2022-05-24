package bancoabstractfactory;

public class CuentaVip implements Cuenta {
    public String tipoCliente;

    public CuentaVip(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    public void imprimir(){
        System.out.println("Cliente: " + tipoCliente);
    }
    @Override
    public void Cuenta() {
        System.out.println("Cuenta : " +"1.5 de interes");
    }

    @Override
    public void TarjetaDebito() {
        System.out.println("TarjetaDebito : " +"Gratutita");
    }

    @Override
    public void TarjetaCredito() {
        System.out.println("TarjetaCredito : " +"Gratuita 60% pension");
    }

    @Override
    public void Regalo() {
        System.out.println("Regalo: " +"Seguro");
    }
    
}

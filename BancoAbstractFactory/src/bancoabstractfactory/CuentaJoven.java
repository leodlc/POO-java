package bancoabstractfactory;

public class CuentaJoven implements Cuenta {
    
    public String tipoCliente;

    public CuentaJoven(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    public void imprimir(){
        System.out.println("Cliente: " + tipoCliente);
    }
    
    @Override
    public void Cuenta() {
        System.out.println( "Cuenta : " +" 2% de interes");
    }

    @Override
    public void TarjetaDebito() {
        System.out.println("TarjetaDebito : " +"Gratuita");
    }

    @Override
    public void TarjetaCredito() {
      System.out.println("TarjetaCredito : " +"No");
    }

    @Override
    public void Regalo() {
        System.out.println("Regalo: " +"CD musica");
    }
    
}

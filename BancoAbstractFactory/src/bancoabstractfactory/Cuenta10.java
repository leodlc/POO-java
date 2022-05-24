package bancoabstractfactory;

public class Cuenta10 implements Cuenta{
    
    public String tipoCliente;

    public Cuenta10(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
    
    
    public void imprimir(){
        System.out.println("Cliente: " + tipoCliente);
    }

    @Override
    public void Cuenta() {
        System.out.println("Cuenta : " +"1% de interes");
    }

    @Override
    public void TarjetaDebito() {
        System.out.println("TarjetaDebito : " +"Gratuita");
    }

    @Override
    public void TarjetaCredito() {
       System.out.println("TarjetaCredito : " +"18 dolares 60% remuneracion");
    }

    @Override
    public void Regalo() {
        System.out.println("Regalo: " +"Reproductor CD");
    }
    
}


package polimorfismofiguraapp;


public class Circunferencia extends Figura {
    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI*Math.pow(radio, 2);
    }
    
}

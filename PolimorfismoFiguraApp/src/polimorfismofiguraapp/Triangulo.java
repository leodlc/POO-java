
package polimorfismofiguraapp;


public class Triangulo extends Figura {
    private double altura;
    private double ancho;

    public Triangulo(double altura, double ancho) {
        this.altura = altura;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return ancho*altura*0.5;
    }
    
}

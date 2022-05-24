
package polimorfismofiguraapp;


public class Rectangulo extends Figura {
    //atributos
    private double largo;
    private double ancho;
    //metodos

    public Rectangulo(double largo, double ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    @Override
    public double calcularArea() {
        return largo*ancho; 
    }
    
    
}

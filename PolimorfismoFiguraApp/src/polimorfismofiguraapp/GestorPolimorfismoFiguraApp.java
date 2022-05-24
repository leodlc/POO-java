
package polimorfismofiguraapp;


public class GestorPolimorfismoFiguraApp {

    
    public static void main(String[] args) {
       Rectangulo objRectangulo= new Rectangulo(12,22);
       Circunferencia objCirc= new Circunferencia(15);
       Triangulo objTriangulo= new Triangulo(8,17);
       
       Figura [] arrFigura= new Figura[3];
       arrFigura[0]=objRectangulo;
       arrFigura[1]=objCirc;
       arrFigura[2]=objTriangulo;
       for(int i=0;i<3;i++){
           System.out.println("Area: "+ arrFigura[i].calcularArea());
       }
    }
    
}

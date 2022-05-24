
package libreriaapp;

import java.io.IOException;


public class Libro {
    private String codigo,titulo;
    private Tematica tematica;
    private Autor autor;
    private int numpag;
    private double precio;

    public Libro(String codigo, String titulo, Tematica tematica, Autor autor, int numpag, double precio) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.tematica = tematica;
        this.autor = autor;
        this.numpag = numpag;
        this.precio = precio;
    }
    public Libro(String codigo, String titulo, Tematica tematica, Autor autor, int numpag, double precio,String nombreAutor,String pais) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.tematica = tematica;
        this.autor = new Autor(nombreAutor,pais);
        this.numpag = numpag;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public Tematica getTematica() {
        return tematica;
    }

   

    public Autor getAutor() {
        return autor;
    }

    public Integer getNumpag() {
        return numpag;
    }

    public double getPrecio() {
        return precio;
    }
    
    public void controlarRangoPrecio() {
        try{
            this.precio = precio;
            if(precio>100 && precio<300){
                System.out.println(precio);
            }else{
                System.out.println("Precio fuera de rango");
            }
        }catch(Exception ex){
            System.out.println("El precio ingresado no esta en el rango adecuado");
        }
        
       
            
        
       
            
    }
}

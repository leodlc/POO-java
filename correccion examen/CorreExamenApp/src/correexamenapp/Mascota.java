
package correexamenapp;


public class Mascota {
    private int codigo;
    private String raza;
    private String colorPelo;
    private String fechaNacimiento;
    private float pesoMedio;
    private float pesoActual;
    public Mascota() {
     this.codigo = 0;
     this.raza = "";
     this.colorPelo = "";
     this.fechaNacimiento = "0/0/0";
     this.pesoMedio = 0.0f;
     this.pesoActual = 0.0f;
    }
    public Mascota(int codigo, String raza, String colorPelo, String fechaNacimiento, float pesoMedio, float pesoActual) {
        if(codigo<1 || codigo>100){
                System.out.println("No esta en el rango adecuado");
                
            }
        
        this.codigo = codigo;
        this.raza = raza;
        this.colorPelo = colorPelo;
        this.fechaNacimiento = fechaNacimiento;
        this.pesoMedio = pesoMedio;
        this.pesoActual = pesoActual;
    }
    public void setPesoActual(float pesoActual) {
    this.pesoActual = pesoActual;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getRaza() {
        return raza;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public float getPesoMedio() {
        return pesoMedio;
    }

    public float getPesoActual() {
        return pesoActual;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPesoMedio(float pesoMedio) {
        this.pesoMedio = pesoMedio;
    }

    @Override
    public String toString() {
        return "Mascota{" + "codigo=" + codigo + ", raza=" + raza + ", colorPelo=" + colorPelo + ", fechaNacimiento=" + fechaNacimiento + 
                
                ", pesoMedio=" + pesoMedio + ", pesoActual=" + pesoActual + '}';
    }
    

    


}

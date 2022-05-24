
package herenciacongeladosapp;
import java.time.LocalDate;
import java.time.Month;

public class Fecha {
    
    public LocalDate generarFechaEnvase(){
        return LocalDate.now();
    }
    public LocalDate generarFechaCaduca(){
        return LocalDate.of(2021, Month.DECEMBER, 15);
    }
}

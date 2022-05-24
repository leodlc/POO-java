/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciacongeladosv2app;
import java.time.LocalDate;
import java.time.Month;
/**
 *
 * @author AsrockLeo
 */
public class Fecha {
    public LocalDate generarFechaEnvase(){
        return LocalDate.now();
    }
    public LocalDate generarFechaCaduca(){
        return LocalDate.of(2021, Month.NOVEMBER, 15);
    }
}

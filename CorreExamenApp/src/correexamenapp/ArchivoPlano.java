
package correexamenapp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class ArchivoPlano {
    public void crearMascotaArchivo(Mascota a) {
        try {
            File f = new File("calendarioVacunacion.txt");
            FileWriter fw;
            BufferedWriter bw;
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);

            if (f.createNewFile()==false) {
                bw.newLine();
                bw.write(a.getCodigo()+ "%" +"24/06/2021"+ "%" + "Fiebre Aftosa");
            } else {
                f.createNewFile();
                bw.write(a.getCodigo()+ "%" +"24/11/2020"+ "%" + "Fiebre Aftosa");
            }
            bw.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }

}

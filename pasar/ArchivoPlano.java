
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
                bw.write(a.getCodigo()+ "%" +"10/11/2020"+ "%" + "tetanos");
            } else {
                f.createNewFile();
                bw.write(a.getCodigo()+ "%" +"10/11/2020"+ "%" + "tetanos");
            }
            bw.close();
        } catch (Exception e) {

        }
    }

}

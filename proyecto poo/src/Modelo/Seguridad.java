
package Modelo;

import Vista.FrmLoginGeneral;
import Vista.FrmPantallaPrincipalCliente;
import javax.swing.JOptionPane;


public class Seguridad extends FrmLoginGeneral {
    String res;
    public void validarCliente(String usuarios[],String user,String password,int intentos){
        boolean encontrado=false;
        for(int i=0;i<usuarios.length;i++){
            if(usuarios[i].equalsIgnoreCase(user)&&usuarios[i+1].equalsIgnoreCase(password)){
                res="Bienvenido "+user;
                encontrado=true;
                JOptionPane.showMessageDialog(null, res,"Inicio de Sesion cliente",JOptionPane.INFORMATION_MESSAGE);
                FrmPantallaPrincipalCliente ventanaPrincipalCliente = new FrmPantallaPrincipalCliente();
                ventanaPrincipalCliente.show();
                this.dispose();
                
                
                intentos=0;
               
                break;
                
            }
        }//fin para
        if(encontrado==false){
            res="Clave y/o usuarios erroneos "+intentos + " intentos fallidos";
            JOptionPane.showMessageDialog(null, res,"Inicio de Sesion",JOptionPane.INFORMATION_MESSAGE);
        }
        if(intentos>2){
            JOptionPane.showMessageDialog(null, "3 intentos fallidos, no podrá ingresa","Inicio de Sesion",JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
    }
}

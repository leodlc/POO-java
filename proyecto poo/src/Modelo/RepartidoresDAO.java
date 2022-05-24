
package Modelo;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Usuario1
 */
public class RepartidoresDAO {
    public void guardarRepartidores(Repartidores c){
        ConexionRepartidores con = new ConexionRepartidores();
        BasicDBObject documento = new BasicDBObject();
        documento.put("nombre", c.getNombre());
        documento.put("apellido", c.getApellido());
        documento.put("cedula", c.getCedula());
        documento.put("correo", c.getCorreo());
        documento.put("contraseña", c.getContraseña());
        documento.put("numPlaca", c.getNumeroDePlaca());
        con.coleccion.insert(documento);
    }
    
    
}

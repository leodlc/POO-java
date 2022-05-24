
package Modelo;

import com.mongodb.BasicDBObject;


public class ClientesDAO {
    public void guardarClientes(Clientes c){
        ConexionClientes con = new ConexionClientes();
        BasicDBObject documento = new BasicDBObject();
        documento.put("nombre", c.getNombre());
        documento.put("apellido", c.getApellido());
        documento.put("cedula", c.getCedula());
        documento.put("celular", c.getCelular());
        documento.put("correo",c.getCorreo());
        documento.put("contraseña", c.getContraseña());
        documento.put("direccion", c.getDireccion());
        con.coleccion.insert(documento);
    }
}

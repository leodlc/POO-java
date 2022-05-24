/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mongodb.BasicDBObject;

/**
 *
 * @author AsrockLeo
 */
public class ClienteDAO {

    public ClienteDAO() {
    }
    
    public void insertarCliente(Cliente c){
        Conexion con= new Conexion();
        BasicDBObject documento= new BasicDBObject();
        documento.put("id", c.getId());
        documento.put("nombre", c.getNombre());
        documento.put("edad", c.getEdad());
        con.colleccion.insert(documento);
    }
}

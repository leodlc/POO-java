/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mongodb.BasicDBObject;

/**
 *
 * @author Usuario1
 */
public class AdministradorDAO {
    public void guardarAdministrador(Administrador c){
        ConexionAdministrador con = new ConexionAdministrador();
        BasicDBObject documento = new BasicDBObject();
        documento.put("nombre", c.getNombre());
        documento.put("apellido", c.getApellido());
        documento.put("cedula", c.getCedula());
        documento.put("correo",c.getCorreo());
        documento.put("contraseña", c.getContraseña());
        con.coleccion.insert(documento);
    }
}

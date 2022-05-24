
package Modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 *
 * @author Usuario1
 */
public class ConexionAdministrador {
    DB baseDatos;
    DBCollection coleccion;
    BasicDBObject documento = new BasicDBObject();
    
    public ConexionAdministrador(){
        try{
            MongoClient mongo = new MongoClient("localhost",27017);
            baseDatos = mongo.getDB("usuarios");
            coleccion = baseDatos.getCollection("administrador");
            System.out.println("Conexion a base de datos exitoso");
        }catch(Exception e){
            
        }
    }
}

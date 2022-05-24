
package Modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;


public class ConexionClientes {
    DB baseDatos;
    DBCollection coleccion;
    BasicDBObject documento = new BasicDBObject();
    
    public ConexionClientes(){
        try{
            MongoClient mongo = new MongoClient("localhost",27017);
            baseDatos = mongo.getDB("usuarios");
            coleccion = baseDatos.getCollection("clientes");
            System.out.println("Conexion a base de datos exitoso");
        }catch(Exception e){
            
        }
    }
}

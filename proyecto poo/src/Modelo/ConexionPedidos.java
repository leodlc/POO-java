
package Modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;


public class ConexionPedidos {
    DB baseDatos;
    DBCollection coleccion;
    BasicDBObject documento = new BasicDBObject();
    
    public ConexionPedidos(){
        try{
            MongoClient mongo = new MongoClient("localhost",27017);
            baseDatos = mongo.getDB("Usuarios");
            coleccion = baseDatos.getCollection("pedidos");
            System.out.println("Conexion a base de datos exitoso");
        }catch(Exception e){
            
        }
    }
}

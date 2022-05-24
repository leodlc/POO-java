
package Modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;


public class ConexionRepartidores {
    DB baseDatos;
    DBCollection coleccion;
    BasicDBObject documento = new BasicDBObject();
    public ConexionRepartidores(){
        try{
            MongoClient mongo = new MongoClient("localhost",27017);
            baseDatos = mongo.getDB("usuarios");
            coleccion = baseDatos.getCollection("repartidores");
            System.out.println("Conexion a base de datos exitoso(Repartidor)");
        }catch(Exception e){
            
        }
    }
}

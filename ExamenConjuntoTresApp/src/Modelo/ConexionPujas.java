/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 *
 * @author AsrockLeo
 */
public class ConexionPujas {
    DB baseDatos;
    DBCollection coleccion;
    BasicDBObject documento= new BasicDBObject() ;
    public ConexionPujas()
    {
        try
        {
            MongoClient mongo= new MongoClient("localhost",27017);
            baseDatos=mongo.getDB("Subasta");
            coleccion= baseDatos.getCollection("Pujas");
            System.out.println("Conexion a base de datos exitoso");
        }
        catch(Exception e)
        {
            
        }
    }
}

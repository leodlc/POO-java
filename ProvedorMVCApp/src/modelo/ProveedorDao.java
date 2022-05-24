/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author AsrockLeo
 */
public class ProveedorDao {
    
    public void insertarProveedor(Proveedor p){
        Conexion con= new Conexion();
        BasicDBObject documento= new BasicDBObject();
        documento.put("nombre", p.getNombre());
        documento.put("pais",p.getPais());
        con.coleccion.insert(documento);
    }
    
     public ArrayList<Proveedor> obtenerProveedores()
    //public void obtenerPersonas()
    {
        ArrayList <Proveedor> listProv= new ArrayList();
        Proveedor p1;
        Conexion con= new Conexion();
      
        DBCursor cursor= con.coleccion.find();
       
        while (cursor.hasNext())
        {
           p1= new Proveedor((String) cursor.next().get("nombre"), (String) cursor.curr().get("pais"));
           //System.out.println(p1.toString());
           listProv.add(p1);
        }
        //System.out.println("Tamaño de lista"+listProv.size());
        return listProv;
    }
     
    public void eliminarProveedor(String nombre)
    {
        Conexion con2= new Conexion(); 
        con2.coleccion.remove(new BasicDBObject().append("nombre", nombre));
        //objCon.colleccion.remove(new BasicDBObject().append("nombre", nombre));
    }
}

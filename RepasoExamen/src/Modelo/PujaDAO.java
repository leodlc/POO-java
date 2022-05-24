/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;

/**
 *
 * @author AsrockLeo
 */
public class PujaDAO {
    public void guardarPuja(Puja p){
        ConexionSubasta con = new ConexionSubasta();
        BasicDBObject documento = new BasicDBObject();
        documento.put("Puja inicial",p.pujaRealizada);
        documento.put("Nombre del pujador",p.nombrePujador);
        documento.put("Puja realizada",p.pujaInicial);
        con.coleccion.insert(documento);
        
    }
    
    public ArrayList<Puja> obtenerPuja(){
        ArrayList <Puja> listProv= new ArrayList();
        Puja p1;
        ConexionSubasta con= new ConexionSubasta();
        DBCursor cursor= con.coleccion.find();
        while (cursor.hasNext())
        {
           p1=new Puja((double) cursor.next().get("Puja Inicial"),(double) cursor.curr().get("Puja Realizada"),(String) cursor.curr().get("Nombre del pujador"));
           //System.out.println(p1.toString());
           listProv.add(p1);
        }
        //System.out.println("Tamaño de lista"+listProv.size());
        return listProv;
    }
        
    
}

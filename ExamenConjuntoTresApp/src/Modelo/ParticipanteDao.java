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
public class ParticipanteDao {
    public void insertarParticipante(Participante p){
        ConexionSubasta con= new ConexionSubasta();
        BasicDBObject documento= new BasicDBObject();
        documento.put("nombre", p.getNombre());
        documento.put("puja aportada",p.pujaAportada);
        
        con.coleccion.insert(documento);
    }

    
     public ArrayList<Participante> obtenerParticipantes()
    //public void obtenerPersonas()
    {
        ArrayList <Participante> listProv= new ArrayList();
        Participante p1;
        ConexionSubasta con= new ConexionSubasta();
      
        DBCursor cursor= con.coleccion.find();
       
        while (cursor.hasNext())
        {
           p1= new Participante((double)cursor.next().get("puja aportada"), (String) cursor.curr().get("nombre"));
           //System.out.println(p1.toString());
           listProv.add(p1);
        }
        //System.out.println("Tamaño de lista"+listProv.size());
        return listProv;
    }
     

}

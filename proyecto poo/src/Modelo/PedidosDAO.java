
package Modelo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCursor;
import java.util.ArrayList;

/**
 *
 * @author Usuario1
 */
public class PedidosDAO {
    public void guardarPedidos(Pedidos c){
        ConexionPedidos con = new ConexionPedidos();
        BasicDBObject documento = new BasicDBObject();
        documento.put("nombre del cliente", c.getNombreCliente());
        documento.put("Descripcion del pedido", c.getDescripcionPedido());
        documento.put("Direccion del cliente", c.getDireccionPedido());
        con.coleccion.insert(documento);
    }
    public ArrayList<Pedidos> obtenerPedidos()
    //public void obtenerPersonas()
    {
        ArrayList <Pedidos> listProv= new ArrayList();
        Pedidos p1;
        ConexionPedidos con= new ConexionPedidos();

        DBCursor cursor= con.coleccion.find();

        while (cursor.hasNext())
        {
           p1= new Pedidos((String) cursor.next().get("nombre del cliente"), (String) cursor.curr().get("Descripcion del pedido"), (String) cursor.curr().get("Direccion del cliente"));
           //System.out.println(p1.toString());
           listProv.add(p1);
        }
        //System.out.println("Tamaño de lista"+listProv.size());
        return listProv;
    }
}

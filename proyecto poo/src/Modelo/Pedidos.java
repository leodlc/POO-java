/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usuario1
 */
public class Pedidos {
    private String nombreCliente;
    private String descripcionPedido;
    private String direccionPedido;

    public Pedidos(String nombreCliente, String descripcionPedido, String direccionPedido) {
        this.nombreCliente = nombreCliente;
        this.descripcionPedido = descripcionPedido;
        this.direccionPedido = direccionPedido;
    }

    public Pedidos() {
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDescripcionPedido() {
        return descripcionPedido;
    }

    public void setDescripcionPedido(String descripcionPedido) {
        this.descripcionPedido = descripcionPedido;
    }

    public String getDireccionPedido() {
        return direccionPedido;
    }

    public void setDireccionPedido(String direccionPedido) {
        this.direccionPedido = direccionPedido;
    }

    @Override
    public String toString() {
        return "Pedidos{" + "nombreCliente=" + nombreCliente + ", descripcionPedido=" + descripcionPedido + ", direccionPedido=" + direccionPedido + '}';
    }  
}

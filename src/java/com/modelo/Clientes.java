package com.modelo;
// Generated 27/12/2023 10:27:53 AM by Hibernate Tools 4.3.1



/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable {


     private Integer id;
     private String nombre;
     private String apellido;
     private String producto;
     private double precioUnitario;

    public Clientes() {
    }

    public Clientes(String nombre, String apellido, String producto, double precioUnitario) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.producto = producto;
       this.precioUnitario = precioUnitario;
    }

    public Clientes(Integer id, String nombre, String apellido, String producto, double precioUnitario) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.producto = producto;
        this.precioUnitario = precioUnitario;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getProducto() {
        return this.producto;
    }
    
    public void setProducto(String producto) {
        this.producto = producto;
    }
    public double getPrecioUnitario() {
        return this.precioUnitario;
    }
    
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String toString() {
        return "Clientes{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", producto=" + producto + ", precioUnitario=" + precioUnitario + '}';
    }
}



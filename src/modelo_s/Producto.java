/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo_s;

/**
 *
 * @author ale05
 */
public class Producto {
    private int ID;
    private String nombre;
    private double precio;
    private double existencia;

    public Producto() {
    }
    
    
    public Producto(int ID, String nombre, double precio, double existencia) {
        this.ID = ID;
        this.nombre = nombre;
        this.precio = precio;
        this.existencia = existencia;
    }

    public double getExistencia() {
        return existencia;
    }

    public void setExistencia(double existencia) {
        this.existencia = existencia;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto{" + "ID=" + ID + ", nombre=" + nombre + ", precio=" + precio + ", existencia=" + existencia + '}';
    }
    
    
    
}


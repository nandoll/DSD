package com.upc.dsd;

public class Producto {
    private Long codigo;
    private String descripcion;
    private double precio;
    private int stock;

    /*Crear métodos para acceder a las propiedades getters and setter*/

    //Metodos adicionales para funcionalidades
    public double calcularIGV(){
        return precio * 0.18;
    }

    public double calcularNeto(){
        double total = precio + calcularIGV();
        return total;
    }
    //END

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

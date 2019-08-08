package com.upc.dsd.negocio;

import com.upc.dsd.Producto;

public class Negocio {


    //Metodos adicionales para funcionalidades
    public double calcularIGV(Producto producto){
        return producto.getPrecio() * 0.18;
    }

    public double calcularNeto(Producto producto){
        double total = producto.getPrecio() + calcularIGV(producto);
        return total;
    }
    public double calcularBono(Producto producto){
        if(producto.getPrecio()>100){
            return producto.getPrecio()*0.10;
        }
        else return 0;
    }
    //END


}

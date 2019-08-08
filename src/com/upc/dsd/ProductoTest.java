package com.upc.dsd;

import org.junit.Assert;

import static org.junit.Assert.*;

public class ProductoTest {

    @org.junit.Test
    public void calcularIGV() {
        Producto producto = new Producto();
        producto.setCodigo(1234L);
        producto.setDescripcion("Café");
        producto.setStock(100);
        producto.setPrecio(10);

        /*Ahora para evaluar se debe de hacer un Assert (Aserción)*/
        Assert.assertEquals(1.8, producto.calcularIGV() , 0.01);
    }

    @org.junit.Test
    public void calcularNeto() {
    }
}
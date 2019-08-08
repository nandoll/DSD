package com.upc.dsd.negocio;

import com.upc.dsd.Producto;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class NegocioTest {

    @Test
    public void calcularIGV() {
        Negocio negocio = new Negocio();
        Producto producto = new Producto();
        producto.setCodigo(200L);
        producto.setPrecio(10);
        producto.setStock(100);
        producto.setDescripcion('Tallarines');
        Assert.assertEquals(18.0, negocio.calcularIGV(producto), 0.00);
    }

    @Test
    public void calcularNeto() {
    }

    @Test
    public void calcularBono() {
    }
}
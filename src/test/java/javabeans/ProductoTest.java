package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ProductoTest {

    @Test
    void multiplicarReales() {
        assertEquals(15, Producto.multiplicarReales(2,7.5), "El resultado debería ser 15");
    }

    @Test
    void multiplicarEnteros() {
        assertEquals(10, Producto.multiplicarReales(2,5),"El resultado esperado es 10");
    }

    @Test
    void multiplicarTriple() {
        assertEquals(15, Producto.multiplicarTriple(1,2,7.5),"El resultado debe ser 15");
    }

    @Test
    void potencia() {
        assertEquals(9, Producto.potencia(3,2),"El resultado esperado es 9");
    }
}
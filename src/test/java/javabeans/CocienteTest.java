package javabeans;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CocienteTest {

    @Test
    void dividirReales() {
        assertEquals(2, Cociente.dividirReales(4.0, 2.0),"El resultado esperado es 2");
    }

    //El
    @Test
    void dividirEnteros() {
        assertEquals(5, Cociente.dividirEnteros(10,2),"El resultado esperando es 5");
    }

    //El número enverso de un número
    @Test
    void inverso() {
        assertEquals(0.5, Cociente.inverso(2.0),"El resultado esperado es 0.5");

    }

    // Aqui tenemos la raíz cuadrada de un número
    @Test
    void raiz() {
        assertEquals(2,Cociente.raiz(4),"El resultado esperando es 2");
    }
}
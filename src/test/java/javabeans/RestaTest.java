package javabeans;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RestaTest {

    private Resta acumulador;

    @BeforeEach
    void setUp() {
        acumulador = new Resta();
    }

    @Test
    void restarInt() {
        assertEquals(10, Resta.restar(11, 1), "La resta debe dar 10");
    }

    @Test
    void restarDouble() {
        assertEquals(10.5, Resta.restar(11, 0.5), "La resta debe dar 10.5");
    }

    @Test
    void restar3Double() {
        assertEquals(10, Resta.restar(20, 4.5, 5.5), "La resta debe dar 10");
    }

}
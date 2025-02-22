package javabeans;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RestaTest {

    @BeforeAll
    static void setUpBeforeClass(){
        Resta.resetAcumulador();
    }

    @AfterAll
    static void tearDownAfterClass(){
        Resta.resetAcumulador();
    }

    @ParameterizedTest
    @CsvSource({
            "3, 4, -1, 'La resta debe dar -1'",
            "7, 5, 2, 'La resta debe dar 2'",
    })

    void restar2Int(int num1, int num2, int expectedInt, String descripcion) {

        assertEquals(expectedInt,Resta.restar(num1,num2),descripcion);
    }

    @ParameterizedTest
    @CsvSource({
            "3.5, 4, -0.5, 'La resta debe dar -0.5'",
            "7.2, 5, 2.2, 'La resta debe dar 2.2'",
    })

    void restar2Double(double num1, double num2, double expectedDouble, String descripcion) {

        assertEquals(expectedDouble,Resta.restar(num1,num2),descripcion);
    }

    @ParameterizedTest
    @CsvSource({
            "20, 4.5, 5, 10.5, 'La resta debe dar 10'",
            "7.2, 5, 2.2, 0, 'La resta debe dar 0'",
    })

    void restar3Double(double num1, double num2, double num3, double expectedDouble, String descripcion) {

        assertEquals(expectedDouble,Resta.restar(num1, num2, num3),descripcion);
    }

    @Test
    void restaAcumulada() {
        double acumulado = 0;
        for (int i=1;i<=4;i++){
            acumulado = Resta.restaAcumulada(1);
        }
        assertEquals(-4, acumulado,"EL valor acumulado debe ser -4");
    }
}
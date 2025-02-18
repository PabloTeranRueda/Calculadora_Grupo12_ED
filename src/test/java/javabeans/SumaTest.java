package javabeans;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {
    // Restablece el contador a 0 antes y despu&eacute;s de los test.
    @BeforeAll
    static void setUpBeforeClass(){
            Suma.resetAcumulador();
    }

    @AfterAll
    static void tearDownAfterClass(){
        Suma.resetAcumulador();
    }

    /*
    Comprueba la operaci&oacute;n sumaDosReales con n&uacute;mero positivo y negativo.
    Si es negativo, debe retornar '-1', que se traducir&aacute; en una excepci&oacute;n
    al intentar imprimir el resultado en Main
    */
    @ParameterizedTest
    @CsvSource({
            "1.5, 2.5, 4, 'La suma debe dar 4'",
            "-1.5, 2.5, -1, 'La suma debe dar -1'",
    })

    void sumaDosReales(double numero1, double numero2, double resultadoEsperado, String descripcion) {

        assertEquals(resultadoEsperado,Suma.sumaDosReales(numero1,numero2),descripcion);
    }

    /*
    Comprueba la operaci&oacute;n sumaDosEnteros con n&uacute;mero positivo y negativo.
    Si es negativo, debe retornar '-1', que se traducir&aacute; en una excepci&oacute;n
    al intentar imprimir el resultado en Main
    */
    @ParameterizedTest
    @CsvSource({
            "2, 3, 5, 'La suma debe dar 5'",
            "-2, 3, -1, 'La suma debe dar -1'",
    })
    void sumaDosEnteros(int numero1, int numero2, int resultadoEsperado, String descripcion) {
        assertEquals(resultadoEsperado,Suma.sumaDosEnteros(numero1, numero2),descripcion);
    }

    /*
    Comprueba la operaci&oacute;n sumaTresReales con n&uacute;mero positivo y negativo.
    Si es negativo, debe retornar '-1', que se traducir&aacute; en una excepci&oacute;n
    al intentar imprimir el resultado en Main
    */
    @ParameterizedTest
    @CsvSource({
            "1.5, 2.5, 3.5, 7.5, 'La suma debe dar 7.5'",
            "-1.5, 2.5, 3.5, -1, 'La suma debe dar -1'",
    })
    void sumaTresReales(double numero1, double numero2, double numero3, double resultadoEsperado, String descripcion) {
        assertEquals(resultadoEsperado,Suma.sumaTresReales(numero1,numero2,numero3),descripcion);
    }

    /*
    Comprueba la operaci&oacute;n sumaAcumulada con n&uacute;mero positivo y negativo.
    Si es negativo, debe retornar '-1', que se traducir&aacute; en una excepci&oacute;n
    al intentar imprimir el resultado en Main
    */
    @ParameterizedTest
    @CsvSource({
            "5, 45, 'La suma debe dar 45'",
            "-5, -1, 'La suma debe dar -1'",
    })
    void sumaAcumulada(double numero, double resultadoEsperado, String descripcion) {
        double total = 0;

        for (int i=0;i<=5;i++){
            total = Suma.sumaAcumulada(numero);
            numero++;}
        assertEquals(resultadoEsperado, total, descripcion);
        }
    }
package javabeans;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class SumaTest {

    @Test
    void sumaDosReales() {

        assertEquals(4,Suma.sumaDosReales(1.5,2.5),"La suma debe dar 4");
    }

    @Test
    void sumaDosEnteros() {
        assertEquals(5,Suma.sumaDosEnteros(2,3),"La suma debe dar 5");
    }

    @Test
    void sumaTresReales() {
        assertEquals(7.5,Suma.sumaTresReales(1.5,2.5,3.5),"La suma debe dar 7.5");
    }

    @ParameterizedTest
    @ValueSource(ints = {5, -5})
    void sumaAcumulada(int argumento) {
        double total = 0;
        int numero = argumento;
        for (int i=0;i<=5;i++){
            total = Suma.sumaAcumulada(numero);
            numero++;}
        Suma.resetAcumulador();
        switch (argumento){
            case 5:
                assertEquals(45, total, "La suma debe dar 45");
                break;
            case -5:
                assertEquals(-1, total, "La suma debe dar -45");
                break;


        }
    }
}
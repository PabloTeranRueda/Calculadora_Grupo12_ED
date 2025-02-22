package javabeans;



/**
 *Esta clase implementará todos los métodos que están relacionados con la división de la calculadora. Esta
 *clase tendrá los siguientes métodos:
 *1. División de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la solución.
 *2. División de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la
 *solución.
 *3. Inverso de un número real, tendrá un parámetro de entrada y uno de salida que será la solución.
 *4. Raíz de un número, tendrá un parámetro de entra y uno de salida que será la solución.
 *  @author Javier Rodríguez Núñez
 *  @version 0.2
 *  @see org.example.Main
 *
 */


public class Cociente {

    /**
     * Divide dos números reales.
     * @param a Dividendo real.
     * @param b Divisor real.
     * @return Resultado de la división.
     */
    public static double dividirReales(double a, double b) {
        if (b == 0) {
        }
        return a / b;
    }

    /**
     * Divide dos números enteros.
     *
     * @param a Dividendo entero.
     * @param b Divisor entero.
     * @return Resultado de la división.
     */
    public static int dividirEnteros(int a, int b) {
        if (b == 0) {
        }
        return a / b;
    }

    /**
     * Calcula el inverso de un número real.
     *
     * @param a Número real.
     * @return Inverso del número.
     */
    public static double inverso(double a) {
        if (a == 0) {
        }
        return 1 / a;
    }

    /**
     * Calcula la raíz cuadrada de un número.
     *
     * @param a Número del que se quiere calcular la raíz cuadrada.
     * @return Raíz cuadrada del número.
     */
    public static double raiz(double a) {
        if (a < 0) {
        }
        return Math.sqrt(a);
    }

}


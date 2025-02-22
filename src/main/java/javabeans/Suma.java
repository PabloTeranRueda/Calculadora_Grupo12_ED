package javabeans;

/**
 * Clase con m&eacute;todos para sumar n&uacute;meros enteros y reales.
 * @version 0.2
 * @author Pablo Ter&aacute;n Rueda (Github: PabloTeranRueda).
 * */

public class Suma {

    private static double acumulador = 0;

    /**
     * Restablece el acumulador a cero.
     */
    public static void resetAcumulador() {
        acumulador = 0;
    }

    /**
     * Suma dos n&uacute;meros reales.
     *
     * @param numero1 Primer n&uacute;mero.
     * @param numero2 Segundo n&uacute;mero.
     * @return - Suma de dos n&uacute;meros reales.
     */
    public static double sumaDosReales(double numero1, double numero2) {
        // Revisa que no haya números negativos
        if (numero1 <0 || numero2 <0)  { return -1;}
        return numero1 + numero2;
    }

    /**
     * Suma dos n&uacute;meros enteros.
     *
     * @param numero1 Primer n&uacute;mero.
     * @param numero2 Segundo n&uacute;mero.
     * @return - Suma de dos n&uacute;meros enteros.
     */
    public static int sumaDosEnteros(int numero1, int numero2) {
        // Revisa que no haya números negativos
        if (numero1 <0 || numero2 <0)  { return -1;}
        return numero1 + numero2;
    }

    /**
     * Suma dos n&uacute;meros reales.
     *
     * @param numero1 Primer n&uacute;mero.
     * @param numero2 Segundo n&uacute;mero.
     * @param numero3 Tercer n&uacute;mero.
     * @return - Suma de dos n&uacute;meros reales.
     */
    public static double sumaTresReales(double numero1, double numero2, double numero3) {
        // Revisa que no haya números negativos
        if (numero1 <0 || numero2 <0 || numero3 <0)  { return -1;}
        return numero1 + numero2 + numero3;
    }

    /**
     * Suma dos n&uacute;meros: uno es acumulador, otro es el que se pase como par&aacute;metro.
     *
     * @param numero N&uacute;mero a sumar al acumulador.
     * @return - Suma del n&uacute;mero con el acumulador.
     */
    public static double sumaAcumulada(double numero) {
        // Revisa que no haya números negativos
        if (numero <0)  {
            acumulador = -1;
            return -1;}
        acumulador += numero;
        return acumulador;
        }
    }

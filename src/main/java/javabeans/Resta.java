package javabeans;
/**
 * Clase que implementa operaciones de resta.
 * @author Andrés Bella (GitHub: andresBella96)
 * @version 1.0
 * @see org.example.Main
 */
public class Resta {

    private static double acumulador = 0;

    public Resta() {
        this.acumulador = 0;
    }

    /**
     * Resta dos números enteros.
     * @param a Primer número.
     * @param b Segundo número.
     * @return Resultado de la resta.
     */
    public static double restar(int a, int b){
        return a - b;
    }

    /**
     * Resta dos números reales.
     * @param a Primer numero.
     * @param b Segundo número.
     * @return Resultado de la resta.
     */
    public static double restar(double a, double b) {
        return a - b;
    }

    /**
     * Resta tres números reales.
     * @param a Primer número.
     * @param b Segundo número.
     * @param c Tercer número.
     * @return Resultado de la resta.
     */
    public static double restar(double a, double b, double c) {
        return a - b - c;
    }

    /**
     * Acumula un valor restado al valor guardado.
     * @param valor Número a restar del acumulado.
     */
    public static double restaAcumulada(double valor) {
        acumulador += valor;
        return acumulador;
    }

    /**
     * Restablece el acumulador a cero.
     */
    public static void resetAcumulador() {
        acumulador = 0;
    }

}



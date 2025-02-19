package javabeans;



 /**
  Esta clase implementará todos los métodos que están relacionados con la multiplicación de la calculadora.
  Esta clase tendrá los siguientes métodos:
  1. Producto de dos números reales, tendrá 2 parámetros de entrada y uno de salida que será la
  solución.
  2. Producto de dos números enteros, tendrá 2 parámetros de entrada y uno de salida que será la
  solución.
  3. Producto de tres números reales, tendrá 3 parámetros de entrada y uno de salida que será la
  solución.
  4. Potencia, tendrá dos parámetros de entrada (base y exponente) y uno de salida que será la solución
  *  @author Javier Rodríguez Núñez
  *  @version 0.3
  *  @see Calculadora
  *
 */

public class Producto {

     /**
     * Multiplica dos números reales.
     *
     * @param a Primer número real.
     * @param b Segundo número real.
     * @return Resultado de la multiplicación.
     */
    public  static double multiplicarReales(double a, double b) {
        return a * b;
    }

    /**
     * Multiplica dos números enteros.
     *
     * @param a Primer número entero.
     * @param b Segundo número entero.
     * @return Resultado de la multiplicación.
     */
    public static int multiplicarEnteros(int a, int b) {
        return a * b;
    }

    /**
     * Multiplica tres números reales.
     *
     * @param a Primer número real.
     * @param b Segundo número real.
     * @param c Tercer número real.
     * @return Resultado de la multiplicación.
     */
    public static double multiplicarTriple(double a, double b, double c) {
        return a * b * c;
    }

    /**
     * Calcula la potencia de un número.
     * @param base Base de la potencia.
     * @param exponente Exponente al que se eleva la base.
     * @return Resultado de la potencia.
     */
    public static double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }
}

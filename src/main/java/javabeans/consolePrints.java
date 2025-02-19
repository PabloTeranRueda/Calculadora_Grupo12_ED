package javabeans;

/**
 * Clase que agrupa los textos que se imprimir&aacute;n en pantalla.
 */

public class consolePrints {

    /**
     * Primera pantalla al iniciar el programa.
     *
     * @return Representaci&oacute;n de una calculadora, las distintas posibles operaciones y la opci&oacute;n de salir.
     */
    public static String getInitView(){
        return """
                 _____________________
                |  _________________  |
                | |                 | |\t+ : Sumar
                | |_________________| |\t- : Restar
                |  ___ ___ ___   ___  |\tx : Multiplicar
                | | 7 | 8 | 9 | | + | |\t/ : Dividir
                | |___|___|___| |___| |\tS : Salir
                | | 4 | 5 | 6 | | - | |
                | |___|___|___| |___| |
                | | 1 | 2 | 3 | | x | |
                | |___|___|___| |___| |
                | | . | 0 | = | | / | |
                | |___|___|___| |___| |
                |_____________________|
                
                Introduce la operación y pulsa enter:
                """;
    }

    /**
     * Submen&uacute; de la operaci&oacute;n Suma.
     *
     * @return Posibles operaciones de Suma.
     */
    public static String getAddView(){
        return """
                \u00BFQu\u00E9 tipo de suma quieres hacer?
                1 - Sumar dos n\u00FAmeros reales
                2 - Sumar dos n\u00FAmeros enteros
                3 - Sumar tres n\u00FAmeros reales
                4 - Sumar concatenadamente n\u00FAmeros
                """;
    }

    /**
     * Submen&uacute; de la operaci&oacute;n Cociente
     *
     * @return Posibles operaciones de Cociente
     */
    public static String getdivisionView(){
        return """
                \u00BFQu\u00E9 tipo de suma quieres hacer?
                1 - Dividir dos n\u00FAmeros reales
                2 - Dividir dos n\u00FAmeros enteros
                3 - El inverso de un numero 
                4 - La raiz cuadrada de un nuermo
                """;
    }
    /**
     * @return String que solicita el siguiente n&uacute;mero con el que operar.
     */
    public static String nextNumber(){
        return """
                Dime un número:
                """;
    }

    /**
     * @return Informa de la tecla que se debe introducir para terminar una operaci&oacute;n o salir del programa.
     */
    public static String exitKey(){
        return """
                (Pulsa '=' para terminar la operacion)
                """;
    }

    /**
     * @return String que introduce el resultado de una operaci&oacute;n.
     */
    public static String resultSentence(){
        return """
                El resultado de la operacion es:
                """;
    }
}

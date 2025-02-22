package org.example;
import javabeans.Producto;
import javabeans.Suma;
import javabeans.consolePrints;
import javabeans.Cociente;

import java.util.Scanner;
/**
 * Clase principal.
 */
public class Main {
    /**
     * Crea una UI en consola en la que el usuario puede navegar entre distintos men&uacute;s para
     * realizar las distintas operaciones.
     *
     * @param args
     * @throws IllegalArgumentException en caso de que el input introducido por el usuario no sea el esperado.
     * @see Suma
     * @see consolePrints
     */
    public static void main(String[] args) {
        boolean calculadoraOn = true;
        // Crea el Scanner que se usará en el programa.
        Scanner scan = new Scanner(System.in);

        do {
            // Pide el tipo de operación.
            System.out.println(consolePrints.getInitView());
            String operationType = scan.next().toLowerCase();

            switch (operationType){
                case "+": {
                    // Pide el tipo de suma
                    System.out.println(consolePrints.getAddView());
                    int subOperationType = scan.nextInt();

                    switch (subOperationType) {
                        case 1: {
                            // Pide dos números reales
                            System.out.println(consolePrints.nextNumber());
                            double num1 = scan.nextDouble();

                            System.out.println(consolePrints.nextNumber());
                            double num2 = scan.nextDouble();

                            // Imprime la suma en consola o lanza un error si se ha introducido un número negativo
                            handleResult(Suma.sumaDosReales(num1, num2));
                            break;
                        }
                        case 2: {
                            // Pide dos números enteros
                            System.out.println(consolePrints.nextNumber());
                            int num1 = scan.nextInt();

                            System.out.println(consolePrints.nextNumber());
                            int num2 = scan.nextInt();

                            // Imprime la suma en consola o lanza un error si se ha introducido un número negativo
                            handleResult(Suma.sumaDosEnteros(num1, num2));
                            break;
                        }
                        case 3: {
                            // Pide tres números reales
                            System.out.println(consolePrints.nextNumber());
                            double num1 = scan.nextDouble();

                            System.out.println(consolePrints.nextNumber());
                            double num2 = scan.nextDouble();

                            System.out.println(consolePrints.nextNumber());
                            double num3 = scan.nextDouble();

                            // Imprime la suma en consola o lanza un error si se ha introducido un número negativo
                            handleResult(Suma.sumaTresReales(num1, num2, num3));
                            break;
                        }
                        case 4: {
                            // Suma acumulada
                            String input; // Flag variable

                            do {
                                // Pide números hasta que se escriba '='
                                System.out.println(consolePrints.nextNumber() + consolePrints.exitKey());
                                input = scan.next();
                                try {
                                    // Revisa si es un double
                                    double nextDouble = Double.parseDouble(input);

                                    /*
                                    Imprime la suma en consola
                                    o lanza un error si se ha introducido un número negativo
                                    */
                                    handleResult(Suma.sumaAcumulada(nextDouble));

                                } catch (NumberFormatException e2) {
                                    // Revisa si es la tecla para salir
                                    if (input.equalsIgnoreCase("=")) {
                                        continue;
                                    } else {
                                        // Si no es nada de lo anterior, crea un error
                                        Suma.resetAcumulador();
                                        throw new IllegalArgumentException(
                                                "La opci\u00F3n debe ser un n\u00FAmero o '=' para salir"
                                        );
                                    }
                                }
                            }
                            while (!input.equalsIgnoreCase("="));
                            Suma.resetAcumulador();
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Opci\u00F3n no valida");
                        }
                    }
                    break;
                }

                case "-": {
                    break;
                }

                case "x": {
                    // Pide el tipo de multiplicación
                    System.out.println(consolePrints.getMultiplyView());
                    int subOperationType = scan.nextInt();

                    switch (subOperationType) {
                        case 1: {
                            // Pide dos números reales
                            System.out.println(consolePrints.nextNumber());
                            double num1 = scan.nextDouble();

                            System.out.println(consolePrints.nextNumber());
                            double num2 = scan.nextDouble();

                            System.out.println(Producto.multiplicarReales(num1,num2));
                            break;
                        }
                        case 2: {
                            // Pide dos números enteros
                            System.out.println(consolePrints.nextNumber());
                            int num1 = scan.nextInt();

                            System.out.println(consolePrints.nextNumber());
                            int num2 = scan.nextInt();

                            System.out.println(Producto.multiplicarEnteros(num1,num2));
                            break;
                        }
                        case 3: {
                            // Pide tres números reales
                            System.out.println(consolePrints.nextNumber());
                            double num1 = scan.nextDouble();

                            System.out.println(consolePrints.nextNumber());
                            double num2 = scan.nextDouble();

                            System.out.println(consolePrints.nextNumber());
                            double num3 = scan.nextDouble();

                            System.out.println(Producto.multiplicarTriple(num1,num2,num3));
                            break;
                        }
                        case 4: {
                            // Pide dos números enteros
                            System.out.println(consolePrints.nextNumber());
                            int num1 = scan.nextInt();

                            System.out.println(consolePrints.nextNumber());
                            int num2 = scan.nextInt();

                            System.out.println(Producto.potencia(num1,num2));
                            break;
                        }
                        default: {
                            throw new IllegalArgumentException("Opci\u00F3n no valida");
                        }
                    }
                    break;
                }

                case "/": {
                    break;
                }

                case "s": {
                    calculadoraOn = false;
                    break;
                }

                default: {
                    calculadoraOn = false;
                    throw new IllegalArgumentException("Opci\u00F3n no v\u00E1lida");}
            }
        }
        while (calculadoraOn);
        // Ya no hace falta leer más, por lo que se cierra el Scanner.
        scan.close();
    }

    /**
     * Lanza un error si el n&uacute;mero introducido es negativo o imprime el resultado.
     * @param resultado resultado de una operaci&oacute;n.
     * @throws IllegalArgumentException en caso de que se haya introducido un número negativo.
     */
    public static void handleResult(double resultado) {

        if (resultado < 0) {
            throw new IllegalArgumentException("No puedes usar números negativos");
        }
        System.out.println(consolePrints.resultSentence() + " "
                + resultado);
    }
}
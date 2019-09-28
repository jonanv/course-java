package com.course;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*String saludar = "Saludos desde Java en IntelliJ IDEA";
        String nombre = "Giovanni";
        String apellido = "Vargas";

        System.out.println(saludar);
        System.out.println(nombre + " " + apellido);
        System.out.println("Nueva línea :  \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" +  nombre);
        System.out.println("Retorno de carro: \r" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");
        System.out.println("Comilla simple: '" + nombre + "'");
        System.out.println("Comilla double: \"" + nombre + "\"");

        System.out.println("Saludos");
        System.out.print("Dios");
        System.out.println("Saludos nuevamente");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre de usuario: ");
        String usuario = scanner.nextLine();
        System.out.println(usuario);*/

        byte byteVar = 127;
        System.out.println("byte: " + byteVar);
        System.out.println("bits tipo byte: " + Byte.SIZE);
        System.out.println("bytes tipo byte: " + Byte.BYTES);
        System.out.println("valor mínimo tipo byte: " + Byte.MIN_VALUE);
        System.out.println("valor máximo tipo byte: " + Byte.MAX_VALUE);
        System.out.println();

        short shorVar = 32767;
        System.out.println("short: " + shorVar);
        System.out.println("bits tipo short: " + Short.SIZE);
        System.out.println("bytes tipo short: " + Short.BYTES);
        System.out.println("valor mínimo tipo short: " + Short.MIN_VALUE);
        System.out.println("valor máximo tipo short: " + Short.MAX_VALUE);
        System.out.println();

        int intVar = 33333333;
        System.out.println("int: " + intVar);
        System.out.println("bits tipo int: " + Integer.SIZE);
        System.out.println("bytes tipo int: " + Integer.BYTES);
        System.out.println("valor mínimo tipo int: " + Integer.MIN_VALUE);
        System.out.println("valor máximo tipo int: " + Integer.MAX_VALUE);
        System.out.println();

        long longVar = 9223372036854775807L;
        System.out.println("long: " + longVar);
        System.out.println("bits tipo long: " + Long.SIZE);
        System.out.println("bytes tipo long: " + Long.BYTES);
        System.out.println("valor mínimo tipo long: " + Long.MIN_VALUE);
        System.out.println("valor máximo tipo long: " + Long.MAX_VALUE);
        System.out.println();

        float floatVar = 9225807F;
        System.out.println("float: " + floatVar);
        System.out.println("bits tipo float: " + Float.SIZE);
        System.out.println("bytes tipo float: " + Float.BYTES);
        System.out.println("valor mínimo tipo float: " + Float.MIN_VALUE);
        System.out.println("valor máximo tipo float: " + Float.MAX_VALUE);
        System.out.println();

        double doubleVar = 9225D;
        System.out.println("double: " + doubleVar);
        System.out.println("bits tipo double: " + Double.SIZE);
        System.out.println("bytes tipo double: " + Double.BYTES);
        System.out.println("valor mínimo tipo double: " + Double.MIN_VALUE);
        System.out.println("valor máximo tipo double: " + Double.MAX_VALUE);
        System.out.println();

        char charVar = 'a';
        System.out.println("char: " + charVar);
        System.out.println("bits tipo char: " + Character.SIZE);
        System.out.println("bytes tipo char: " + Character.BYTES);
        System.out.println("valor mínimo tipo char: " + Character.MIN_VALUE);
        System.out.println("valor máximo tipo char: " + Character.MAX_VALUE);
        System.out.println();

        boolean booleanVar = false;
        System.out.println("boolean: " + booleanVar);
        System.out.println();

        /*--------------------------------------------------------------*/
        
        int numeroDecimal = 10;
        System.out.println("numeroDecimal = " + numeroDecimal);

        int numeroOctal = 012;
        System.out.println("numeroOctal = " + numeroOctal);

        int numeroHexadecimal = 0xA;
        System.out.println("numeroHexadecimal = " + numeroHexadecimal);

        int numeroBinario = 0b1010;
        System.out.println("numeroBinario = " + numeroBinario);
        System.out.println();

        /*--------------------------------------------------------------*/
        
        char varChar = '\u0021';
        System.out.println("varChar = " + varChar);
        
        char varCharDecimal = 33;
        System.out.println("varCharDecimal = " + varCharDecimal);
        
        char varCharSimbolo = '!';
        System.out.println("varCharSimbolo = " + varCharSimbolo);
        System.out.println();

        /*--------------------------------------------------------------*/
    }
}

package com.course;

import java.util.Scanner;

public class ControlDeFlujoIf {
    public static void main(String[] args) {
        boolean condicion = false;

        if (condicion){
            System.out.println("Condición verdadera");
        }
        else {
            System.out.println("Condición falsa");
        }

        int numero = 3;

        if (numero == 1) {
            System.out.println("Número uno");
        }
        else if (numero == 2) {
            System.out.println("Número dos");
        }
        else if (numero == 3) {
            System.out.println("Número tres");
        }
        else {
            System.out.println("Número desconocido");
        }


        Scanner scanner = new Scanner(System.in);
        float calificacion = 0.0f;
        String nota = "";

        System.out.println("Proporcione un valor entre 0 y 10: ");
        calificacion = Float.parseFloat(scanner.nextLine());

        if (calificacion >= 9 && calificacion <= 10) {
            nota = "A";
        }
        else if (calificacion >= 8 && calificacion < 9) {
            nota = "B";
        }
        else if (calificacion >= 7 && calificacion < 8) {
            nota = "C";
        }
        else if (calificacion >= 6 && calificacion < 7) {
            nota = "D";
        }
        else {
            nota = "Valor desconocido";
        }
        System.out.println("nota = " + nota);
    }
}

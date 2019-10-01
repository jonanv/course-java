package com.course;

public class ControlDeFlujo {
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
    }
}

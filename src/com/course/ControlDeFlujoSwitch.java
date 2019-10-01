package com.course;

public class ControlDeFlujoSwitch {
    public static void main(String[] args) {
        int numero = 3;
        String numeroTexto = "Número desconocido";

        switch (numero) {
            case 1:
                numeroTexto = "Número uno";
                break;
            case 2:
                numeroTexto = "Número dos";
                break;
            case 3:
                numeroTexto = "Número tres";
                break;
            default:
                numeroTexto = "Número desconocido";
        }
        System.out.println("numeroTexto = " + numeroTexto);
    }
}

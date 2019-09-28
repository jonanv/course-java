package com.course;

import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Proporciona el id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Proporciona el precio: ");
        double precio = Double.parseDouble(scanner.nextLine());

        System.out.println("Proporciona el simbolo: ");
        char simbolo = scanner.nextLine().charAt(0);

        System.out.println("Proporciona el envío gratuito: ");
        boolean envioGratuito = Boolean.parseBoolean(scanner.nextLine());

        System.out.println(nombre + " C.C." + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio gratuito: " + envioGratuito);
    }
}

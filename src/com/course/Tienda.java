package com.course;

import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona el nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Proporciona el id: ");
        int id = scanner.nextInt();

        System.out.println("Proporciona el precio: ");
        double precio = scanner.nextDouble();

        System.out.println("Proporciona el simbolo: ");
        char simbolo = scanner.nextLine().charAt(0);

        System.out.println("Proprociona el envío gratuito: ");
        double envioGratuito = scanner.nextDouble();

        System.out.println(nombre + " " + id);
        System.out.println("Precio: " + simbolo + precio);
        System.out.println("Envio gratuito: " + envioGratuito);
    }
}

package com.course;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;

        System.out.println("Proporciona el número 1: ");
        numero1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el número 2: ");
        numero2 = Integer.parseInt(scanner.nextLine());

        int numeroMayor = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("El número mayor es: " + numeroMayor);
    }
}

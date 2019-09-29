package com.course;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int alto;
        int ancho;

        System.out.println("Proporciona el alto: ");
        alto = Integer.parseInt(scanner.nextLine());
        System.out.println("Proporciona el ancho: ");
        ancho = Integer.parseInt(scanner.nextLine());

        int area = alto * ancho;
        int perimetro = (alto + ancho) * 2;

        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
    }
}

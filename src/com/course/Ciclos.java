package com.course;

public class Ciclos {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Imprimiendo número do-while: " + i);
            i++;
        }while (i < 10);
        System.out.println();

        i = 0;
        while (i < 10){
            System.out.println("Imprimiendo número while: " + i);
            i++;
        }
        System.out.println();

        for (int j = 0; j < 10; j++) {
            System.out.println("Imprimiendo número for: " + j);
        }
        System.out.println();

        for (int j = 0; j < 10; j++) {
            if (j % 2 == 0) {
                System.out.println("Imprimiendo número for: " + j);
                break;
            }
        }
        System.out.println();

        for (int j = 0; j < 10; j++) {
            if (j % 2 != 0) {
                continue;
            }
            System.out.println("Imprimiendo número for: " + j);
        }
    }
}

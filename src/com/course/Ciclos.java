package com.course;

public class Ciclos {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Imprimiendo número do-while: " + i);
            i++;
        }while (i < 10);

        for (int j = 0; j < 10; j++) {
            System.out.println("Imprimiendo número for: " + j);
        }
    }
}

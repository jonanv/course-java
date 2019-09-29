package com.course;

public class PrePos {
    public static void main(String[] args) {
        //Preincremento
        int k = 3;
        int j = ++k;
        System.out.println("k = " + k);
        System.out.println("j = " + j);

        //Posincremento
        int i = 2;
        int l = i++;
        System.out.println("i = " + i);
        System.out.println("l = " + l);

        //Predecremento
        int s = 6;
        int o = --s;
        System.out.println("s = " + s);
        System.out.println("o = " + o);

        //Posdecremento
        int q = 5;
        int h = q--;
        System.out.println("q = " + q);
        System.out.println("h = " + h);
    }
}

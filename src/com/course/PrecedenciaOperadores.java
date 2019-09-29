package com.course;

public class PrecedenciaOperadores {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int resultado = -3 + 6 / ++a * 4 - b-- + b;
        System.out.println("resultado = " + resultado);

        //Evalua a 6 / ++a (a hace el preincremento y queda en 3)
        System.out.println(6 / 3);
        //El resultado de 6 / 3 es 2 que es multimplicado por 4
        System.out.println(2 * 4);
        //evalua -3 + 8
        System.out.println(-3 + 8);
        //evalua 5 - b-- (b se asigna 3 y luego se decrementa para ser 2)
        System.out.println(5 - 3);
        //se evalua 2 + b (b ahora es 2)
        System.out.println(2 + 2);
    }
}

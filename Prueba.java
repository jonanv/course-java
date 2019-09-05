import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        byte numero1 = (byte) 27;
        short numero2 = (short) 30;
        int numero3 = 2345;
        System.out.println("El numero que se declaro y se inicio fue: " + numero1);
        System.out.println("Numero 2: " + numero2);
        System.out.println("Numero 3: " + numero3);

        String nombre = "Giovanni";
        System.out.println("Nombre: " + nombre);
        System.out.println("Nueva linea: \n" + nombre);
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("Retroceso: \b" + nombre);
        System.out.println("Retorno de carro: \r" + nombre);
        System.out.println("Comilla simple: \'" + nombre + "\'");

        // Scanner scanner = new Scanner(System.in);
        // String consola = scanner.nextLine();
        // System.out.println("Consola: " + consola);

        // Scanner scanner = new Scanner(System.in);

        // System.out.println("Ingresar libro: ");
        // String libro = scanner.nextLine();
        // System.out.println("Ingresar autor: ");
        // String autor = scanner.nextLine();
        // System.out.println(libro + " fue escrito por " + autor);

        byte b1 = 10;
        System.out.println("Byte decimal: b1 = " + b1);
        byte b2 = 0xa;
        System.out.println("Byte hexadecimal: b2 = " + b2);
        byte b3 = 012;
        System.out.println("Byte ocatal: b3 = " + b3);
        byte b4 = 0b1010;
        System.out.println("Byte binario: b4 = " + b4);
    }
}
package a2253332381_practica09;

import java.util.Scanner;

public class Ciclomientras1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ciclo, num;

        System.out.println("introduce el numero de la tabla a desplegar");
        num = scanner.nextInt();

        ciclo = 1;

        while (ciclo < 11) {
            System.out.println(num + " * " + ciclo + " = " + (ciclo * num));
            ciclo = ciclo + 1;
        }

        scanner.close();
    }
}
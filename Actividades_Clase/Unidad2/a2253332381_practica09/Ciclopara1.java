package a2253332381_practica09;

import java.util.Scanner;

public class Ciclopara1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ciclo, num;

        System.out.println("introduce el numero de la tabla a desplegar");
        num = scanner.nextInt();

        for (ciclo = 1; ciclo <= 10; ciclo++) {
            System.out.println(num + " * " + ciclo + " = " + (ciclo * num));
        }

        scanner.close();
    }
}
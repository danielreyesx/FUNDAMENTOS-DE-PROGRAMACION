package a2253332381_practica6;

import java.util.Scanner;

public class ejercicio02_mc_scanner {

    public static void main(String[] args) {
        int numero;
        int dm, um, c, d, u;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduzca un número entre 0 y 99.999: ");
        numero = entrada.nextInt();

        dm = numero / 10000;
        numero = numero % 10000;

        um = numero / 1000;
        numero = numero % 1000;

        c = numero / 100;
        numero = numero % 100;

        d = numero / 10;
        numero = numero % 10;

        u = numero;

        System.out.println(u + " " + d + " " + c + " " + um + " " + dm);

        numero = 10000 * u + 1000 * d + 100 * c + 10 * um + dm;
        System.out.println(numero);
    }
}
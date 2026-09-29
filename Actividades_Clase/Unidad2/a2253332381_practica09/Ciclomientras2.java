package a2253332381_practica09;

import java.util.Scanner;

public class Ciclomientras2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int ciclop, cicloh;
        int nalum, nparcial, cal, scal;
        double palum, sprom, pgeneral;

        System.out.println("cuantos alumnos vas a evaluar");
        nalum = scanner.nextInt();

        System.out.println("cuantos parciales vas a evaluar");
        nparcial = scanner.nextInt();

        ciclop = 0;
        sprom = 0;

        while (ciclop < nalum) {
            ciclop = ciclop + 1;
            cicloh = 0;
            scal = 0;

            while (cicloh < nparcial) {
                cicloh = cicloh + 1;

                System.out.println("calificacion del alumno " + ciclop + " parcial " + cicloh);
                cal = scanner.nextInt();

                scal = scal + cal;
            }

            palum = (double) scal / nparcial;
            System.out.println("El promedio del alumno " + ciclop + " fue " + palum);

            sprom = sprom + palum;
        }

        pgeneral = sprom / nalum;
        System.out.println("El promedio general fue " + pgeneral);

        scanner.close();
    }
}
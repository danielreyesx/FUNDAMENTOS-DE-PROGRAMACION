package a2253332381_practica6;

import java.util.Scanner;

public class ejercicio05_scanner {

    public static void main(String[] args) {
        int cant, sumacant = 0;
        String salida = "";
        double precio, subtotal, iva, total, sumaiva = 0.0, sumatotal = 0.0;

        Scanner entrada = new Scanner(System.in);

        // Producto 1: Refresco coca cola light lata
        System.out.println("Introduzca el precio del Refresco coca cola light lata ");
        precio = entrada.nextDouble();

        System.out.println("Introduzca la cantidad comprada del Refresco coca cola light lata ");
        cant = entrada.nextInt();

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;

        salida = "subtotal " + String.valueOf(subtotal) + " iva " + String.valueOf(iva);
        salida = salida + " Total " + String.valueOf(total);
        System.out.println(salida);

        sumacant = cant;
        sumaiva = iva;
        sumatotal = total;

        // Producto 2: 1/4 de Arroz
        System.out.println("Introduzca el precio 1/4 de Arroz ");
        precio = entrada.nextDouble();

        System.out.println("Introduzca la cantidad comprada del 1/4 de Arroz ");
        cant = entrada.nextInt();

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;

        salida = "subtotal " + String.valueOf(subtotal) + " iva " + String.valueOf(iva);
        salida = salida + " Total " + String.valueOf(total);
        System.out.println(salida);

        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;

        // Producto 3: pieza de pan frances
        System.out.println("Introduzca el precio pieza de pan frances ");
        precio = entrada.nextDouble();

        System.out.println("Introduzca la cantidad comprada piezas de pan frances ");
        cant = entrada.nextInt();

        subtotal = precio * cant;
        iva = 0.16 * subtotal;
        total = iva + subtotal;

        salida = "subtotal " + String.valueOf(subtotal) + " iva " + String.valueOf(iva);
        salida = salida + " Total " + String.valueOf(total);
        System.out.println(salida);

        sumacant = sumacant + cant;
        sumaiva = iva + sumaiva;
        sumatotal = total + sumatotal;

        // Totales finales
        System.out.println("el total de productos vendidos fue " + sumacant);
        System.out.println(" el total del iva fue " + sumaiva);
        System.out.println(" el total ----------> " + sumatotal);
    }
}
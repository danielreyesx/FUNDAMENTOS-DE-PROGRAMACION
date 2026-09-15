package a2253332381_practica07;

import java.util.Scanner;

public class ejercicio_8_3_mc_scanner {
	public static void main(String args[]) {
		Scanner entrada = new Scanner(System.in);
		double a, b, c;
		String salida;

		System.out.println("Introduce el lado 1 del triangulo");
		a = entrada.nextDouble();
		System.out.println("Introduce el lado 2 del triangulo");
		b = entrada.nextDouble();
		System.out.println("Introduce el lado 3 del triangulo");
		c = entrada.nextDouble();

		if (a == b) {
			if (b == c)
				salida = "Triangulo Equilatero";
			else
				salida = "Triangulo Isoceles";
		} else {
			if (a == c || b == c)
				salida = "Triangulo Isoceles";
			else
				salida = "Triangulo Escaleno";
		}

		System.out.println(salida);
		entrada.close();
	}
}
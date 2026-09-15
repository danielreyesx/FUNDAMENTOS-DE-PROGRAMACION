package a2253332381_practica07;

import javax.swing.JOptionPane;

public class ejercicio_8_3_cuadrodialogo {
	public static void main(String args[]) {
		double a, b, c;
		String salida;

		a = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 1 del triangulo"));
		b = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 2 del triangulo"));
		c = Double.parseDouble(JOptionPane.showInputDialog("Introduce el lado 3 del triangulo"));

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

		JOptionPane.showMessageDialog(null, salida);
	}
}	

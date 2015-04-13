package kontrollstrukturen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author stefanie.feuerriegel
 *
 *         Newton bestimmt die Quadratwurzel einer reellen Zahl n mittels
 *         Newton-Verfahren
 *
 */
public class Newton {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader ein = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.print("Zahl: ");
		double n = Double.valueOf(ein.readLine()).intValue();
		//double n = Double.parseDouble(args[0]);
		double q = 1;
		double epsilon = n * 1e-8;
		int steps = 0;

		while (Math.abs(n - q * q) > epsilon) {
			q = (q + (n / q)) / 2;
			steps++;
		}
		System.out.println("Approximationswert: " + q);
		System.out.println("relative Abweichung: " + Math.abs((n - q * q) / n));
		System.out.println("Approximationsschritte: " + steps);
	}

}

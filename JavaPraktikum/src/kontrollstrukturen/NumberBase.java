package kontrollstrukturen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author stefanie.feuerriegel
 *
 *         NumberBase wandelt Zahlen von einem Zahlensystem in ein anderes um
 *
 */
public class NumberBase {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader ein = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.print("Zahl: ");
		int n = Integer.valueOf(ein.readLine()).intValue();
		System.out.print("Quellbasis: ");
		int a = Integer.valueOf(ein.readLine()).intValue();
		System.out.print("Zielbasis: ");
		int b = Integer.valueOf(ein.readLine()).intValue();

		// int n = Integer.parseInt(args[0]); // Zahl
		// int a = Integer.parseInt(args[1]); // Quellbasis
		// int b = Integer.parseInt(args[2]); // Zielbasis

		// Umwandeln von n in Dezimalzahl number10
		int digitValue = 1; // Stellenwert
		int number10 = 0;
		while (n > 0) {
			final int digit = n % 10; // Stelle/Ziffer
			number10 += digit * digitValue;
			System.out.printf("n=%d\td=%d\tv=%d\tnumber10=%d%n", n, digit,
					digitValue, number10);
			digitValue *= a;
			n /= 10;
		}

		// Umwandeln von Dezimalzahl number10 in Darstellung zur Basis b
		digitValue = 1;
		while (digitValue <= number10) {
			digitValue *= b;
		}
		digitValue /= b;
		while (digitValue > 0) {
			final int digit = number10 / digitValue;
			System.out.print(digit);
			number10 %= digitValue;
			digitValue /= b;
		}
		System.out.println();

	}
}

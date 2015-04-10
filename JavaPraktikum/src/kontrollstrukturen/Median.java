package kontrollstrukturen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author stefanie.feuerriegel
 *
 *         Median gibt den mittleren Wert von drei ganzen Zahlen a, b und c aus
 *
 */
public class Median {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader ein = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.print("1. Zahl: ");
		int a = Integer.valueOf(ein.readLine()).intValue();
		System.out.print("2. Zahl: ");
		int b = Integer.valueOf(ein.readLine()).intValue();
		System.out.print("3. Zahl: ");
		int c = Integer.valueOf(ein.readLine()).intValue();

		// int a = Integer.parseInt(args[0]);
		// int b = Integer.parseInt(args[1]);
		// int c = Integer.parseInt(args[2]);

		if (a < b)
			if (b < c)
				System.out.println(b);
			else if (a < c) {
				System.out.println(c);
			} else
				System.out.println(a);
		else if (b < c)
			if (a < c)
				System.out.println(a);
			else
				System.out.println(c);
		else
			System.out.println(b);
	}

}

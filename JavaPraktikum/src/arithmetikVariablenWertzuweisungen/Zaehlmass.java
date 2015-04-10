package arithmetikVariablenWertzuweisungen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author stefanie.feuerriegel
 *
 *         Zaehlmass gibt eine ganze Zahl in den Werten Gros (144 Stück), Schock
 *         (60 Stück), Dutzend (12 Stück) und Einzelstück aus
 *
 */
public class Zaehlmass {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader ein = new BufferedReader(
				new InputStreamReader(System.in));

		System.out.print("Zahl: ");
		int n = Integer.valueOf(ein.readLine()).intValue();
		// int n = Integer.parseInt(args[0]);
		int gros = n / 144;
		n = n % 144;
		int schock = n / 60;
		n = n % 60;
		int dutzend = n / 12;
		n = n % 12;
		int stueck = n;

		System.out.println(gros + " Gros " + schock + " Schock " + dutzend
				+ " Dutzend " + stueck + " Einzelstück");
		// System.out.printf("%d %d %d %d%n", gros, schock, dutzend, stueck);
	}
}

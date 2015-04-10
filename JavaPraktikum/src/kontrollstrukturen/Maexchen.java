package kontrollstrukturen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maexchen {
	public static void main(String[] args) throws NumberFormatException, IOException {
		

		BufferedReader ein = new BufferedReader(
				new InputStreamReader(System.in));

		//int a = Integer.parseInt(args[0]);
		//int b = Integer.parseInt(args[1]);
		
		System.out.print("1. Wurf: ");
		int a = Integer.valueOf(ein.readLine()).intValue();
		System.out.print("2. Wurf: ");
		int b = Integer.valueOf(ein.readLine()).intValue();
		
		try {
			if (a < 1 || a > 6 || b < 1 || b > 6)
				throw new Exception();
		} catch (Exception e) {
			System.out.println("Zahl liegt nicht zwischen 1 und 6");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		int summe = 0;

		if (min == 1 && max == 2) {
			summe = summe + 1000;
		} else if (min == max) {
			summe = 100 * min;
		} else {
			summe = (10 * max) + min;
		}

		System.out.println(summe);

	}
}

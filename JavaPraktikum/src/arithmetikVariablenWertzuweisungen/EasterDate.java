package arithmetikVariablenWertzuweisungen;

/**
 * 
 * @author stefanie.feuerriegel
 *
 *         EasterDate gibt zu einer Jahreszahl >= 1852 den Tag und Monat des
 *         Ostersonntags aus
 *
 */
public class EasterDate {

	public static void main(String[] args) {

		int y = Integer.parseInt(args[0]);
		int g = y % 19;
		int c = y / 100;
		int h = (c - (c / 4) - ((8 * c + 13) / 25) + 19 * g + 15) % 30;
		int i = h - (h / 28) * (1 - (29 / (h + 1)) * ((21 - g) / 11));
		int j = (y + (y / 4) + i + 2 - c + (c / 4)) % 7;
		int l = i - j;
		int m = 3 + ((l + 40) / 44); // Ostermonat
		int d = l + 28 - 31 * (m / 4); // Ostersonntag

		System.out.println(d + " " + m);
	}

}

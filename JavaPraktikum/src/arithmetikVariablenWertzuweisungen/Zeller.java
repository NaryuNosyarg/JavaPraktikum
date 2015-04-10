package arithmetikVariablenWertzuweisungen;

/**
 * 
 * @author stefanie.feuerriegel
 *
 *         Zeller liefert für ein eingebenes Kalenderdatum den Wochentag als
 *         Index von 0 bis 6
 *
 */

public class Zeller {
	public static void main(String[] args) {

		int d = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		int temp = Integer.parseInt(args[2]);
		if (m < 3) {
			m += 12; //Januar --> 13, Februar --> 14
			temp--;	// zurück zum Vorjahr
		}
		int y = temp % 100;
		int c = temp / 100;

		int w = (d + ((26 * (m + 1)) / 10) + ((5 * y) / 4) + (c / 4) + 5 * c - 1) % 7;

		System.out.println(w);
	}
}

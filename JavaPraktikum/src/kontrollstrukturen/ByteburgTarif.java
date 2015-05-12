package kontrollstrukturen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author stefanie.feuerriegel
 *
 *         ByteburgTarif berechnet die Fahrpreise für das S-Bahn-Netz von
 *         "Byteburg"
 *
 */
public class ByteburgTarif {

	public static void main(String[] args) throws NumberFormatException,
			IOException {

		BufferedReader ein = new BufferedReader(
				new InputStreamReader(System.in));

		int lines = 5;
		
		System.out.print("1. Station: ");
		int station1 = Integer.valueOf(ein.readLine()).intValue();
		System.out.print("zu 2. Station: ");
		int station2 = Integer.valueOf(ein.readLine()).intValue();

		//int station1 = Integer.parseInt(args[0]);
		//int station2 = Integer.parseInt(args[1]);

		int min = Math.min(station1, station2);
		int max = Math.max(station1, station2);

		int lineOfMin = min / 10;
		int stationOfMin = min % 10;
		int lineOfMax = max / 10;
		int stationOfMax = max % 10;

		int fahrpreis = 0;

		// Kurzfahrt zwischen zwei benachbarten Stationen entlang einer
		// Hauptlinie
		if (lineOfMin == lineOfMax && stationOfMax == stationOfMin + 1) {
			fahrpreis = 1;
		}
		// Kurzfahrt zwischen zwei benachbarten Stationen entlang der Ringlinie
		else if (stationOfMin == 3 && stationOfMax == 3
				&& lineOfMax == lineOfMin + 1) {
			fahrpreis = 1;
		}
		// Kurzfahrt zwischen zwei benachbarten Stationen entlang der Ringlinie
		// von Linie 1 zur höchsten Linie
		else if (stationOfMin == 3 && stationOfMax == 3 && lineOfMax == lines
				&& lineOfMin == 1) {
			fahrpreis = 1;
		}
		// Kurzfahrt zum/vom Zentrum
		else if (stationOfMax + stationOfMin == 1) {
			fahrpreis = 1;
		}

		else {
			fahrpreis = 2; // Grundpreis

			// Endstation benutzt
			if (stationOfMax == 6) {
				fahrpreis++;
			}
			if (stationOfMin == 6) {
				fahrpreis++;
			}

			// Zonengrenze überquert
			if (stationOfMin < 4 && stationOfMax >= 4) {
				fahrpreis++;
			} else if (stationOfMin >= 4 && stationOfMax < 4) {
				fahrpreis++;
			} else if (stationOfMin >= 4 && stationOfMax >= 4
					&& lineOfMin != lineOfMax) {
				fahrpreis += 2;
			}
		}

		System.out.println(fahrpreis);

	}

}

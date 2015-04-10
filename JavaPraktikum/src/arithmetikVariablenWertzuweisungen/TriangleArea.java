package arithmetikVariablenWertzuweisungen;

import static java.lang.Math.*;

public class TriangleArea {

	public static void main(String[] args) {

		int i = 0;
		double ax = Double.parseDouble(args[i++]);
		double ay = Double.parseDouble(args[i++]);
		double bx = Double.parseDouble(args[i++]);
		double by = Double.parseDouble(args[i++]);
		double cx = Double.parseDouble(args[i++]);
		double cy = Double.parseDouble(args[i++]);

		double a = hypot(cx - bx, cy - by);
		double b = hypot(ax - cx, ay - cy);
		double c = hypot(bx - ax, by - ay);

		double s = (a + b + c) / 2;
		double area = sqrt(s * (s - a) * (s - b) * (s - c));

		System.out.println(area);
	}
}

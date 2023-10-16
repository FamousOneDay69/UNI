public class Ballistic {
	public static void main(String[] args) {
		double g = 9.81;
		double x = Double.parseDouble(args[0]);
		double v = Double.parseDouble(args[1]);
		double t = Double.parseDouble(args[2]);
		System.out.print(x + v * t - (g * (t * t)) / 2.0);
	}
}

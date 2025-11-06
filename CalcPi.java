// Computes an approximation of PI.
public class CalcPi {
	public static void main(String [] args) { 
	    double x = Math.PI;
		int numOfTerms = Integer.parseInt(args[0]);
		double sum = 0;
		int a = 1;
		int b = 1;
		for (int i = 0; i < numOfTerms; i++) {
			double term = (double)a / b;
			sum = sum + term;
			a = a * -1;
			b = b + 2;
			}
		System.out.println("pi according to Java: " + x);
		System.out.println("pi, approximated:     " + sum * 4);
	}
}


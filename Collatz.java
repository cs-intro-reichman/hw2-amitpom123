// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
	    int input = Integer.parseInt(args[0]);
		String s = args[1];
		for (int line = 1; line <= input; line++) {
			int m = line;
			if (s.equals("v")) {
				System.out.print(line);
				int count = 1;
				do {
					count++;
				if ((m % 2) == 0){
					m = m / 2;
					System.out.print(" " + m);
				} else {
					m = m * 3 + 1;
					System.out.print(" " + m);
				}
			} while(m != 1);
			System.out.print(" (" + count + ")");
			System.out.println();
			} else if (s.equals("c")) {
				do {
					if ((m % 2) == 0){
						m = m / 2;
					} else {
						m = m * 3 + 1;
					}
				}while(m != 1);
			}
		} 
		System.out.println("Every one of the first " + input + " hailstone sequences reached 1.");
	}
}


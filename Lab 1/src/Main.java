/**
 * Credits:
 *
 * Liam Hart
 * Brendan M O'Brien
 * Darlin Kola
 * Ayser Jamshidi
 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// Scanner for input
		Scanner scanner = new Scanner(System.in);

		// Loop (required)
		while (true) {
			System.out.println("Enter a number of days or 0 to exit: ");

			int D = scanner.nextInt();

			// If we're given invalid input or input that's too high, simply exit
			if (D <= 0 || 14 < D)
				System.exit(0);

			int I = 7; // Initial infected
			double R = 1.2, // Infection rate
					sum = I; // Sum of infected


			if (D != 1)
				for (int i = 1; i < D; i++) {
					double rI = R * I;
					sum += rI;
					I = (int)rI;
				}

			int sumInt = (int)sum;
			System.out.println("Students infected: " + sumInt); // Students infected as int (we MUST truncate)
			System.out.println("Cost: $" + sumInt * 9972); // sum * cost of every semester
			System.out.println("Infection Percentage: " + (sumInt/39740f) * 100); // Infected students / Total students
		}
    }
}
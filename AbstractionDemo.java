package KidsKodingVideos;
import java.util.*;
import java.io.*;
@SuppressWarnings("unused")
/* FRQ: 
 * 
 * Jessica is assigned to make 4 abstract methods that add, substract, multiply, and divide two doubles, rounding each value to 2 decimal places.
 * Using abstraction, assist Jessica in the given task.
 * 
 * Input: 3.2, 4.1
 * Output: 
 * Sum: 7.30
 * Difference: -0.90
 * Product: 13.12
 * Quotient: 0.78
 * 
 * Input: 10, 5
 * Output:
 * Sum: 15.00
 * Difference: 5.00
 * Product: 50.00
 * Quotient: 2.00
*/
abstract class FourMethods { //4 abstract methods that add, sub, multi, divide. All should return doubles
	protected abstract double sum(double x, double y);
	protected abstract double difference(double x, double y);
	protected abstract double product(double x, double y);
	protected abstract double quotient(double x, double y);
}
class UsingTheFourMethods extends FourMethods { //override abstract methods
	@Override //java annotation telling the compiler, a method is being overridden
	protected double sum(double x, double y) {
		return x + y;
	}

	@Override
	protected double difference(double x, double y) {
		return x - y;
	}

	@Override
	protected double product(double x, double y) {
		return x * y;
	}

	@Override
	protected double quotient(double x, double y) {
		return x / y;
	}
}
public class AbstractionDemo {
	private double x;
	private double y;
	public static void main(String... args) throws InputMismatchException {
		AbstractionDemo a = new AbstractionDemo();
		UsingTheFourMethods f = new UsingTheFourMethods();
		Scanner scan = new Scanner(System.in);
		System.out.println("Type a number");
		try {
			a.x = scan.nextDouble(); //storing x (user's first number)
		}
		catch(Exception e) {
			System.out.println("Be sure to type any number (including decimals).");
		}
		System.out.println("Type another number");
		try {
			a.y = scan.nextDouble(); //storing y (user's second number)
		}
		catch(Exception e) {
			System.out.println("Be sure to type any number (including decimals).");
		}
		System.out.printf("Sum: %.2f\n", f.sum(a.x, a.y));
		System.out.printf("Difference: %.2f\n", f.difference(a.x, a.y));
		System.out.printf("Product: %.2f\n", f.product(a.x, a.y));
		System.out.printf("Quotient: %.2f\n", f.quotient(a.x, a.y));
	}
}

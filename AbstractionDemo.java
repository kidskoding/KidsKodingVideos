/* Jessica is attempting to create 4 methods that will add, substract, multiply and divide 2 doubles.
* Help Jessica fulfill her task using the program below. */
package KidsKodingVideos;
import java.util.*;
interface A { 
    public double sum(double x, double y);
    public double difference(double x, double y);
    public double product(double x, double y);
    public double quotient(double x, double y);
}
class HelperClass implements A {
    @Override //optional but best practices. Tells java a method is being overridden
    public double sum(double x, double y) {
        return x + y;
    }
    @Override 
    public double difference(double x, double y) {
        return y - x;
    }
    @Override
    public double product(double x, double y) {
        return x * y;
    }
    @Override
    public double quotient(double x, double y) {
        return y / x;
    }
}
public class AbstractionDemo {
    public static void main(String[] args) throws InputMismatchException {
        double x;
        double y;
        Scanner scan = new Scanner(System.in);
        System.out.println("Type a number!");
        try {
            x = scan.nextDouble();
        }
        catch(Exception e) {
            throw new InputMismatchException("Try Again! Be sure to input a whole or decimal number");
        }
        System.out.println("Type another number!");
        try {
            y = scan.nextDouble();
        }
        catch(Exception e) {
            throw new InputMismatchException("Try Again! Be sure to input a whole or decimal number");
        }
        HelperClass h = new HelperClass();
        System.out.println("Sum: " + h.sum(x, y));
        System.out.println("Differece: " + h.difference(x, y));
        System.out.println("Product: " + h.product(x, y));
        System.out.println("Quotient: " + h.quotient(x, y));
    }
}

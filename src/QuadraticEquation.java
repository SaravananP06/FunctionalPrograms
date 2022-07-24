import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        System.out.println("Welcome to Quadratic Equation Program");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for a: ");
        double a = sc.nextDouble();

        System.out.println("Enter the value for b: ");
        double b = sc.nextDouble();

        System.out.println("Enter the value for c: ");
        double c = sc.nextDouble();

        // compute delta
        // delta = b*b - 4*a*c
        double delta = (Math.pow(b,2) - (4 * a * c));
        System.out.println("Delta: "+delta);

        // roots
//        Root 1 of x = (-b + sqrt(delta))/(2*a)
//        Root 2 of x = (-b - sqrt(delta))/(2*a)

        double firstRoot = (-b + (Math.sqrt(delta))/(2*a));
        double secondRoot = (-b - (Math.sqrt(delta))/(2*a));
        System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);




    }
}

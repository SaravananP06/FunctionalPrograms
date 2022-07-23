import java.util.Scanner;

public class EuclideanDistance {
    public static void main(String[] args) {
        System.out.println("Welcome to Distance.java Program");

        // input point coordinates
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for x: ");
        Double x = sc.nextDouble();

        System.out.println("Enter the value for y: ");
        Double y = sc.nextDouble();

        // compute distance
        double distance = Math.sqrt((Math.pow(x,2)) + (Math.pow(y,2)));
        System.out.println("distance from (" + x + ", " + y + ") to origin  = " + distance);
        sc.close();


    }
}


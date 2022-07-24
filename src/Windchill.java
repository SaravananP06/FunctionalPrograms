import java.util.Scanner;

public class Windchill {
    public static void main(String[] args) {
        System.out.println("Welcome to Wind Chill");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the temperature in Fahrenheit : ");
        double t = sc.nextDouble();

        System.out.println("Enter the Wind speed in miles per hour : ");
        double v = sc.nextDouble();

        // compute windchill
        double w = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
        System.out.println("Wind chill  = " + w);
    }
}

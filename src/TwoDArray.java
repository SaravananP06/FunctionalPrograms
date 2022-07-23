import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args) {
        System.out.println("Welcome to 2D Array Program");

        Scanner sc = new Scanner(System.in);
        // Taking input for number of rows
        System.out.println("Enter the number of rows");
        int m = sc.nextInt();

        // Taking input for number of columns
        System.out.println("Enter the number of columns");
        int n = sc.nextInt();

        // creating array
        int arr[][] = new int[m][n];

        // taking input for elements
        System.out.println("Enter the elements");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Displaying elements in 2D form

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        sc.close();





    }
}

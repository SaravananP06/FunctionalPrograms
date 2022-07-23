import java.util.Scanner;

public class TripletSum {
    public static void main(String[] args) {
        System.out.println("Welcome to Triplet Sum Program");

        Scanner sc = new Scanner(System.in);

        System.out.println("Total numbers are ?");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter your numbers");
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i = 0;i<n;i++) {

            for(int j = 0;j<n;j++) {

                for(int k = 0;k<n;k++) {

                    if(arr[i]+arr[j]+arr[k] == 0) {
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }

            }

        }

        sc.close();
    }
}

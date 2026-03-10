import java.util.Scanner;

public class prod {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        int a, b, prod;

        System.out.println();
        System.out.println("Type a value for 'a' :");
        a = read.nextInt();
        System.out.println("Type a value for 'b' :");
        b = read.nextInt();

        // prod = ;
        prod = a * b; // my solution

        // System.out.println("Prod = " + );
        System.out.println("Prod = " + prod); // my solution

        read.close();
    }
}
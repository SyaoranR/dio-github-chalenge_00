import java.io.IOException;
import java.util.Scanner;

public class chalenge {

    public static void main(String[] args) throws IOException {
        Scanner read = new Scanner(System.in);
    
        System.out.println();
        System.out.println("Type a value for 'a' :");
        int a = read.nextInt();
        System.out.println("Type a value for 'b' :");
        int b = read.nextInt();
        System.out.println("Type a value for 'c' :");
        int c = read.nextInt();
        System.out.println("Type a value for 'd' :");
        int d = read.nextInt();

        // Difference = (a * b - c * d)                
        // System.out.println(COMPLETE CODE); 

        // My solution
        int result = a * b - c * d;
        System.out.println("Difference = " + result); 
        // End of solution        

        read.close();
    }
}
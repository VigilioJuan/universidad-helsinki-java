
import java.util.Scanner;

public class MultiplicationFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
       System.out.println("Give the first number:");
       int cuic1 = Integer.valueOf(scanner.nextLine());
       System.out.println("Give the second number:");
       int cuic2 = Integer.valueOf(scanner.nextLine());
       System.out.println(cuic1 + " * " + cuic2 + " = " + (cuic1*cuic2));
    }
}

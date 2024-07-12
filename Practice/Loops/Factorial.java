import java.util.*;

public class Factorial {

  public static void main(String[]args) {

    Scanner input = new Scanner(System.in);

      int number;
      int factorial = 1;

       System.out.print("Enter any positive number: ");

        number = input.nextInt();

        for(int i = 1; i <= number; i++) {

          factorial*= number;
        }

        System.out.println("Factorial of the number is: " + factorial);
  }
}
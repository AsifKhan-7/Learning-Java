import java.util.Scanner;

public class Swap {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to my program\n");

    System.out.print("Please enter value of A: ");

    int a = input.nextInt();
    
    System.out.print("Please enter value of B: ");

    int b = input.nextInt();

    int c = a;

    a = b;

    b  = c;
    System.out.println("Swapping Done...");
    System.out.println("Value of A: " + a);
    System.out.println("Value of B: " + b);
    input.close();
  }
}
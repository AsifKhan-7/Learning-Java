import java.util.*;

public class Average {

  public static int calculateAvg(int num1, int num2, int num3) {
      int average = (num1 + num2 + num3) / 3;
      return average;
  }

  public static void main(String[]args) {

    Scanner input = new Scanner(System.in);

      System.out.println("This program calculate average: \n");
      System.out.print("Please enter the number: ");
      int a = input.nextInt();
      System.out.print("Enter the number: ");
      int b = input.nextInt();
      System.out.print("Enter the number again: ");
      int c = input.nextInt();
      int average = calculateAvg(a,b,c);
      System.out.println("Average is: " + average);
      
      input.close();




  }
}
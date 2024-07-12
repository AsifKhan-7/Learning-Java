import java.util.*;

public class Multiplication {

  public static void main(String[]args) {

    Scanner input = new Scanner(System.in);

     System.out.print("Enter any positive number: ");

     int number = input.nextInt();   
   
      for(int i = 1; i <= 10; i++) {

        int multiPlication = i * number;

       System.out.println(number + " * " + i + " = " + multiPlication);

       }
  
       input.close();
  }
}
import java.util.Scanner;

public class SimpleInterest {

  public static void main(String[] args) {
    
  Scanner input  = new Scanner(System.in);

  double rate = 5.5f;

  System.out.print("Calculation of simple interest\n");

  System.out.print("Please enter amount: ");

  double pricipalAmount  = input.nextDouble();

  System.out.print("Please enter time: ");

  double time = input.nextDouble();

  double totalInterest = (pricipalAmount * rate * time) / 100;

  System.out.println("This is the total totalInterest: " + totalInterest);

  input.close();




  }
  
}

import java.util.Scanner;

public class CompndIntrst {
  

  public static void main(String[] args) {
    
  Scanner input  = new Scanner(System.in);

  double rate = 5;

  System.out.print("Calculation of compound interest\n");

  System.out.print("Please enter amount: ");

  double pricipal  = input.nextDouble();

  System.out.print("Now, also enter time: ");

  double years = input.nextDouble();

  double compInt = pricipal * Math.pow((1 + rate / 100) , years) ;

  System.out.println("This is the total totalInterest: " + compInt);

  input.close();




  }


}

import java.util.*;

public class PrimeNumber {

  public static void main(String[]args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Please, enter the number: ");

    int number = input.nextInt();

    if(number == 2) {

      System.out.println("Number is prime: " + number);
    }

    else {

    boolean isPrime = true;

      for(int i = 2; i <= Math.sqrt(number); i++) {

      if(number % i == 0) {

        isPrime = false;
      }
    }

      if(isPrime == true) {

      System.out.println("Number is prime: " + number);
    }
    
     else {

      System.out.println("Number is not prime: " + number);
    }

    }

    
  }
}
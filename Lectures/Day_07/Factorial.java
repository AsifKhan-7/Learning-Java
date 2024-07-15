import java.util.*;

public class Factorial {

  public static int factorial(int num) {

    int fact = 1;
    for(int i = 1; i <= num; i++ ) {
      fact *= i;

    }
    return fact;
  }


    public static int bincoeff(int n, int r) {

      int fact_n = factorial(n);
      int fact_r = factorial(r);
      int fact_nmr = factorial(n - r);

      int bincoeff = fact_n / (fact_r * fact_nmr);
      return bincoeff;
    }

  public static void main(String[]args) {

    // int result = factorial(7);
    // System.out.println("Factorial is: " + result);
    System.out.println(bincoeff(7, 3));
  }
}
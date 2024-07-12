import java.util.*;

public class ReverseStar {

  public static void main(String args[]) {

    Scanner input = new Scanner(System.in);

     int n = 4;

    for(int line = 1; line <= n; line++) {

      for(int star = 1; star <= (n - line + 1); star++) {

        System.out.print("*");
      }

        System.out.println();

    }
  }
}
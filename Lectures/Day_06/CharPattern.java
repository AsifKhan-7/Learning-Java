import java.util.*;

public class CharPattern {

  public static void main(String[]args) {

    Scanner input = new Scanner(System.in);

    int n = 4;
    char ch = 'A';

    for(int line = 1; line <= n; line++) {

      for(int chars = 1; chars <= line; chars++) {

        System.out.print(ch);

        ch++;
      }

      System.out.println();
    }
  }
}
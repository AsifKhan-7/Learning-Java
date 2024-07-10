import java.util.*;

public class DInMonth {

  public static void main(String[]args) {

  Scanner input = new Scanner(System.in);
    /* Given the number of the month, task is to calculate the number of days present in the particular month? */

  System.out.println("Input number of month and output days in that month\n");

  System.out.print("Please, enter the number of month: ");

  int month = input.nextInt();

  if(month == 2) {

    System.out.println("February has 28 days:");
  
  }
  else if(month < 8) {
    if(month % 2 == 0) {
      System.out.println("30 days in the month");
    }
    else {
      System.out.println("31 days in the month");

    }
  }
  else {
     if(month % 2 == 0) {
      System.out.println("31 days in the month");
    }
    else {
      System.out.println("30 days in the month");

    }
  }

 

  
}

}
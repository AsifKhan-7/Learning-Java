import java.util.*;

public class ParaArea {

  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Perimeter of Rectangle\n");

    System.out.print("Please enter side A: ");

    double sideOne = input.nextDouble();

    System.out.print("Please enter side B: ");

    double sideTwo = input.nextDouble();

    double perimeter = 2 * (sideOne + sideTwo);

    System.out.println("This is the perimeter of rectangle: " + perimeter);

    input.close();



  }
}
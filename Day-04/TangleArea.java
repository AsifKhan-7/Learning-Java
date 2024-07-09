import java.util.Scanner;

public class TangleArea {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Calculation of the area of triangle\n"); 

    System.out.print("Please enter base in cms: ");

    double base = input.nextDouble();

    System.out.print("Now, enter your perpendicular height in cms: ");

    double height = input.nextDouble();

    // double area = 0.5 * (base * height);
    double area =  (base * height) / 2;

    System.out.println("This is the area of triangle: " + area + "cms2");

    input.close();

  }
  
}

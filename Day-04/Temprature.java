import java.util.Scanner;

public class Temprature {

 public static void main(String[] args) {
 

  Scanner input = new Scanner(System.in);

  System.out.println("Welcome to temprature convert program\n");

  System.out.print("Enter your Temp in F: ");

  float temp = input.nextFloat();

  float cel = (temp - 32) * 5.0f / 9.0f;

  System.out.println("Your Temprature is: " + cel + " C");


 }

}
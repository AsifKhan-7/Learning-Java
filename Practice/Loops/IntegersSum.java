import java.util.*;

public class IntegersSum {

  public static void main(String args[]) {

   Scanner input = new Scanner(System.in);

    

     int choice;
     int evenSum = 0;
     int oddSum = 0;
     
     do {
         System.out.print("Please enter the number: ");

          int number = input.nextInt();


            if(number % 2 == 0) {

            evenSum += number;
            
           }
           else {

            oddSum += number;
           
         }

         System.out.println("If you want to add more integers press 1, and for stop press 0");

          choice = input.nextInt();

     }  while(choice == 1);

        System.out.println("Sum of even integers is: " + evenSum);
        System.out.println("Sum of odd integers is: " + oddSum);


        input.close();
 
 }


}
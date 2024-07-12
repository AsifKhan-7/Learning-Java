import java.util.*;

public class Loops {

  public static void main(String[]args) {

    Scanner input = new Scanner(System.in);

   /* 
     while loop

   int counter = 0;
   while(counter < 100) {
    System.out.println("Hello World!" );
    counter++;

   } */
   

   /*

    int number = 1;
   while(number <= 10) {
    System.out.println("Number is: " + number);
    number++;

   } */


   
   /* 
   System.out.print("Please, enter a number: ");
   int range = input.nextInt();
   int counter = 1;
   while(counter <= range ) {
    System.out.print(counter + " ");
    counter++;
   }
*/


   /*
    System.out.print("Please, enter a number: ");
        int n = input.nextInt();
        int sum = 0;
        int i = 1;
        while(i <= n ) {
        sum += i;
        i++;
        }
        System.out.print("Sum of "+ n +" numbers is: " + sum); 
        */


        /*
         for loop

         for(int i = 1; i <= 10; i++) {
         System.out.println("Hello " + i + " World!");
        } 
        
        */

       
       /*
       
        print square pattern of stars
        for(int i = 1; i <= 4; i++) {
        System.out.println("* * * *");
       } 
        String pattern = "* * * *";
        for(int i = 1; i <= 4; i++) {
        System.out.println(pattern);
     } 
   int line = 1;
   while(line <= 4) {
    System.out.println("* * * *");
    line++;
   } */

   /*
   Print reverse of a number
    int number = 5567898;
    while(number > 0) {
    int lastDigit = number % 10;
    System.out.print(lastDigit);
    number /= 10;
    number = number / 10;
      }
      */
 
     /*
        reverse given number and print
        int n = 1899;
        int revNum = 0;
        while(n>0) {
        int lastDigit =  n % 10;
        revNum = (revNum * 10) + lastDigit;
        n /=10;
      }
        System.out.print(revNum);
        */

      /* do while loop
       int counter = 1;
      do {
          System.out.println("Hello World!");
          counter++;
      } while(counter <= 10); 

     Use of break keyword
     int i = 1;
     do {
      System.out.println(i);
      i++;
      if(i == 3){
        break;
      }
     } while(i <= 5);

    */


  /*
     Use of break keyword
   for(int i = 1; i <= 10; i++){
    if(i == 8){
      break;
    }
    System.out.println(i);
   }
   */
      

      /*
      Checking the number is multiple of 10 by while loop

      while(true){
      System.out.print("Please enter the number: ");
      int number = input.nextInt();
      System.out.println(number);
      if(number % 10 == 0){
        break;
      }
      }
      */

        /* 
         Checking the number is multiple of 10 by do while loop

    do {
      System.out.print("Please enter the number: ");
      int number = input.nextInt();

      if(number % 10 == 0){
        break;
      }

      System.out.println(number);
    } while(true);

    */


     /*
     Use of continue keyword
      for(int i = 1; i <= 5; i++){
      if(i == 3){
        continue;
      }
      System.out.println(i);
     }
    


     do{
          System.out.print("Please enter the number: ");
          int number = input.nextInt();
          if(number % 10 == 0) {
         continue;
          }
          System.out.println("Your number was: " + number);
     }while(true);

               */

            








   }

}
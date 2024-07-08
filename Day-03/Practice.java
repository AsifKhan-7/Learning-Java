import java.util.*;

/* public class Practice {
  public static void main(String args[]) {
    
     Question-1

    Scanner scn = new Scanner(System.in);
    System.out.println("Enter any number :");

    int number = scn.nextInt();

    if(number > 0) {
      System.out.println("Number is positive : " + number);
    }
    else {
      System.out.println("Number is negative : " + number);
    }


  }
} */


/* public class Practice {

public static void main(String args[]) {

     Question-2
    

   double temp = 103.5;

    String result = (temp > 100) ? "Fever": "Not fever";
   System.out.println("Result is : " + result ); 

    if(temp > 100) {
    System.out.println("You have fever : " + temp + " degree");
   }

   else {
    System.out.println("You do not have fever : " + temp + " degree");
   } 

 }

} */


/* public class Practice {

  public static void main(String args[]) {


     Question-3


    Scanner scn = new Scanner(System.in);
    
    System.out.println("Enter any number : ");
    int week = scn.nextInt();

    switch(week) {
      case 1: {
        System.out.println("Monday");
        break;
      }

       case 2: {
        System.out.println("Tuesday");
        break;
      }

        case 3: {
        System.out.println("Wednesday");
        break;
      }

       case 4: {
        System.out.println("Thrusday");
        break;
      }

      case 5: {
        System.out.println("Friday");
        break;
      }

      case 6: {
        System.out.println("Saturday");
        break;
      }

      case 7: {
        System.out.println("Sunday");
        break;
      }

      default: {
        System.out.println("Invalid input ❌");
      }
    }
  }
} */

 /* public class Practice {

 public static void main(String args[]) {

     
       Question-4

    int a = 63, b = 36;

    boolean x = (a < b ) ? true : false;

    System.out.println("Result is : " + x);

    int y= (a > b ) ? a : b;

    System.out.println("Result is : " + y);

   }

} */


/* public class Practice {

  public static void main(String args []) {

    Question - 5 

    Scanner scn = new Scanner(System.in);
    System.out.print("Input the year: ");
    int year = scn.nextInt();

    boolean x = (year % 4) == 0;

    boolean y = (year % 100) != 0;

    boolean z = (year % 400) == 0;
     
     if(x && (y || z)) {

      System.out.println("this is a leap year :" + year);

     }

     else {
      System.out.println("This is not a leap year : " + year);

     }
  
  }
} */


// Note:- Agar year 4 se divisible hai aur 100 se divisible nahi hai, ya phir year 400 se divisible hai, to wo leap year hoga.
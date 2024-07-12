import java.util.*;

 public class JavaBasics{
  public static void main(String args[]){

 Scanner calc = new Scanner(System.in);
 
 /*Income Tax calculator
 int income = scn.nextInt();

 int tax;

 if( income < 500000){
  tax = 0;
 }

 else if(income > 500000 && income < 100000){
  tax = (int)( income * 0.2);
 }

 else {
  tax = (int)( income * 0.2);
 }
 
System.out.println("Tax is: " + tax); */




 /* Greatest of 3
 int A = 1, B = 3, C = 5;

 if((A > B) && (A > C)) {
  System.out.println("Greatest is A");
 }

 else if (B > C) {
  System.out.println("Greatest is B");
 }

 else {
  System.out.println("Greatest is C");
 } */




  /* Ternary Operator
   int number = scn.nextInt();

   String result = (number % 2 == 0)? "Even":"Odd";

   System.out.println("This is the result: " + result); */



   /* int marks = 65;

   String reportCard = (marks >= 33)? "PASS":"FAIL";
   System.out.println("Student is: " + reportCard); */


      
  /* Switch statement
  int number = 3;
  switch(number) {
    case 1: {
      System.out.println("JS");
      break;
    }

    case 2: {
      System.out.println("JAVA");
      break;
    }

    case 3: {
      System.out.println("PHP");
      break;
    }

    default: {
      System.out.println("Number does not liy in");
    }
  } */

   
   /* Calculator */

   System.out.println("enter num1: ");
   int num1 = calc.nextInt();
   System.out.println("enter num2: ");
   int num2 = calc.nextInt();
   System.out.println("enter operator: ");
   char result = calc.next().charAt(0);

   System.out.println("Calculation: " + num1 + "+" + num2);
   
   switch(result) {
    case '+': {
      System.out.println("Result: "+ (num1 + num2));
      break;
    }

    case '-': {
      System.out.println("Result: "+ (num1 - num2));
      break;
    }

    case '*': {
      System.out.println("Result: "+ (num1 * num2));
      break;
    }

    case '/': {
      System.out.println("Result: "+ (num1 / num2));
      break;
    }

    case '%': {
      System.out.println("Result: "+ (num1 % num2));
      break;
    }

    default: {
      System.out.println("Operation failed ❌");
    }
   }



  }
}


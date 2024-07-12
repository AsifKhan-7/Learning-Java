import java.util.*;

// public class JavaBasics{
//   public static void main(String args[]){
 
//  Scanner obj = new Scanner(System.in);
// int a = obj.nextInt();
// int b = obj.nextInt();
// int sum = a + b;
// System.out.println(sum);

//   }
// }

// public class product{
//   public static void main(String args[]){
//     Scanner obj = new Scanner(System.in);
//     int a = obj.nextInt();
//     int b = obj.nextInt();
//     int product = a * b;
//     System.out.println(product);
//   }
// }

// public class area{
//   public static void main(String args[]){
//     Scanner obj = new Scanner(System.in);
//     float rad = obj.nextInt();
//     float area = 3.14f * rad * rad;
//     System.out.println("Area of a circle: " + area);
//   }
// }




/* Type conversion */

//  public class conversion {
//   public static void main(String args[]){
     /* int a = 10;
      long b = a;
      System.out.println(b); */

     /* Scanner scn = new Scanner(System.in);
      float number = scn.nextInt();
      System.out.println(number);
  }
}
*/






/* Type casting */


/* public class conversion {
 public static void main(String args[]){
   Scanner scn = new Scanner(System.in);
   float myfloat = scn.nextFloat();
   int number = (int)myfloat;
   System.out.println(number);
   char character = 'A';
   int num = character;
   System.out.println("The value of A is: " + num);

 }
} */




/* Type promotions in java in expressions */

public class promotions {
  public static void main(String args[]){
    // byte a = 10;
    // short b = 20;
    // char c = 'c';
    // int sum = a + b + c;
    // System.out.println(sum);

    // int a = 10;
    // float b = 25.55f;
    // long c = 100;
    // double d = 200.50;
    // double ans = a + b + c + d;
    // System.out.println(ans);

    // byte b = 5;
    // b = b * 5;
    // System.out.println(b);

    byte b = 5;
    b = (byte)(b * 5);
    System.out.println(b);
  }
}
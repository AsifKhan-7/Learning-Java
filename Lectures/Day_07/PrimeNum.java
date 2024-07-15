import java.util.*;

public class PrimeNum {

  // public static boolean isPrime(int num) {
  //     // only for num>=2
  //   // boolean isPrime = true;
  //   // corner case
  //     if(num == 2) {
  //       return true;
  //     }
   
  //   for(int i = 2; i <= num-1; i++) {
  //     if(num % i == 0) {
  //       return false;
  //       // isPrime = false;
  //       // break;
  //     }
  //   }
  //   return true;
  //   // return isPrime;
  // }

    public static boolean isPrime(int num) {
              if(num == 2) {
              return true;
         }
       for(int i = 2; i <= Math.sqrt(num); i++) {
          if(num % i == 0) {
           return false;
          }
      }
      return true;
    }



     public static void primesInRange(int num) {
         for(int i = 2; i <= num; i++) {
            if(isPrime(i)) {
              System.out.print(i + " ");
            }
         }
              System.out.println();
      
     }

   


      public static void main(String[]args) {

         primesInRange(77);
   }
}


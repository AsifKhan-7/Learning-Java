

public class Product {

  public static int multiply(int val1, int val2) {

    
    int product = val1 * val2;
    return product;
    
  }

  public static void main(String[]args){
             int a = 5;
             int b = 3;

            int result = multiply(a, b);
            System.out.println("a * b: " + result);
             result = multiply(14, 23);
            System.out.println("a * b: " + result);

            
          
  }
}
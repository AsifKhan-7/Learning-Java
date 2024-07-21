
public class Function {
  public static void printFunc() {
   /* int count = 1;
    while(count <= 3) {
      System.out.println("Function/Methods");
      count++;
    } */
      return;
  }


    public static int calculateSum(int num1, int num2) {
     int sum = num1 + num2;
     return sum;
    }





  public static void main(String[]args) {
    // printFunc();

     /* Scanner input = new Scanner(System.in);
     System.out.print("Please enter the number: ");
     int a = input.nextInt();
     System.out.print("Please enter the number: ");
     int b = input.nextInt();
     int total =  calculateSum(a, b);
     System.out.println("Sum is: " + total); */


     int a = 10;
     int b = 25;


    //  Swap values

    int temp = a;
    a = b;
    b = temp;
    System.out.println("a: " + a);
    System.out.println("b: " + b);
     
     
  }
}
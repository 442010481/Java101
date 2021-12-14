import java.util.Scanner;
public class Main {
  static int subtract(int x , int y ) {
    return x - y;
  }
  
 
  
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter tow Number to subtract ");
    int myNum1 = input.nextInt();
    int myNum2 = input.nextInt();
    System.out.println( subtract(myNum1 , myNum2));
    
  }
}

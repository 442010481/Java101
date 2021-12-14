import java.util.Scanner;
public class powFunction {
  static int pow(int x ) {
    return x*x;
  }
  
 
  
  public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     System.out.println("Enter a number to find the pow " );
    int myNum1= scan.nextInt();
 
    System.out.println( pow(myNum1));
    
  

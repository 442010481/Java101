import java .util.Scanner;

public class positiveAndNegative
{
	public static void main(String[] args) {
     Scanner scan = new Scanner(System.in); 
    System.out.println("enter a decimal number ");
    float number= scan.nextFloat();
       if(number>= 0 )
       System.out.println(number+ ": is positive");
      else if(number <0)
        System.out.println(number+ ": is negative");
      
            
        
	}
}

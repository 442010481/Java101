import java.util.Scanner;

public class SwitichCirculeAndSquare {
	public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1 or 2");

	   	int num= scan.nextInt();
	   
		switch(num) {
  
		case 1:
	    
		System.out.println("Enter a radius");
		
		int $num = scan.nextInt();
		System.out.println(3.14*$num*$num);
		break;
		
		case 2: 

		System.out.println("Enter  h");
		int h = scan.nextInt();
		
		System.out.println("Enter w ");
	    
		int w = scan.nextInt();
		System.out.println(h * w);
	break;
	
		default:
		System.out.println("Error");
		}
	}
}

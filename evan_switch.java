import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
			    Scanner scan = new Scanner(System.in);
	    System.out.println("Enter your num");
	    int num ;
	    num=scan.nextInt();
	    switch(num%2){
	    case 0:
	        System.out.println(num+ ":Evan ");
	        break;
	    case 1 :
	    System.out.println(num+ ":odd");
	        
	    }
	}


	}

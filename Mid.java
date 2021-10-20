import java.util.Scanner;
public class Main
{
	public static void mid(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    float grade ;
	     System.out.println("Enter grade 0 to 100 ");
	  
	grade =  scan.nextFloat();
	   if (grade >=90 && grade <= 100 ) {
	       System.out.println(grade+"is equivalent to A" );}
	       else if(grade >80 ){
	       System.out.println("Good job " +grade+ "out of 100");}
	   else if (grade>60){
	       System.out.println("Passed the course  "+grade+ "out of 100");}
	       else{
	       System.out.println("sorry you fail ");
	   
	       }
	          
	      	       
	      
	      
	}
}

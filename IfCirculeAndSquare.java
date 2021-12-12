import java.util.Scanner;
public class IfCirculeAndSquare
{
	public static void main(String[] args) {
	    Scanner input=new Scanner(System.in);
	System.out.println("Enter number 1 or 2");
	int num1   ;
	num1 = input.nextInt();
if(num1==1     ){
    float radius  ;
    System.out.println("Enter a radius ");
    	 
      float r=  input.nextFloat();
      
    System.out.println(r*r* 3.14);}
        else if(num1==2){
        System.out.println("Enter h");
    
    float h = input.nextFloat(); 
    System.out.println("Enter w");
      float w=input.nextFloat();
    System.out.println(h*w);}
    else {
    System.out.println("Eror");
	}
}
}

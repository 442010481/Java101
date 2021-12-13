import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner scan = new Scanner (System.in);
    int  number1,  number2,  number3;

      System.out.println ("Enter the first number ");
       number1 = scan.nextInt ();
     
      System.out.println ("Enter the second number ");
      
      
       number2 = scan.nextInt ();
       
      System.out.println ("Enter  the third number  ");
      
      number3 = scan.nextInt ();

    if ( number1 >  number3 &&  number1 > number2)
      {
	System.out.println ("The Largest  is:" + number1);

      }
    else if (number2 > number3 && number2 > number1)
      {
	System.out.println ("The Largest  is:" + number2);

      }
    else if (number3 > number2 && number3 > number1)
      {
	System.out.println ("the Largest  is:" + number3);
      }
    
      }
  }

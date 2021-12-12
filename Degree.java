import java.util.Scanner;
class Degree {
  public static void main(String [] args){
    Scanner scan = new Scanner(System.in);
     float degree;
      System.out.println("Enter your degree");
      degree =scan.nextFloat();
     if(degree<= 100 && degree>=90 ){
     System.out.println(degree+": is A");}
     else if ( degree<90 && degree >= 80){
     System.out.println(degree+ ": is B");}
     else if ( degree<80 && degree>=70){
       System.out.println(degree+" is c");}
       else if (degree<70 && degree>= 60){
       System.out.println(degree+"is D");}
       else if (degree<60){
           System.out.println("sorry your fail");
       }
        
           else{
              System.out.println("Error"); 
           }
  }
}

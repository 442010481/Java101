
import java.util.Random;
import java.util.Scanner;
//your grade is 5/5
public class RockPaperSe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String computerPlays = "rps";
       Random rnd = new Random();
          do{
            System.out.println("If you want to play enter:\n(r or R) for rock,\n(p or P) for paper,\n(s or S) for scissors\nor Enter any key to exit");
            //get the input from the scanner as string. [ User Input w3schools ]
                String playermove= scan.nextLine();
            //convert the string to lower case by using toLowerCase() [ String w3schools ]
               playermove =playermove.toLowerCase();
            //get first char by using charAt() [ String w3schools ]
                char   playermove1 = playermove.charAt(0);
                 
                //check the first char if it is not r, p, and s then break the loop [ if w3schools ]
            if( playermove1 != 'p' && playermove1 != 's' && playermove1 != 'r' ){
                
                     break;
                     }
                 
                //use break keyword [ while w3schools ]

            //here is the computer choice
            char computerChoice = computerPlays.charAt(rnd.nextInt(computerPlays.length()));
                System.out.println(computerChoice);
              if ( playermove1  == computerChoice  ){
              System.out.println(  " is tie:\n user choice:"  + playermove1+ "\n computerChoice:" +  computerChoice); }
                else if ( (playermove1 =='s' &&  computerChoice == 'p'  ) || (playermove1 =='r' && computerChoice == 's' ) || (playermove1 == 'p' && computerChoice == 'r' )){
              System.out.println("user wins:\n user choice:" +playermove1+ "\n computerChoice:"+computerChoice ) ; 
                
              }
            
            else {
       System.out.println("computer wins \n computerChoice:"+computerChoice+"\n user choice:"+playermove1);
           }
                 



            //print new line
            System.out.println("\n\n");
        }while(true);
              
           
          
}
}


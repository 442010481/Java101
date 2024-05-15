package hw3;

/**
 *
 * @author mohmad
 */
public class TV extends Electronics {
     
    public TV(String country,int Price) {
        super(country,Price);
    }
     public void RemoteControl (){
     System.out.println("The TV made by " +Maker+"\n which costs"+Price  + "   S.r \n is operated by remotecontrol only" );
     }
   }   

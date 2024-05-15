package hw3;

/**
 *
 * @author mohmad
 */
public class Oven extends Electronics {
    String cookWay;
    String EnergySource;
    public Oven(String country, int Price, String cookWay ,String EnergySource) {
        super( country,Price);
        this.cookWay=cookWay;
        this.EnergySource=EnergySource;
    }
    
    public String getEnergySource(){
    return EnergySource;
    }
   public  void cookMethod (){
   System.out.println("The Oven made by  "+Maker+"\n Which cost"+Price+"  S.r\n is using for  "+EnergySource+"  \n is cook food using  "+cookWay);
   }
   
           
           
           
           
           
           
}

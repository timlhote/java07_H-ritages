public class Hangar 
{

    public static void main(String[] args) {

        Car maGrosseBM = new Car ("BMW", 150000);
        Boat monGrosYatch = new Boat ("Yamaha", 50000);        
        
        System.out.println(monGrosYatch.doStuff());
        System.out.println(maGrosseBM.doStuff());
    }

}
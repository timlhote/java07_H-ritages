public class Boat extends Vehicule {

    public Boat(String marque, int kilometre) {
        super(marque,kilometre);
    }

    //implemntVehicule
    public String doStuff() {  

        return "Je suis " + this.getBrand() + " et je fais glou glou !";  

    }




}
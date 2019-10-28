public class Car extends Vehicule {

    public Car(String marque, int kilometre) {
        super(marque, kilometre);
    }


    //implement
    public String doStuff() {  

        return "Je suis " + this.getBrand() + " et je fais vroum vroum !";  

    }
}
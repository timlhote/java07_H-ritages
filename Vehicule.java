public abstract class Vehicule {
    // attributs  
    private String brand;  
    private int kilometers;  

    // Constructeurs

    public Vehicule(String marque, int kilometre) {
        this.brand = marque;
        this.kilometers = kilometre;
    }

    public abstract String doStuff();
    
    // Setters & Getters
    /**
     * @return String return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return int return the kilometers
     */
    public int getKilometers() {
        return kilometers;
    }

    /**
     * @param kilometers the kilometers to set
     */
    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }

}
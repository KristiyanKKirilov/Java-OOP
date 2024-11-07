public class Truck extends Vehicle{

    private int cargo;

    public Truck(int horsePowers, int kilometers, String brand, int cargo){
        super(horsePowers, kilometers, brand);
        this.cargo = cargo;
    }


    @Override
    public double calculateFuel() {
        return super.getHorsePowers() / 3.0;
    }

    @Override
    public String toString() {
        return "";
    }
}

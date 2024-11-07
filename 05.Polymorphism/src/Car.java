public class Car extends Vehicle{
private int year;
    public Car(int horsePowers, int kilometers, String brand, double price, int year) {
        super(horsePowers, kilometers, brand, price);
        this.year = year;
    }

    @Override
    public double calculateFuel(){
        double fuelConsumption = 0;
        if(year < 2000 && super.getHorsePowers() < 100){
            fuelConsumption =  super.getHorsePowers() / 4.0;
        }

        return fuelConsumption;
    }

    @Override
    public String toString() {
        {
            return "Vehicle{" +
                    "horsePowers=" + super.getHorsePowers() +

                    '}';
        }
    }
}

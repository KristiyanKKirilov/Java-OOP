import java.util.Objects;

public abstract class Vehicle {
    private int horsePowers;
    private int kilometers;
    private String brand;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return horsePowers == vehicle.horsePowers && kilometers == vehicle.kilometers && Double.compare(price, vehicle.price) == 0 && Objects.equals(brand, vehicle.brand);
    }

    public Vehicle(int horsePowers, int kilometers, String brand, double price){
        this.horsePowers = horsePowers;
        this.kilometers = kilometers;
        this.brand = brand;
        this.price = price;
    }

    int getHorsePowers(){
        return this.horsePowers;
    }
    @Override
    public int hashCode() {
        return Objects.hash(horsePowers, kilometers, brand, price);
    }

    public abstract double calculateFuel();
    public abstract String toString();

    public Vehicle(int horsePowers, int kilometers, String brand){
        this.horsePowers = horsePowers;
        this.kilometers = kilometers;
        this.brand = brand;
    }
}

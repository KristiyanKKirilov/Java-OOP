public class Main {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Car(120, 100000, "BENZ", 5000, 2002);
        System.out.println(vehicle.toString());
    }
}
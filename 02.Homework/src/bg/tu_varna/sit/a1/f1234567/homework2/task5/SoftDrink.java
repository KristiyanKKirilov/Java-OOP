package bg.tu_varna.sit.a2.f23621649.homework2.task5;

public class SoftDrink {
    String brand;
    String expirationDate;
    double bottleVolume;
    double sugarAmount;

    SoftDrink(){}

    SoftDrink(String brand, String expirationDate, double bottleVolume, double sugarAmount) {
        this.brand = brand;
        this.expirationDate = expirationDate;
        this.bottleVolume = bottleVolume;
        this.sugarAmount = sugarAmount;
    }

    public String getBrand() {
        return brand;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public double getBottleVolume() {
        return bottleVolume;
    }

    public double getSugarAmount() {
        return sugarAmount;
    }

    public String toString() {
        return "Brand: " + brand +
                ",\nExpiration Date: " + expirationDate +
                ",\nBottle Volume: " + bottleVolume + " liters" +
                ",\nSugar Amount: " + sugarAmount + " grams per 100ml";
    }

    public boolean equals(SoftDrink softDrink) {
        if (this == softDrink) return true;

        if (softDrink == null) return false;

        return this.brand.equalsIgnoreCase(softDrink.brand) &&
                this.bottleVolume == softDrink.bottleVolume &&
                this.expirationDate.equalsIgnoreCase(softDrink.expirationDate) &&
                this.sugarAmount == softDrink.sugarAmount;
    }
}

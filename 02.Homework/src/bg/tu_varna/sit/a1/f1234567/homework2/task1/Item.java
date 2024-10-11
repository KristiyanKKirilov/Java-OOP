package bg.tu_varna.sit.a1.f1234567.homework2.task1;

public class Item {
    String type;
    int quantity;
    float price;
    int expirationDays;

    Item(){}
    Item(String type, int quantity, float price, int expirationDays){
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.expirationDays = expirationDays;
    }

    public String getType(){
        return type;
    }

    public int getQuantity(){
        return quantity;
    }

    public float getPrice(){
        return price;
    }

    public int getExpirationDays(){
        return expirationDays;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setExpirationDays(int expirationDays){
        this.expirationDays = expirationDays;
    }
}

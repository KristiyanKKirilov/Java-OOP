package bg.tu_varna.sit.a1.f1234567.homework2.task1;

public class ItemArray {
    Item[] items;

    ItemArray(){}
    ItemArray(Item... items){
        this.items = items;
    }

    public float calculateAveragePrice(){
        float totalPrice = 0;
        for (int i = 0; i < items.length ; i++) {
            totalPrice += items[i].quantity * items[i].price;
        }

        return totalPrice / items.length;
    }
}

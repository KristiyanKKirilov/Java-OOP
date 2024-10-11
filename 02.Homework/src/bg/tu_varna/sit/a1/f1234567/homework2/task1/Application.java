package bg.tu_varna.sit.a1.f1234567.homework2.task1;

public class Application {
    public static void main(String[] args) {
        Item firstItem = new Item("milk", 3, 6, 20 ); 
        Item secondItem = new Item("bread", 7, 2, 4 );
        Item thirdItem = new Item("cheese", 2, 4, 11 );
        Item exampleMethodsItem = new Item();

        exampleMethodsItem.setType("water");
        exampleMethodsItem.setQuantity(6);
        exampleMethodsItem.setPrice(2.5f);
        exampleMethodsItem.setExpirationDays(365);

        System.out.println("Item type: " + exampleMethodsItem.getType());
        System.out.println("Item quantity: " + exampleMethodsItem.getQuantity());
        System.out.println("Item price: " + exampleMethodsItem.getPrice());
        System.out.println("Item expirationDays: " + exampleMethodsItem.getExpirationDays());

        ItemArray itemArray = new ItemArray(firstItem, secondItem, thirdItem);
        float totalPrice = itemArray.calculateAveragePrice();
        System.out.println(String.format("%.2f", totalPrice));

    }
}


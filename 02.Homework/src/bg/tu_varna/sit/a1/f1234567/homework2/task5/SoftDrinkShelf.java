package bg.tu_varna.sit.a2.f23621649.homework2.task5;

public class SoftDrinkShelf {
    SoftDrink[] softDrinks;

    SoftDrinkShelf(){}

    SoftDrinkShelf(SoftDrink[] softDrinks) {
        this.softDrinks = softDrinks;
    }

    public SoftDrink getMostFrequentSoftDrink() {
        SoftDrink[] uniqueSoftDrinks = new SoftDrink[softDrinks.length];
        int[] repeatingSoftDrinks = new int[softDrinks.length];

        for (int i = 0; i < softDrinks.length; i++) {
            SoftDrink currentSoftDrink = softDrinks[i];

            for (int j = i + 1; j < softDrinks.length; j++) {
                if(currentSoftDrink.equals(softDrinks[j])){
                    uniqueSoftDrinks[i] = currentSoftDrink;
                    repeatingSoftDrinks[i]++;
                }
            }
        }

        int maxRepeat = 0;
        int maxRepeatIndex = 0;
        for (int i = 0; i < repeatingSoftDrinks.length; i++) {
            if(repeatingSoftDrinks[i] == 0){
                continue;
            }

            if(repeatingSoftDrinks[i] >= maxRepeat){
                maxRepeat = repeatingSoftDrinks[i];
                maxRepeatIndex = i;
            }
        }

        return uniqueSoftDrinks[maxRepeatIndex];
    }
}

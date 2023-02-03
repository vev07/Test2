package MethodMethod.Massive;

import java.util.Arrays;
import java.util.Comparator;

public class backBag {
    public static void main(String[] args) {

        final Item item1 = new Item(4, 20);
        final Item item2 = new Item(3, 18);
        final Item item3 = new Item(2, 14);
        final Item[] items = {item1, item2, item3};
        Arrays.sort(items, Comparator.comparingDouble(Item::veluePerUnitOfWeight).reversed());
        System.out.println(Arrays.toString(items));
        final int W = 7;
        int weightSoFar = 0;
        int valueSoFar = 0;
        int carrentItem = 0;

        while (carrentItem < items.length && weightSoFar != W){
            if(weightSoFar + items[carrentItem].getWeight() < W){
                valueSoFar += items[carrentItem].getValue();
                weightSoFar += items[carrentItem].getWeight();

            }else {
                valueSoFar += ((W - weightSoFar)/(double) items[carrentItem].getWeight())*items[carrentItem].getValue();
                weightSoFar = W;
            }
            carrentItem++;
        }
        System.out.println("velue :"+valueSoFar);
    }

}
class Item{
    private int weight;
    private int value;

    public int getWeight() {
        return weight;
    }

    public int getValue() {
        return value;
    }
    public double veluePerUnitOfWeight(){
            return value/(double) weight;
    }

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    @Override
    public String toString() {
        return "{w:"+weight+", v:"+value+"}";
    }
}

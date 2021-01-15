import boxes.BlackHoleBox;
import boxes.MaxWeightBox;
import boxes.OneThingBox;
import boxes.Thing;

public class Main {
    public static void main(String[] args) {

        //MaxWeightBox class test

        MaxWeightBox coffeeBox = new MaxWeightBox(10);
        coffeeBox.add(new Thing("Saludo", 5));
        coffeeBox.add(new Thing("Pirkka", 5));
        coffeeBox.add(new Thing("Kopi Luwak", 5));

        System.out.println(coffeeBox.isInTheBox(new Thing("Saludo")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Pirkka")));
        System.out.println(coffeeBox.isInTheBox(new Thing("Kopi Luwak")));

        System.out.println("\n"); //OneThingBox class test

        OneThingBox box = new OneThingBox();
        box.add(new Thing("Saludo", 5));
        box.add(new Thing("Pirkka", 5));

        System.out.println(box.isInTheBox(new Thing("Saludo")));
        System.out.println(box.isInTheBox(new Thing("Pirkka")));

        System.out.println("\n"); //BlackHoleBox class test

        BlackHoleBox box2 = new BlackHoleBox();
        box2.add(new Thing("Saludo", 5));
        box2.add(new Thing("Pirkka", 5));

        System.out.println(box2.isInTheBox(new Thing("Saludo")));
        System.out.println(box2.isInTheBox(new Thing("Pirkka")));
    }
}

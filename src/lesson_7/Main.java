package lesson_7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        Plate plate = new Plate(100);
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat("Federico" + i);
        }
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate, 30);
        }

        plate.info();
        plate.increaseFood(100);
        plate.info();


    }
}

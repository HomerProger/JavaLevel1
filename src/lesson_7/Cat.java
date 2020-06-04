package lesson_7;

public class Cat {
    private String name;
    private boolean satiety;

    {
        satiety = false;
    }

    public Cat(String name) {
        this.name = name;
    }

    public void printSatiety(boolean satiety) {
        if (satiety == true) {
            System.out.println(name + " сытый");
        } else {
            System.out.println("Еды не хватило. " + name + " голодный");
        }
    }

    public void eat(Plate plate, int amount) {

        if (plate.decreaseFood(amount) == true) {
            System.out.println(name + " кушает");
            satiety = true;
            printSatiety(satiety);
            return;
        } else {
            printSatiety(satiety);
        }
    }
}

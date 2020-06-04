package lesson_7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (food < amount) {
            System.out.println("В тарелке меньше еды, чем " + amount);
            return false;
        }
        food -= amount;
        return true;
    }

    public void increaseFood(int amount) {
        food += amount;
    }

    public void info() {
        System.out.println("В тарелке сейчас " + food + " еды");
    }

}

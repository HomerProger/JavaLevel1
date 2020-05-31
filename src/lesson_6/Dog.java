package lesson_6;

public class Dog extends Animal {
    private int maxRun=500;
    private int maxSwim=10;
    Dog(String name) {
        super(name);
    }

    @Override
    void run(int length) {
        if (length > maxRun) {
            System.out.println("Превышено ограничение на бег. Собаки не могут бежать более " + maxRun + "м");
        } else {
            super.run(length);
        }
    }

    @Override
    void swim(int length) {
        if (length > maxSwim) {
            System.out.println("Превышено ограничение на плавание. Собаки не могут плыть более " + maxSwim + "м");
        } else {
            super.swim(length);
        }
    }
}

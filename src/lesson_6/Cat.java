package lesson_6;

public class Cat extends Animal {
    private int maxRun = 200;

    Cat(String name) {
        super(name);
    }

    @Override
    void run(int length) {
        if (length > maxRun) {
            System.out.println("Превышено ограничение на бег. Коты не могут бежать более " + maxRun + "м");
        } else {
            super.run(length);
        }
    }

    @Override
    void swim(int length) {
        System.out.println("Коты не умеют плавать(");
    }
}

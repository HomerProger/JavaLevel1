package lesson_6;

public class Animal {
    String name;
    static int countAnimals;

    Animal(String name) {

        this.name = name;
        countAnimals++;
    }

    void run(int length) {
        System.out.println(name + " пробежал " + length + " м");
    }

    void swim(int length) {

        System.out.println(name + " проплыл " + length + " м");
    }
}

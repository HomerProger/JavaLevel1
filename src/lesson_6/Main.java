package lesson_6;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Jack");
        Cat cat2 = new Cat("Bazilio");
        Dog dog1 = new Dog("Boris");
        Dog dog2 = new Dog("Julbars");
        cat1.run(21);
        cat2.swim(1);
        dog1.swim(50);
        dog2.run(85);
    }
}

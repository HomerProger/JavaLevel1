package lesson_6;

import static lesson_6.Animal.countAnimals;
import static lesson_6.Cat.countCats;
import static lesson_6.Dog.countDogs;

public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Jack");
        Cat cat2 = new Cat("Bazilio");
        Cat cat3 = new Cat("Vaska",1000);
        Dog dog1 = new Dog("Boris");
        Dog dog2 = new Dog("Julbars");
        Dog dog3 = new Dog("Brut");
        Dog dog4 = new Dog("Sprinter",400,5);
        cat1.run(21);
        cat2.swim(1);
        cat3.run(800);
        dog1.swim(50);
        dog2.run(450);
        dog4.run(450);
        System.out.println("Создано котов " + countCats);
        System.out.println("Создано собак " + countDogs);
        System.out.println("Создано животных " + countAnimals);
    }
}

package lesson_6;

public class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void run(int length){
        System.out.println(name+" пробежал "+length+" метр");
    }
    void swim(int length){

        System.out.println(name+" проплыл "+length+" метр");
    }
}

package lesson_6;

public class Cat extends Animal {
    private int maxRun = 200;
    private int individualMaxRun=maxRun;
    static int countCats;

    Cat(String name) {
        super(name);
        countCats++;
    }
    Cat(String name, int individualMaxRun) {
        super(name);
        this.individualMaxRun=individualMaxRun;
        countCats++;
    }
    @Override
    void run(int length) {
        if (individualMaxRun!=maxRun){
            if (length > individualMaxRun) {
                System.out.println("Превышено ограничение на бег. "+name+" не может бежать более "
                        + individualMaxRun + " м");
            } else {
                super.run(length);
            }
            return;
        }
        if (length > maxRun) {
            System.out.println("Превышено ограничение на бег. Коты не могут бежать более " + maxRun + " м");
        } else {
            super.run(length);
        }
    }

    @Override
    void swim(int length) {
        System.out.println("Коты не умеют плавать(");
    }
}

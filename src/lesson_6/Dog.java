package lesson_6;

public class Dog extends Animal {
    private int maxRun = 500;
    private int maxSwim = 10;
    private int individualMaxRun=maxRun;
    private int individualMaxSwim=maxSwim;
    static int countDogs;

    Dog(String name) {
        super(name);
        countDogs++;
    }
    Dog(String name, int individualMaxRun, int individualMaxSwim) {
        super(name);
        this.individualMaxRun=individualMaxRun;
        this.individualMaxSwim=individualMaxSwim;
        countDogs++;
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
            System.out.println("Превышено ограничение на бег. Собаки не могут бежать более " + maxRun + " м");
        } else {
            super.run(length);
        }
    }

    @Override
    void swim(int length) {
        if (individualMaxSwim!=maxSwim){
            if (length > individualMaxSwim) {
                System.out.println("Превышено ограничение на бег. "+name+" не может бежать более "
                        + individualMaxSwim + " м");
            } else {
                super.run(length);
            }
            return;
        }
        if (length > maxSwim) {
            System.out.println("Превышено ограничение на плавание. Собаки не могут плыть более " + maxSwim + " м");
        } else {
            super.swim(length);
        }
    }
}

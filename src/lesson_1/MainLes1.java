package lesson_1;

public class MainLes1 {
    public static void main(String[] args) {
//      Задание 2. Переменные всех пройденных типов
        byte a = 34;
        short b = 23000;
        int c = 234;
        long d = 33553L;
        float e = 345.345f;
        double f = 56.6;
        boolean g = true;
        char h = 'a';
        String text = "Hello World!";
    }

    //      Задание 3. Метод вычисляющий выражение a * (b + (c / d))
    public static float calc(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    //      Задание 4. Метод проверки величины суммы чисел, между 10 и 20 или нет
    public static boolean checkSum(int a, int b) {
        return (a + b) >= 10 && (a + b) <= 20;
    }

    //      Задание 5.Метод проверки положительное число или отрицательное
    public static void checkNumber(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    //      Задание 6. Метод возвращает true, если число отрицательное
    public static boolean isNegative(int a) {
        return a < 0;
    }

    //      Задание 7. Метод выводит в консоль "Привет_Имя"
    public static void hello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    //      Задание 8. Метод определяет високосный год или нет
    public static void leapYear(int a) {
        if (a % 400 == 0) {
            System.out.println(a + " - високосный год");
        }
        if (a % 4 != 0) {
            System.out.println(a + " - не високосный год");
        } else if (a % 400 != 0 && a % 100 == 0) {
            System.out.println(a + " - не високосный год");
        } else if (a % 400 != 0) {
            System.out.println(a + " - високосный год");
        }
    }
}


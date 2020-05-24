package lesson_3;
import java.util.Random;
import java.util.Scanner;

public class MainLes3 {

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        int check = 0;
        do {
            game();
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            check = sc.nextInt();
        } while (check == 1);

    }

    public static void game() {
        int userAnswer;
        int needNumber = random.nextInt(10);
        int count = 0;
        do {
            System.out.println("Введите число от 0 до 9");
            userAnswer = sc.nextInt();
            if (userAnswer < needNumber) {
                System.out.println("Вы ввели слишком маленькое число");
            }
            if (userAnswer > needNumber) {
                System.out.println("Вы ввели слишком большое число");
            }
            count++;
        } while (userAnswer != needNumber && count < 3);
        if (userAnswer == needNumber) {
            System.out.println("Число отгадано");
        } else {
            System.out.println("Верный ответ: " + needNumber);
        }
    }
}

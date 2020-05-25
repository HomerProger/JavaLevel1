package lesson_4;
import java.util.Random;
import java.util.Scanner;

public class MainLes4 {
    static final int SIZE = 9;
    static final int DOTS_TO_WIN = 5;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();


        while (true) {
            humanTurn();
            printMap();

            if (checkWin(DOT_X)) {
                System.out.println("Ты победил!");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();

            if (checkWin(DOT_O)) {
                System.out.println("Компьютер победил!");
                break;
            }

            if (isFull()) {
                System.out.println("Ничья");
                break;
            }
        }
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void humanTurn() {
        int x, y;

        do {
            System.out.println("Введите координаты вашего хода X Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    public static void aiTurn() {
        int x, y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(y, x));
        map[y][x] = DOT_O;
    }

    public static boolean isFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean checkWin(char c) {

        for (int i = 0; i < SIZE; i++) {
            for (int j=0; j < SIZE; j++) {
                int check1=0;
                int check2=0;
                int check3=0;
                int check4=0;

                for (int n=0;n<DOTS_TO_WIN;n++){
                    if((i+DOTS_TO_WIN-1)<SIZE&&(j+DOTS_TO_WIN-1)<SIZE&&map[i+n][j+n]==c){
                        check1++;
                    }
                    if((i-DOTS_TO_WIN+1)>=0&&(j+DOTS_TO_WIN-1)<SIZE&&map[i-n][j+n]==c){
                        check2++;
                    }
                    if((j+DOTS_TO_WIN-1)<SIZE&&map[i][j+n]==c){
                        check3++;
                    }
                    if((i+DOTS_TO_WIN-1)<SIZE&&map[i+n][j]==c){
                        check4++;
                    }
                }
                if(check1==DOTS_TO_WIN||check2==DOTS_TO_WIN||check3==DOTS_TO_WIN||check4==DOTS_TO_WIN){
                    return true;
                }
            }
        }
        return  false;
    }
}
package lesson_2;
import java.util.Arrays;
public class MainLes2 {
    public static void main(String[] args) {
//   Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//      Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;

        int[] arr = {1, 0, 1, 0, 0, 0, 1, 1, 0, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
//   Задание 2. Задать пустой целочисленный массив размером 8.
//        С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        int[] arr2 = new int[8];
        for (int i = 1; i < arr2.length; i++) {
            arr2[i] = arr2[i - 1] + 3;
        }
        System.out.println(Arrays.toString(arr2));
//        Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//        пройти по нему циклом, и числа меньшие 6 умножить на 2;
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr3));
//        Задание 4. Создать квадратный двумерный целочисленный массив
//        (количество строк и столбцов одинаковое),
//        и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i + j == 4 || i == j) {
                    arr4[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.printf("%d ", arr4[i][j]);
            }
            System.out.println();
        }
//        Задание 5. ** Задать одномерный массив и найти в нем минимальный
//        и максимальный элементы (без помощи интернета);

        int[] arr5 = {23, 34, 6, 67, 86, 24, 7, 464, 12};
        int min = arr5[0];
        int max = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] > max) {
                max = arr5[i];
            }
            if (arr5[i] < min) {
                min = arr5[i];
            }
        }
        System.out.printf("min = %d; max = %d \n", min, max);

        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 2, 10, 1}));


    }

    //    Задание 6. ** Написать метод, в который передается не пустой одномерный целочисленный массив,
//    метод должен вернуть true, если в массиве есть место, в котором сумма левой и
//    правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true,
//    checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.
    public static boolean checkBalance(int[] arr) {
        int sumLeft = 0;
        for (int i = 0; i < arr.length; i++) {
            int sumRight = 0;
            sumLeft += arr[i];
            for (int n = i + 1; n < arr.length; n++) {
                sumRight += arr[n];
            }
            if (sumRight == sumLeft) {
                return true;
            }
        }
        return false;
    }
//    Задание 7. **** Написать метод, которому на вход подается одномерный массив и число n
//         (может быть положительным, или отрицательным), при этом метод должен сместить все
//    элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
}

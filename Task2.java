package Seminar_3;

// Пусть дан произвольный список целых чисел, удалить из него чётные числа

public class Task2 {

    public static void main(String[] args) {
        int[] array = { 1, 4, 3, 456, 16 };

        System.out.print("Четные элементы массива: [");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print(array[array.length - 1] + "]");
    }
}
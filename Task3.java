package Seminar_3;

// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее ариф. из этого списка.

public class Task3 {
    public static void main(String[] args) {

        int[] arrayList = { 8, 0, 11, 15, 96 };
        int max = arrayList[0];
        for (int i = 1; i < arrayList.length; i++) {
            if (arrayList[i] > max) {
                max = arrayList[i];
            }
        }
        System.out.println("Максимальное значение в массиве: " + max);

        int min = arrayList[0];
        for (int i = 1; i < arrayList.length; i++) {
            if (arrayList[i] < min) {
                min = arrayList[i];
            }
        }
        System.out.println("Минимальное значение в массиве: " + min);

        int sum = 0;
        for (int i : arrayList) {
            sum += i;
        }
        System.out.println("Значение среднего арифметического равно:  " + sum/arrayList.length);
    }
}

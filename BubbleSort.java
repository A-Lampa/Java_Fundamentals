package EPAM.Fundamentals;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        //System.out.println(Arrays.toString(array)); // выводим массив в строку
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false; //нужно, чтобы выйти из цикла после завершения сортировки
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) { //в конце, когда это условие не выполняется, мы не присваиваем true и выходим из цикла
                    swap(array, i, i-1);
                    //System.out.println(Arrays.toString(array));
                    needIteration = true; //нужно, чтобы снова войти в for после первого раунда сортировки (когда 7<7)
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void swap(int[] array, int ind1, int ind2) { //здесь метод, который меняет местами 2 числа
        int tmp = array[ind1]; // сохраняем первое число, чтобы не потерять и потом присвоить второму
        array[ind1] = array[ind2]; // Здесь первое число делаем равным второму
        array[ind2] = tmp; // а здесь второе делаем равным первому
    }
}

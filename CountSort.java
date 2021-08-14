package EPAM.Fundamentals;

import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] array = new int[]{64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        countSort(array); //вызвали метод
        System.out.println(Arrays.toString(array));
    }

    public static void countSort(int[] array) {
        final int MAX_VALUE = 100; //какой диапазон массива максимальный. Это константа

        int[] count = new int[MAX_VALUE]; //создаем массив счетчика, размером с диапазон

        for (int i = 0; i < array.length; i++) { //заполняем массив счетчика, идем по всему массиву - посчитаем, сколько раз встречается каждое число в исх.массиве
            count[array[i]] = count[array[i]] + 1; //увелич.счетчик соотв.числа, когда оно нам встречается, на единицу
        }
        System.out.println(Arrays.toString(count));
        //после того, как цикл отработает, мы получим массив счетчика, где подсчитано, сколько раз встречается каждое число
        //теперь строим отсортированный массив:

        int arrayindex = 0; //нам понадобится переменная, где мы будем запоминать текущую позицию в результирующем массиве
        for (int i = 0; i < count.length; i++) {//цикл от нуля до длины массива-счетчика
            for (int j = 0; j < count[i]; j++) {//в этом цикле мы заполняем массив каким-либо числом столько раз, сколько у нас в счетчике подсчетов для этого числа
                array[arrayindex] = i;
                arrayindex++; //его продвигаем вперед
            }
        }
    }
}

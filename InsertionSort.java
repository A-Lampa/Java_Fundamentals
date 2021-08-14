package EPAM.Fundamentals;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));

        for (int left = 0; left< array.length; left++){
          int value = array[left]; // вытаскиваем значение элемента
          int i = left - 1;   // перемещаемся по элементам, которые находятся перед вытащенным элементом
            for (; i>=0; i--){
                if (value < array[i]){ //если вытащили значение, которое меньше тех, что слева - передвигаем этот элемент дальше влево
                    array[i+1] = array[i];
                } else {
                    break; //если вытащили значение, которое больше тех, что слева - останавливаемся на этом месте
                }
            }
            array[i+1] = value; // в освободившееся место вставляем вытащенное значение
            System.out.println(Arrays.toString(array));
        }
        System.out.println(Arrays.toString(array));
    }
}

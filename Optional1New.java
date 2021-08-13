package EPAM.Fundamentals;

//Ввести n чисел с консоли. Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

import java.util.Arrays;
import java.util.Scanner;

public class Optional1New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите несколько чисел через пробел:");

        String input = sc.nextLine();
        String[] inputArray = input.split(" ");
        System.out.println("Массив из введеных элементов: " + Arrays.toString(inputArray));

        String max = inputArray[0];
        for (int i = 1; i < inputArray.length; i++) {
            if (max.length() < inputArray[i].length()) {
                max = inputArray[i];
            }
        }
        System.out.println("Самое длинное число: " + max);
        System.out.println("Длина самого длинного числа: " + max.length());

        String min = inputArray[0];
        for (int j = 1; j < inputArray.length; j++) {
            if (min.length() > inputArray[j].length()) {
                min = inputArray[j];
            }
        }
        System.out.println("Самое корткое число: " + min);
        System.out.println("Длина самого короткого числа: " + min.length());


        //Самое длинное слово вывести

        //Scanner sc = new Scanner(System.in);

        //System.out.print("Введите предложение: ");
        //String input = sc.nextLine();
        //String[] inputArray = input.split(" ");

        //String max = inputArray[0];

        //for(int i = 1; i < inputArray.length; ++i){
        //if(max.length() < inputArray[i].length())
        //max = inputArray[i];
        //}
        //System.out.println("Самое длинное слово: " + max);
        //}


    }
}


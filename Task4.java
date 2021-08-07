package EPAM.Fundamentals;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите числа через пробел: ");

        String user_input = scan.nextLine(); //получим строку из введенных чисел
        String[] stringsArray = user_input.split(" "); //разделим по пробелам

        int[] intArray = new int[stringsArray.length]; //создадим массив из целых чисел, используя длину введенных значений

        int sum = 0; // создадим переменную, которая будет считать сумму
        int multiplication = 1; // создадим переменную, которая будет считать произведение

        for (int i = 0; i < stringsArray.length; i++) {
            intArray[i] = Integer.parseInt(stringsArray[i]); //преобразовываем строковый массив в числовой
            sum += intArray[i];
            multiplication *= intArray[i];
        }
        System.out.println("Сумма введенных чисел: " + sum);
        System.out.println("Произведение введенных чисел: " + multiplication);
    }
}

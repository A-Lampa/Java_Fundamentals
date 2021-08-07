package EPAM.Fundamentals;

import java.nio.IntBuffer;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Объявляем сканнер
        System.out.println("Введите последовательность целых чисел:");

        String str = sc.nextLine(); // метод nextLine считывает и возвращает введенное целочисленное значение
        String reverse = new StringBuffer(str).reverse().toString(); // программа буферизует строку с исп.метода
        // StringBuffer, реверсирует буфер и преобразует его с помощью метода toString
        System.out.println("Последовательность до реверса: " + str);
        System.out.println("Последовательность после реверса: " + reverse);
        sc.close();
    }

}

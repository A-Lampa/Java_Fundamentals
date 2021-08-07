package EPAM.Fundamentals;

import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //Объявляем сканер с консоли
        Random random = new Random();  //Объявляем генератор случайностей

        System.out.println("Введите любое количество случайных чисел (целое число): ");
        int N = scanner.nextInt(); //Объявляем количество случайных чисел (целое число), которое будет задавать пользователь и считываем со сканера и возвращаем это значение
        int[] usersArray = new int[N]; //Объявляем массив, который получится после ввода N

        // создание массива на основе введенного пользователем числа N
        for (int i = 0; i < N; i++)
            usersArray[i] = (int) (Math.random() * N); //заполняем массив рандомными числами в кол-ве N штук
        for (int i: usersArray) //Цикл for each - он выводит все данные из массива
            System.out.println(i); //Вывод с переходом на новую строку

        for (int i = 0; i < N; i++)
            usersArray[i] = (int) (Math.random() * N);
        for (int i: usersArray) //Цикл for each
            System.out.print(i); //Вывод без перехода на новую строку

                }
            }



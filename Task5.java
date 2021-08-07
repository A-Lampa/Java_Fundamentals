package EPAM.Fundamentals;

import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {
        String [] monthArray = {"Вы ввели число в неверном диапазоне!", "Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12: ");

        int value = sc.nextInt();

        if (value>=0 && value<=12) {
            System.out.println(monthArray[value]);
                } else {
            System.out.println("Вы ввели число в неверном диапазоне!");
        }
        }
    }

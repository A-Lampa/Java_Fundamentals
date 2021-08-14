package EPAM.Fundamentals;

import java.util.Scanner;

public class Task5Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12: ");

        int monthNumber = sc.nextInt();
        switch (monthNumber){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            default:
                System.out.println("Неверный формат ввода");
        }
    }
}

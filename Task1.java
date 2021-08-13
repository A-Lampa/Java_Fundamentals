package EPAM.Fundamentals;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //Объявляем сканнер
        System.out.println("Введите свое имя:");//Программа просит ввести имя пользователя в строку

      String name = sc.nextLine(); // метод nextLine считывает и возвращает введенное значение (фразу), просто next - одно слово
        System.out.println("Привет, " + name);
        sc.close(); //закрываем сканер после ввода имени, чтобы он не потреблял ресурсы
                }
                    }



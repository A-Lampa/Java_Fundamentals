package EPAM.Fundamentals;

//Найти количество чисел, содержащих только четные цифры

import java.util.Arrays;
import java.util.Scanner;

public class Optional5 {
    public static void main(String[] args) {

        Scanner scanner; //объявляем переменную scanner типом Scanner
        scanner = new Scanner(System.in); //создаем новый объект типа Scanner
        System.out.println("Введите целые числа через пробел:");

        String user_input; //объявляем переменную типа String с именем user_input
        user_input = scanner.nextLine(); // применяем метод nextLine, чтобы из введенных в консоль значений получить строку

        String[] user_array; //объявляем массив, в котором данные будут типа String, с именем user_array
        user_array = user_input.split(" "); //разделим по пробелам


        //можем преобразовать его в числовой, чтобы выполнять какие-то операции:

        int[] intArray = new int[user_array.length]; //создадим числовой массив (еще пустой) той длины, сколько чисел ввели в консоль
        System.out.println(Arrays.toString(intArray)); //вывод пустого массива, чтобы убедиться в правильности длины

        for (int i = 0; i < user_array.length; i++) { //заполняем массив, не выходя за границы длины
            intArray[i] = Integer.parseInt(user_array[i]); //помещаем в числовой массив элементы, введенные в user массив, преобразуя их в int
            System.out.println(Arrays.toString(intArray));
            //System.out.print(intArray[i] + " "); //получаем на выходе числа, записанные в одну строку через пробел
        }


            int sum1 = 0;
            boolean needSum = true;
            for (int element : intArray) { //делаем каждый элемент массива символьным массивом
                char[] chars1 = String.valueOf(Math.abs(element)).toCharArray(); //Math.abs - это модуль элемента
                //System.out.println(chars1); //вывод тех массивов char, которые исп.на данный момент
                for (int i1 = 0; i1 < chars1.length; i1++) {
                    if (chars1[i1] % 2 == 0) {
                        needSum = true;
                        } else {
                        needSum = false;
                    }
                }
                if (needSum) {
                    sum1 = sum1 + 1;
                    }
            }
            System.out.println("Ответ: " + sum1);
        }
    }


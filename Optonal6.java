package EPAM.Fundamentals;

// Ввести n чисел с консоли. Найти число, цифры в котором идут в строгом порядке возрастания. Если таких чисел несколько, найти первое из них.

import java.util.Arrays;
import java.util.Scanner;

public class Optonal6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целые числа через пробел: ");

        String userInput = sc.nextLine();
        String[] userArray = userInput.split(" ");
        System.out.println(Arrays.toString(userArray));

        boolean rightArray = false;

        for (int j = 0; j < userArray.length; j++) { //проходим по изначальному массиву
            char[] charArray = userArray[j].toCharArray();
            //System.out.println(charArray);

            for (int a = 0; a < charArray.length - 1; a++) { //проходим по массиву первого элемента
                if (charArray[a] < charArray[a + 1]) {
                    rightArray = true;
                } else {
                    rightArray = false;
                    break; //чтобы при первом же несовпадении в длинном числе не сравнивал другие символы
                }
            }
            if (rightArray) {
                System.out.println("Число, цифры в котором идут в порядке возрастания: " + userArray[j]);
                break; //если несколько - найдет первое из них. Если убрать - то напишет все такие возможные
            }
        }
    }
}

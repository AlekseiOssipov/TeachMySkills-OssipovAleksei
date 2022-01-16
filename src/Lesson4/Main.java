package Lesson4;

//* В спортивном центре есть три возрастные группы для занятий волейболом:
//1 группа - от 7 до 13 лет;
//2 группа - от 14 до 17 лет;
//3 группа - от 18 до 65 лет.
//Напишите метод, который принимает возраст человека и возвращает целое число,
// которое обозначает номер группы в которую его надо определить, если подходящей группы нет
// - верните ‘-1’.

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int years = readConsole("Enter age of the person", 0, 231 - 1);
                System.out.printf("Enter value: %s;%sAnswer: %s;", years, System.lineSeparator(), getResult(years));
            }

            public static int readConsole(String answer, int startRange, int endRange) {
                Scanner read = new Scanner(System.in);
                boolean value = false;
                int result = 0;
                while (!value) {
                    System.out.printf("%s: ", answer);
                    try {
                        result = Integer.valueOf(read.next());
                        if (!(value = result >= startRange && result <= endRange)) {
                            System.out.printf("Incorrect value [%s <= value <= %s]. Try again.%s", startRange, endRange, System.lineSeparator());
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("The value is not number. Try again.");
                    }
                }
                return result;
            }

            public static String getResult(int years) {
                String result;
                if (years >= 0 && years <= 6) {
                    result = "BABY";
                } else if (years > 6 && years <= 17) {
                    result = "SCHOOLCHILD";
                } else if (years > 17 && years <= 64) {
                    result = "ADULT";
                } else if (years > 64 && years <= 120) {
                    result = "ELDER";
                } else {
                    result = "GHOST";
                }
                return result;
            }


    int num = 8;
        switch (num) {
        case 1:
            System.out.println("Number is 1!");
            break;
        case 8:
            System.out.println("Number is 8!");
            break;
        case 9:
            System.out.println("Number is 9!");
            break;
        default:
            System.out.println("Number is not 1, 8 or 9");


    }
}

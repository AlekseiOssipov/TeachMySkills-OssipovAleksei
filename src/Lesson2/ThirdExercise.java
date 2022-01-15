package Lesson2;

import java.util.Scanner;

public class ThirdExercise {

    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        String weight, height, result;

        System.out.println("Введите первое число: ");
        weight = scanner.nextLine();

        System.out.println("Введите второе число: ");
        height = scanner.nextLine();
        result = "ООООО\n" +
                "ООООО\n" +
                "ООООО\n" +
                "ООООО\n" +
                "ООООО\n";

        System.out.println("Результат: \n" + result);
    }
}

package Lesson2;

import java.util.Scanner;

public class thirdExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
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

        scanner.close();
    }

}

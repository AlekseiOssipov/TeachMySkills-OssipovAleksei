package Lesson3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Computer implements ComputerLife {
    String type;
    double cost;
    String brand;
    String model;
    int maxWorkingCount;

    public Computer() {}

    public Computer(String type, double cost, String brand, String model, int maxWorkingCount) {
        this.type = type;
        this.cost = cost;
        this.brand = brand;
        this.model = model;
        this.maxWorkingCount = maxWorkingCount;
    }

    @Override
    public void turnOn() {
        int userNumber;
        int correctNumber;
        Scanner scanner = new Scanner(System.in);
        correctNumber = (int) Math.floor(Math.random() * 1);
        System.out.print("Чтобы включить компьютер " + brand + ", вам нужно ввести число от 0 до 1: ");
        userNumber = scanner.nextInt();
        if (userNumber == correctNumber)
            System.out.println("Поздравляю, компьютер включился!");
        else {
            System.out.println("Вы не угадали, компьютер сгорел!");
        }
    }
    @Override
    public void turnOff() {
        int userNumber;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Чтобы выключить компьютер, введите цифру 3: ");
            try {
                userNumber = scanner.nextInt();
                if (userNumber == 3) {
                    System.out.println("Ваш компьютер успешно выключился");
                    break;
                } else {
                    System.out.println("ОШИБКА! Вы ввели неправильную цифру!!!");
                    continue;
                }
            } catch (final InputMismatchException e) {
                scanner.nextInt();
                continue;
            }
        } while (true);

    }
    public String toString() {
        return "Тип продукта = " + type + ", cтоимость = " + cost + " евро" + ", бренд = " + brand +
                ", модель = " + model + ", максимальное количество открывания = " + maxWorkingCount + " раз";
    }

}
package Lesson3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Computer implements ComputerLife {

    static Scanner scanner = new Scanner(System.in);
    Ram ram = new Ram();
    Cpu cpu = new Cpu();
    Hdd hdd = new Hdd();
    String type;
    double cost;
    String brand;
    String model;
    int maxWorkingCount;

    public Computer() {}

    public void setMaxWorkingCount(int maxWorkingCount) {
        this.maxWorkingCount = maxWorkingCount;
    }

    public int getMaxWorkingCount() {
        return maxWorkingCount;
    }

    private static int buildMaxWorkingCount() {

        return 5 + (int) Math.round(Math.random() * 10);
    }

    public boolean turnOn() {
        int userNumber;
        int correctNumber;

        if ( this.maxWorkingCount == 0 ){
            System.out.println("Дурачок? Он же сгорел!");
            return false;
        }
        correctNumber = (int) Math.floor(Math.random() * 1);
        System.out.print("Чтобы включить компьютер " + brand + ", вам нужно ввести число от 0 до 1: ");
        userNumber = scanner.nextInt();
        if (userNumber == correctNumber)
            System.out.println("Поздравляю, компьютер включился! Включений осталось: " + maxWorkingCount);
        else {
            System.out.println("Вы не угадали, компьютер сгорел!");
            this.maxWorkingCount = 0;
        }
        return true;
    }

    public void turnOff() {

        int userNumber;
        System.out.println("Чтобы выключить компьютер, введите цифру 3: ");
        userNumber = scanner.nextInt();
        if (userNumber == 3) {
            System.out.println("Ваш компьютер успешно выключился");
        } else {
            System.out.println("ОШИБКА! Вы ввели неправильную цифру!!!");
        }
    }

    @Override
    public void configureSettings() {
        System.out.print("Введите тип: ");
        type = scanner.nextLine();
        System.out.print("Введите бренд: ");
        brand = scanner.nextLine();
        System.out.print("Введите модель: ");
        model = scanner.nextLine();
        cost = 100 + Math.round(Math.random() * 1000);
        ram.configureSettings();
        cpu.configureSettings();
        hdd.configureSettings();
        setMaxWorkingCount(buildMaxWorkingCount());
    }


    public String toString() {
        return "Computer - " +
                "\n Тип:" + type + '\'' +
                "\n Цена: " + cost +
                "\n Брэнд: " + brand + '\'' +
                "\n Модель: " + model + '\'' +
                "\n RAM: " + ram +
                "\n Процессор: " + cpu +
                "\n Жёсткий диск: " + hdd +
                "\n Количество включений/выключений: " + maxWorkingCount;
    }

}

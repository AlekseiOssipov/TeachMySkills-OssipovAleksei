package Lesson4.firstexercise;

import java.util.Scanner;

//* В спортивном центре есть три возрастные группы для занятий волейболом:
//1 группа - от 7 до 13 лет;
//2 группа - от 14 до 17 лет;
//3 группа - от 18 до 65 лет.
//Напишите метод, который принимает возраст человека и возвращает целое число,
// которое обозначает номер группы в которую его надо определить, если подходящей группы нет
// - верните ‘-1’.

public class FirstExercise {
    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        System.out.println("Введите ваш возраст, чтобы определить вас в группу: ");
        int result = userInput.nextInt();

        if (result >= 7 && result <= 13) {
            System.out.println("Вы определены в 1 группу");
        } else if (result >= 14 && result <= 17) {
            System.out.println("Вы определены во 2 группу");
        } else if (result >= 18 && result <= 65) {
            System.out.println("Вы определены в 3 группу");
        } else {
            System.out.println("Вы не подходите ни в какую группу");
        }
    }
}

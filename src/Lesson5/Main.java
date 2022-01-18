package Lesson5;

import java.util.Scanner;

/*Создайте набор пар арабское – римское O, I, V, X, M
Напишите метод по переводу арабских чисел от 0 до 100 в римские используя данную мапу.*/

public class Main {

    public static void main(String[] arg){

        System.out.println("Введите число от 0 до 100 на арабском: ");
        Scanner scan = new Scanner (System.in);
        int number = scan.nextInt();
        String romanDigit = "";
        if (number < 0 || number > 100) {
            System.out.println( "Вы ввели что-то неправильно!");
        }
        else
        {
            System.out.println("Ваше число на римском : " + romanDigit);
            System.out.println(convert(number));
        }
    }

    public static String romanNumber(int n, String one, String five, String ten){
        if(n >= 1)
        {
            if(n == 1) {
                return one;
            } else if (n == 2) {
                return one + one;
            } else if (n == 3) {
                return one + one + one;
            } else if (n==4) {
                return one + five;
            } else if (n == 5) {
                return five;
            } else if (n == 6) {
                return five + one;
            } else if (n == 7) {
                return five + one + one;
            } else if (n == 8) {
                return five + one + one + one;
            } else if (n == 9) {
                return one + ten;
            }
        }
        return "";
    }

    public static String convert(int number) {
        if (number < 0 || number > 100) {
            return "Это число нельзя конвертировать";
        }

        String romanOnes = romanNumber(number % 10, "I", "V", "X");
        number /= 10;
        String romanTens = romanNumber(number % 10, "X", "L", "C");
        number /= 10;
        String romanHundreds = romanNumber(number % 10, "C", "D", "M");
        number /= 10;

        String result = romanHundreds + romanTens + romanOnes;
        return result;
    }

}

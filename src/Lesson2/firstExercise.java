package Lesson2;

import java.lang.Math;

public class firstExercise {

    public static void main(String[] args) {

        int number1 = 2054;
        short number2 = 23;
        byte number3 = 37;

        int maximumValue = Math.max(number1,number2);
        if(maximumValue>number3){
            maximumValue = Math.max(number1,number3);
        }
        else {
            maximumValue = Math.max(number2, number3);
        }

        System.out.println("Максимальное значение: " + maximumValue);

        int[] numbers = {number1, number2, number3};
        int result = 0;

        for (int m : numbers) {
            result += m;
        }
        System.out.println("Среднее значение: " + result / numbers.length);


        int minimumValue = Math.min(number1,number2);
        if(minimumValue>number3){
            minimumValue = Math.min(number1,number3);
        }
        else {
            minimumValue = Math.min(number2, number3);
        }
        System.out.println("Минимальное значение: " + minimumValue);
    }
}

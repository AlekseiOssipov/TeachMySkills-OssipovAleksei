package Lesson2;

public class FirstExercise {

    static int minimumValue;
    static int maximumValue;
    static int middleValue;

    public static void main(String[] args) {
        int integerNumber = 2054;
        short shortNumber = 23;
        byte byteNumber = 37;

        findMiddle(integerNumber, shortNumber, byteNumber);
        System.out.println("Максимальное значение: " + maximumValue);
        System.out.println("Минимальное значение: " + minimumValue);
        System.out.println("Среднее значение: " + middleValue);
    }

    public static void findMinMax(int firstNumber, int secondNumber){
        if (firstNumber < secondNumber){
            minimumValue = firstNumber;
            maximumValue = secondNumber;
        } else {
            minimumValue = secondNumber;
            maximumValue = firstNumber;
        }
    }

    public static void findMiddle(int firstNumber, int secondNumber, int thirdNumber){
        if ( firstNumber > secondNumber && firstNumber < thirdNumber ){
            middleValue = firstNumber;
            findMinMax(secondNumber, thirdNumber);
        } else if(secondNumber > firstNumber && secondNumber < thirdNumber){
            middleValue = secondNumber;
            findMinMax(firstNumber, thirdNumber);
        } else {
            middleValue = thirdNumber;
            findMinMax(firstNumber, secondNumber);
        }
    }
}
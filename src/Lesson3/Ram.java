package Lesson3;


import java.util.Random;

public class Ram implements ComputerLife {
    private int capacity;
    private String typeOfRam;

    public Ram() {}


    private static StringBuilder setType(){
        StringBuilder type = new StringBuilder("RAM ");
        Random random = new Random();

        for (int i = 0; i <= 10; i++) {
            char c = (char)(random.nextInt(22) + 'a');
            type.append(c);
        }
        return type;
    }

    @Override
    public void configureSettings() {

        typeOfRam = setType().toString();
        capacity = 4000 + (int) Math.round( Math.random() * 32000);
    }

    @Override
    public String toString() {
        return "Оперативная память = " + capacity + " GB" +
                ", тип памяти = " + typeOfRam;
    }
}

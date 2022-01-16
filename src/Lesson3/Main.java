package Lesson3;

public class Main {

    public static void main(String[] args) {

        Computer newComputer = new Computer();
        newComputer.configureSettings();
        System.out.println(newComputer);

        do {
            newComputer.turnOn();
            newComputer.turnOff();
        } while (newComputer.getMaxWorkingCount() == 0);
    }

}

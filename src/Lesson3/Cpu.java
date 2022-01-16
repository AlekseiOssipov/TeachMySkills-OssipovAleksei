package Lesson3;

public class Cpu implements ComputerLife {

    private double clockSpeed;
    private int coreCount;

    public Cpu() {}

    @Override
    public void configureSettings() {
        coreCount = 2 + (int) Math.round(Math.random() * 10);
        clockSpeed = 100 + (int) Math.round(Math.random() * 1000);
    }

    @Override
    public String toString(){
        return "Тактовая частота = " + clockSpeed +
                " ГГц, количество ядер = "
                + coreCount;
    }

}

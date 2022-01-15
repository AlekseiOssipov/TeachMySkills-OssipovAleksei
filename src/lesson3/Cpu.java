package lesson3;

public class Cpu {
    private String processorType;
    private double clockSpeed;
    private int coreCount;

    public Cpu() {}


    public Cpu(String processorType, double clockSpeed, int coreCount) {
        this.processorType = processorType;
        this.clockSpeed = clockSpeed;
        this.coreCount = coreCount;
    }

    @Override
    public String toString(){
        return "Тип процессора = " + processorType + ", тактовая частота = " + clockSpeed + " ГГц, количество ядер = "
                + coreCount;
    }

}

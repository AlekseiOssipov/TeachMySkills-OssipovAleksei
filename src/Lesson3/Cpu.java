package Lesson3;

public class Cpu extends Computer {
    private String processorType;
    private double clockSpeed;
    private int coreCount;

    public Cpu() {}

    public Cpu(String type, double cost, String brand, String model, int maxWorkingCount,
               String processorType, double clockSpeed, int coreCount) {
        super(type, cost, brand, model, maxWorkingCount);
        this.processorType = processorType;
        this.clockSpeed = clockSpeed;
        this.coreCount = coreCount;
    }

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

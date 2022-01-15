package Lesson3;


public class Ram extends Computer {
    private int capacity;
    private String typeOfRam;

    public Ram(String type, double cost, String brand, String model, int maxWorkingCount,
               int capacity, String typeOfRam) {
        super(type, cost, brand, model, maxWorkingCount);
        this.capacity = capacity;
        this.typeOfRam = typeOfRam;
    }

    public Ram() {}

    public Ram(int capacity, String typeOfRam) {
        this.capacity = capacity;
        this.typeOfRam = typeOfRam;
    }

    @Override
    public String toString() {
        return "Оперативная память= " + capacity + " GB" +
                ", тип памяти = " + typeOfRam;
    }
}

package Lesson3;

public class Hdd extends Computer {

    private String hddType;
    private int hddCapacity;
    private String hddBrand;

    public Hdd() {}

    public Hdd(String type, double cost, String brand, String model, int maxWorkingCount,
               String hddType, int hddCapacity, String hddBrand) {
        super(type, cost, brand, model, maxWorkingCount);
        this.hddType = hddType;
        this.hddCapacity = hddCapacity;
        this.hddBrand = hddBrand;
    }

    public Hdd(String hddType, int hddCapacity, String hddBrand) {
        this.hddType = hddType;
        this.hddCapacity = hddCapacity;
        this.hddBrand = hddBrand;
    }

    @Override
    public String toString(){
        return "Тип жёсткого диска = " + hddType + ", объём накопителя = " + hddCapacity + " GB, бренд = "
                + hddBrand;
    }
}

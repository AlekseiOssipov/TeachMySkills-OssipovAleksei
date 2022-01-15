package Lesson3;

public class Hdd {

    private String hddType;
    private int hddCapacity;
    private String hddBrand;


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

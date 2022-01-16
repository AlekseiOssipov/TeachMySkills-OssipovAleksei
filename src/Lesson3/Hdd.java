package Lesson3;

public class Hdd implements ComputerLife{

    private String hddType;
    private int hddCapacity;
    private String hddBrand;

    public Hdd() {}

    public String setHddType() {

        if ((int) Math.round( Math.random()) == 1) {
            return "SSD";
        }
        else {
            return "HDD";
        }
    }

    @Override
    public void configureSettings() {

        hddCapacity = 500 + (int) Math.round( Math.random() * 2000);
        hddType = setHddType();
        hddBrand = setBrand();
    }

    private String setBrand(){
        int randomNumberForChoice;
        String[] LIST_OF_BRANDS = {"ASUS", "Lenovo", "Apple", "Неизвестный"};

        randomNumberForChoice = (int) Math.round( Math.random() * 4);
        return LIST_OF_BRANDS[randomNumberForChoice];
    }

    @Override
    public String toString(){
        return "Тип жёсткого диска = " + hddType + ", объём накопителя = " + hddCapacity
                + " GB, бренд = " + hddBrand;
    }

}

package Lesson3;

public class Main {

    public static void main(String[] args) {

        Computer computerLenovo = new Computer("Laptop", 699, "Lenovo",
                "ThinkPad E15",665465784);
        Ram ramLenovo = new Ram(8, "DDR4");
        Cpu cpuLenovo = new Cpu("Intel",4.2,4);
        Hdd hddLenovo = new Hdd("SSD",256, "Intel");

        computerLenovo.turnOn();

        System.out.println(computerLenovo.toString() + "\n" + ramLenovo.toString() + "\n"
        + cpuLenovo.toString() + "\n" + hddLenovo.toString() + "\n");

        computerLenovo.turnOff();

    }
}

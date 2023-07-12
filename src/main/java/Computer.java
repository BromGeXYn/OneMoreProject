public class Computer {
    private int price;
    private String model;
    private HDD hdd;
    private RAM ram;

    public Computer(int price, String model) {
        this.price = price;
        this.model = model;
        hdd = new HDD();
        ram = new RAM();
    }

    public Computer(int price, String model, HDD hdd, RAM ram) {
        this.price = price;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }
    public void printCompInfo(){
        System.out.println("Computer model is: " + model +". Price is: " + price);
        System.out.println(hdd.toString());
        System.out.println(ram.toString());
    }




}

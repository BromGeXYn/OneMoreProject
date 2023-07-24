public class Phone {
    private String number;
    private String model;
    private int weight;
    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone() {
    }

    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
    public void receiveCall(String name){
        System.out.println("Calling " + name);
    }
    public void receiveCall(String name, String number){
        System.out.println("Calling " + name);
        System.out.println("Number: " + number);
    }
    public void sendMessage(String ... numbers){
        System.out.println("Sending message for numbers: ");
        for (String number : numbers){
            System.out.println(number);
        }
    }

}

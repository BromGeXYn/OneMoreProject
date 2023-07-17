public class RAM {
    private String model;
    private int capacity;
    public RAM() {
        this.model = "Netac";
        this.capacity = 4;
    }
    public RAM(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "RAM model is: " + model + ". Capacity is: " + capacity;
    }
}

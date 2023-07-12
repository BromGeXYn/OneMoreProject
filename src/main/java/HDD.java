public class HDD{
    private String model;
    private int capacity;
    private boolean isInternal;

    public HDD() {
        this.model = "LG";
        this.capacity = 250;
        this.isInternal = true;
    }

    public HDD(String model, int capacity, boolean isInternal) {
        this.model = model;
        this.capacity = capacity;
        this.isInternal = isInternal;
    }

    @Override
    public String toString() {
        return isInternal ?
                "Internal HDD, model is: " + model + ". Capacity is: " + capacity
                :"External HDD, model is: " + model + ". Capacity is: " + capacity;
    }
}

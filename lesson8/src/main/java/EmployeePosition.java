public enum EmployeePosition {
    WORKER(1),
    DIRECTOR(2);
    private int coefficient;
    EmployeePosition(int coefficient) {
        this.coefficient = coefficient;
    }
    public int getCoefficient() {
        return coefficient;
    }
}

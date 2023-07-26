public abstract class Employee {
    private String name;
    private String secondName;
    private int experience;

    public Employee(String name, String secondName, int experience) {
        this.name = name;
        this.secondName = secondName;
        this.experience = experience;
    }
    public abstract EmployeePosition getPosition();

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getExperience() {
        return experience;
    }

    public int getSalary(){
        int salary = 1000 * experience * EmployeePosition.WORKER.getCoefficient();
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", experience=" + experience +
                ", position=" + getPosition() +
                ", salary=" + getSalary() +
                '}';
    }
}

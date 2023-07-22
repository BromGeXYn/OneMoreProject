import javax.swing.text.Position;
import java.util.ArrayList;
import java.util.Arrays;

public class Director extends Employee{
    private ArrayList<Employee> subordinateWorkers = new ArrayList<>();

    public Director(String name, String secondName, int experience, EmployeePosition position) {
        super(name, secondName, experience, position);
    }
    public ArrayList<Employee> getSubordinateWorkers() {
        return subordinateWorkers;
    }
    public void addSubWorker(Employee toAdd){
        subordinateWorkers.add(toAdd);
    }
    @Override
    public int getSalary() {
        int salary = (1000 * getExperience() * EmployeePosition.WORKER.getCoefficient()) +
                (200 * subordinateWorkers.size());
        return salary;
    }
    @Override
    public String toString() {
        String info = super.toString();
        String subWorkers = "Current subworkers: ";
        for (Employee employee : subordinateWorkers) {
            subWorkers = subWorkers + employee.getName() + " " + employee.getSecondName() + ", ";
        }
        return info + "\n" + subWorkers;
    }
}

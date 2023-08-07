import javax.swing.text.Position;

public class Worker extends Employee{


    public Worker(String name, String secondName, int experience) {
        super(name, secondName, experience);
    }

    @Override
    public EmployeePosition getPosition() {
        return EmployeePosition.WORKER;
    }
}

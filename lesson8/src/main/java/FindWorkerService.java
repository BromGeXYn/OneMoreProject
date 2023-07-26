import java.util.ArrayList;

public class FindWorkerService{

    public boolean findWorker(Director director, String workerSecName){
        ArrayList<Employee> list = director.getSubordinateWorkers();
        for (Employee employee : list){
            if (employee.getSecondName().equals(workerSecName)){
                return true;
            } else if (employee.getPosition() == EmployeePosition.DIRECTOR){
                findWorker((Director) employee, workerSecName);
            } else {
                break;
            }
        }
        return false;
    }
}

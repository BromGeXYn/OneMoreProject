import java.util.ArrayList;

public class FindWorkerService{
    private static boolean isWorker = false;

    public boolean getIsWorker() {
        return isWorker;
    }

    public boolean findWorker(Director director, String workerSecName){
        ArrayList<Employee> list = director.getSubordinateWorkers();
        for (Employee employee : list){
            //String s = employee.getSecondName();
            if (employee.getSecondName().equals(workerSecName)){
                isWorker = true;
            }
        }
        for (Employee employee : list){
            if (employee instanceof Director){
                findWorker((Director) employee, workerSecName);
            }
        }
        isWorker = getIsWorker();
        return isWorker;
    }
}

import java.sql.SQLException;
import java.util.Map;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        StudentService service = new StudentService();
        service.addStudentToDb(new Student("user", false, 33, 2));
        service.delStudentFromDb(13);
        service.findById(3);
        City.addCityToDb(new City(7,"New-York"));
        City.delCityFromDb(7);
        Map<Student, City> studentCityMap = service.getInfo();
        service.showAllInfo(studentCityMap);
    }

}

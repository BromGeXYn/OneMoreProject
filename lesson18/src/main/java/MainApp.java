import java.sql.SQLException;

public class MainApp {
    public static void main(String[] args) throws SQLException {
        StudentService service = new StudentService();
        service.addStudentToDb(new Student("user", false, 33, 2));
        service.showInfo();
        service.delStudentFromDb(13); ///удаляет очень тупо, в лоб(
        service.showInfo();
        City.addCityToDb(new City(7,"New-York"));
        City.showCityInfo();
        City.delCityFromDb(7);
        City.showCityInfo();

    }

}

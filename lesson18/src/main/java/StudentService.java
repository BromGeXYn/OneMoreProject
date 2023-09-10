import java.sql.*;
import java.util.*;

public class StudentService {
    public Map<Student, City> getInfo() throws SQLException {
        Connection connection = DataBaseConnection.getConnection();
        Statement statement = connection.createStatement();
        Map<Student, City> map = new HashMap<>();
        ResultSet resultSet = statement.executeQuery("select * from students join cities c on c.city_id = students.city_id");
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            boolean male = resultSet.getBoolean(3);
            int age = resultSet.getInt(4);
            int city_id = resultSet.getInt(5);
            Student student = new Student(name, male, age, city_id);
            int cityNum = resultSet.getInt(6);
            String cityName = resultSet.getString(7);
            City city = new City(cityNum, cityName);
            map.put(student, city);
        }
        return map;
    }
    public void addStudentToDb(Student student) throws SQLException {
        Connection connection = DataBaseConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement
                ("insert into students (name, male, age, city_id) values (?, ?, ? ,?)");
        preparedStatement.setString(1, student.getName());
        preparedStatement.setBoolean(2, student.isMail());
        preparedStatement.setInt(3, student.getAge());
        preparedStatement.setInt(4, student.getCityId());
        preparedStatement.execute();
    }
    public void delStudentFromDb(Integer idS) throws SQLException {
        Connection connection = DataBaseConnection.getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("delete from students where id = " + idS);
    }
    public Student findById(Integer idS) throws SQLException {
        Connection connection = DataBaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from students where id = " + idS);
        List<Student> fromResSet = createFromResSet(resultSet);
        return fromResSet.get(0);
    }
    public void showAllInfo(Map<Student, City> map) {
        for (Map.Entry<Student, City> kv : map.entrySet()) {
            Student key = kv.getKey();
            City value = kv.getValue();
            System.out.println(key.toString() + " " + value.getCityName());
        }
    }
    private List<Student> createFromResSet(ResultSet resultSet) throws SQLException {
        List<Student> list= new ArrayList<>();
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String name = resultSet.getString(2);
            boolean male = resultSet.getBoolean(3);
            int age = resultSet.getInt(4);
            int city_id = resultSet.getInt(5);
            Student student = new Student(name, male, age, city_id);
            list.add(student);
        }
        return list;
    }
}


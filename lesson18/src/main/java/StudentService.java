import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentService {
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
    public void showInfo() throws SQLException {
        Connection connection = DataBaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from students join cities c on c.city_id = students.city_id");
        while (resultSet.next()){
            String[] row = new String[7];
            for (int i = 1; i <= 7; i++){
                row[i-1] = resultSet.getString(i);
            }
            System.out.println(Arrays.toString(row));
        }
    }
    public void addStudentToDb(Student student) throws SQLException {
        Connection connection = DataBaseConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement
                ("insert into students (name, male, age, city_id) values (?, ?, ? ,?)");
        //preparedStatement.setInt(1, student.getId());
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
}


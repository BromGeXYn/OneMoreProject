import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class City {
    private int id;
    private String cityName;
    public City(int id, String cityName) {
        this.id = id;
        this.cityName = cityName;
    }
    public City(String cityName) {
        this.cityName = cityName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCityName() {
        return cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public static void addCityToDb(City city) throws SQLException {
        String cityName1 = city.cityName;
        Connection connection = DataBaseConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("insert into cities (city_id, city_name) values (?, ?)");
        preparedStatement.setInt(1, city.getId());
        preparedStatement.setString(2, cityName1);
        preparedStatement.execute();
    }
    public static void delCityFromDb(Integer idS) throws SQLException {
        Connection connection = DataBaseConnection.getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate("delete from cities where city_id = " + idS);
    }
    public static void showCityInfo() throws SQLException {
        List<City> cities = new ArrayList<>();
        Connection connection = DataBaseConnection.getConnection();
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from cities");
        while (resultSet.next()) {
            int city_id = resultSet.getInt(1);
            String city_name = resultSet.getString(2);
            System.out.println("City id: " + city_id + " City: " + city_name);
        }

    }
}

package Database_Practice;

import java.sql.*;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        String urlPreset = "jdbc:mysql://localhost:3306/";
        String dataBaseName = "jdbctest";
        String url = urlPreset + dataBaseName;

        String userName = "root";
        String passWord = "";

        //DML
        String Query = "SELECT * FROM student WHERE id=18043";

        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection(url,userName,passWord);
        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery(Query);

        resultSet.next();
        String name = resultSet.getString("name");
        System.out.println(name);

        statement.close();
        connection.close();

    }
}

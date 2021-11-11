import java.sql.*;

public class MySqlTest {

    public static void main(String[] args) throws SQLException{
        String url = "jdbc:mysql://localhost:3308/comento_db";
        String userName = "root";
        String password = "1234";

        Connection connection = DriverManager.getConnection(url, userName, password);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from tbl_board");

        resultSet.next();
        String no = resultSet.getString("no");
        System.out.println(no);

        String title = resultSet.getString("title");
        System.out.println(title);

        String content = resultSet.getString("content");
        System.out.println(content);

        String writer = resultSet.getString("writer");
        System.out.println(writer);

        String pwd = resultSet.getString("pwd");
        System.out.println(pwd);

        String writeDate = resultSet.getString("writeDate");
        System.out.println(writeDate);

        resultSet.close();
        statement.close();
        connection.close();
    }
}

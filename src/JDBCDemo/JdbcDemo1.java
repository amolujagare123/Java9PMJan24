package JDBCDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        // 1 . loading a driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // 2 . creating a connection

        String username = "root";
        String password = "root";
        String connectionUrl = "jdbc:mysql://localhost:3306/9pmbatch";

        Connection con = DriverManager.getConnection(connectionUrl,username,password);

        // 3 . creating a statement
        Statement st = con.createStatement();

        // 4 . executing the query
        // insert / update / delete
        // DML - data manipulation language queries

        String sql = "insert into student values(15,'Isha','IT',89)";

        st.executeUpdate(sql);



    }
}

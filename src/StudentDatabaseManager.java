import java.sql.*;

public class StudentDatabaseManager {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/smc";
        String username = "root";
        String password = "";

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM student";
            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("phone") + " | " +
                                rs.getString("address")
                );
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
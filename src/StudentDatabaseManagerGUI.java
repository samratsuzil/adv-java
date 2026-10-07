import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class StudentDatabaseManagerGUI {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/smc";
        String username = "root";
        String password = "";

        JFrame frame = new JFrame("Student Records");

        String[] columns = {"ID", "Name", "Phone", "Address"};
        DefaultTableModel model = new DefaultTableModel(columns, 0);

        JTable table = new JTable(model);

        try {
            Connection con = DriverManager.getConnection(url, username, password);

            String sql = "SELECT * FROM student";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                Object[] row = {
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("phone"),
                        rs.getString("address")
                };

                model.addRow(row);
            }

            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        frame.add(new JScrollPane(table));

        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
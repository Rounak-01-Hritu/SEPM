import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class main {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/studentdb";
        String username = "root";        // your MySQL username
        String password = "#08ParthSamthaan";    // your MySQL password

        try {
            // 1. Create connection
            Connection conn = DriverManager.getConnection(url, username, password);

            // 2. SQL query
            String sql = "INSERT INTO students (name, age) VALUES (?, ?)";

            // 3. Prepare statement
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Rounak");
            ps.setInt(2, 21);

            // 4. Execute query
            ps.executeUpdate();

            System.out.println("Data inserted successfully!");

            // 5. Close connection
            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

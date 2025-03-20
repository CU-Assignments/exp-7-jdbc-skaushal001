import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUser {
    public static void main(String[] args) {
        String updateSQL = "UPDATE users SET name = ? WHERE id = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setString(1, "Jane Doe");
            preparedStatement.setInt(2, 1);
            preparedStatement.executeUpdate();
            System.out.println("User updated successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

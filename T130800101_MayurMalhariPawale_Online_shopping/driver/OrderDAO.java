package driver;
import java.sql.*;

public class OrderDAO {
    public void placeOrder(int orderId, int customerId, int productId, int quantity) {
        String insertOrder = "INSERT INTO orders (orderId, customerId, status) VALUES (?, ?, 'Pending')";
        String insertOrderProduct = "INSERT INTO order_products (orderId, productId, quantity) VALUES (?, ?, ?)";
        String updateStock = "UPDATE product SET stockQuantity = stockQuantity - ? WHERE productId = ?";

        try (Connection con = DBConnection.getConnection()) {
            con.setAutoCommit(false);
            try (PreparedStatement ps1 = con.prepareStatement(insertOrder);
                 PreparedStatement ps2 = con.prepareStatement(insertOrderProduct);
                 PreparedStatement ps3 = con.prepareStatement(updateStock)) {

                ps1.setInt(1, orderId);
                ps1.setInt(2, customerId);
                ps1.executeUpdate();

                ps2.setInt(1, orderId);
                ps2.setInt(2, productId);
                ps2.setInt(3, quantity);
                ps2.executeUpdate();

                ps3.setInt(1, quantity);
                ps3.setInt(2, productId);
                ps3.executeUpdate();

                con.commit();
                System.out.println("Order placed successfully!");
            } catch (SQLException e) {
                con.rollback();
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void viewOrders(int customerId) {
        String query = "SELECT o.orderId, o.status, p.name, op.quantity " +
                       "FROM orders o " +
                       "JOIN order_products op ON o.orderId=op.orderId " +
                       "JOIN product p ON op.productId=p.productId " +
                       "WHERE o.customerId=?";
        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, customerId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println("Order ID: " + rs.getInt("orderId") +
                                   ", Status: " + rs.getString("status") +
                                   ", Product: " + rs.getString("name") +
                                   ", Quantity: " + rs.getInt("quantity"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

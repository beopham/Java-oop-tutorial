package CRUD_KhachHang.Database;

import java.sql.Connection;

public class TestJDBC {
    public static void main(String[] args) {
        // Gọi hàm getConnection() trong JDBCUtil
        Connection c = JDBCUtil.getConnection();

        if (c != null) {
            System.out.println("✅ Kết nối thành công đến MySQL Database!");
            JDBCUtil.printInfo(c);
        } else {
            System.out.println("❌ Kết nối thất bại!");
        }

        JDBCUtil.closeConnection(c);
    }
}

package businessLogin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CSDL {
	
	private static Connection cnn;
	public static Connection getCnn() throws SQLException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/nong_san?useUnicode=true&characterEndcoding=UTF-8";
			cnn=DriverManager.getConnection(url, "root", "");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return cnn;
	}
	
	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			Connection conn=getCnn();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

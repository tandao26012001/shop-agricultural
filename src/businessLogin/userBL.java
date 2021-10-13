package businessLogin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javaBean.Catalog;
import javaBean.Product;
import javaBean.Uses;

public class userBL {
	public boolean validate(Uses loginBean) throws ClassNotFoundException {
        boolean status = false;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/nong_san?useUnicode=true&characterEndcoding=UTF-8");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection
            .prepareStatement("select * from user where username = ? and password = ? ")) {
            preparedStatement.setString(1, loginBean.getUsername());
            preparedStatement.setString(2, loginBean.getPassword());

            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            status = rs.next();

        } catch (SQLException e) {
            // process sql exception
            printSQLException(e);
        }
        return status;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
    public static List<Uses> LoadDB(String sql) {
		List<Uses> list=new ArrayList<Uses>();
		try (Connection cnn=CSDL.getCnn()){
			Statement stm=cnn.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			
			while(rs.next()) {
				Uses u=new Uses();
				u.setUsername(rs.getString(1));
				u.setPassword(rs.getString(2));
				list.add(u);   
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
    public static void insertUser(Uses pr) {
		try (Connection conn=CSDL.getCnn()){
			String sql="INSERT INTO `user`(`usename`, `password`, `permission`) VALUES (?,?,?)";
			PreparedStatement pstm=conn.prepareStatement(sql);
			pstm.setString(1,pr.getUsername());
			pstm.setInt(3,pr.getPermission());
			pstm.setString(2,pr.getPassword());
			pstm.executeLargeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}



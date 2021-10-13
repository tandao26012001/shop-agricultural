package businessLogin;

import javaBean.Catalog;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class catalogBL {
	
	//viet them cac lenh vao day de thuc hien yeu cau
	//???
	public static List<Catalog> LoadDB(String sql) {
		List<Catalog> list=new ArrayList<Catalog>();
		try (Connection cnn=CSDL.getCnn()){
			Statement stm=cnn.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			
			while(rs.next()) {
				Catalog c=new Catalog();
				c.setCatalogid(rs.getInt(1));
				c.setCatalogname(rs.getString(2));
				list.add(c);   
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public static List<Catalog> LoadCate(){
		String sql="SELECT * FROM `Catalog`";
		List<Catalog> ds=LoadDB(sql);
		return ds;
	}
	
//	public static List<Catalog> LoadCateParent(){
//		String sql="SELECT * FROM `catalog` ";
//		List<Catalog> ds=LoadDB(sql);
//		return ds;
//	}
	
//	public static List<Catalog> LoadCateSubParent(){
//		String sql="SELECT * FROM `catalog` WHERE parent_id is not null";
//		List<Catalog> ds=LoadDB(sql);
//		return ds;
//	}
}

package businessLogin;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javaBean.Product;

public class productBL {

	public static List<Product> loadDB(String sql){
		List<Product> ds=new ArrayList<Product>();
		try (Connection cnn=CSDL.getCnn()){
			Statement stm=cnn.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			
			while(rs.next()) {
				Product p=new Product();
				p.setProductid(rs.getInt(1));
				p.setCatalogid(rs.getInt(2));
				p.setProductname(rs.getString(3));
				p.setPrice(rs.getString(4));
				p.setStatus(rs.getInt(5));
				p.setDescription(rs.getString(6));
				p.setContent(rs.getString(7));
				p.setDiscount(rs.getInt(8));
				p.setImage(rs.getString(9));
				p.setCreated(rs.getString(10));
				ds.add(p);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ds;
	}
	
	public static List<Product> loadAllP(){
		String sql="SELECT * FROM `product`";
		List<Product> ds=loadDB(sql);
		return ds;
	}
	
	public static List<Product> loadAllPCate(int id){
		String sql="SELECT * FROM `product` WHERE id_catalog='"+id+"'";
		List<Product> ds=loadDB(sql);
		return ds;
	}
	
	public static int TongSoTrang(int soDongTrang, String sql) {
		List<Product> ds=loadDB(sql);
		int tongsotrang, tongSoDong;
		tongSoDong=ds.size();
		tongsotrang=tongSoDong/soDongTrang+(tongSoDong/soDongTrang==0?1:0);
		return tongsotrang;
	}
	
	public static List<Product> PhanTrangP(int soDongTrang, int trang){
		int vitri=(trang-1)*soDongTrang;
		String sql="SELECT * FROM `product` LIMIT "+vitri+"," +soDongTrang;
		List<Product> ds=loadDB(sql);
		return ds;
	}
	
	public static List<Product> PhanTrangBrow(int soDongTrang, int trang, int id){
		int vitri=(trang-1)*soDongTrang;
		String sql="SELECT * FROM `product` WHERE id_catalog='"+id+"' LIMIT "+vitri+" , " +soDongTrang;
		List<Product> ds=loadDB(sql);
		return ds;
	}

	public static List<Product> CTProduct(int id){
		String sql="SELECT * FROM `product` WHERE id_product='"+id+"'";
		List<Product> ds=loadDB(sql);
		return ds;
	}
	public static List<Product> TimKiem(String name)
	{
		String sql="SELECT * FROM `product` WHERE `name_product` LIKE '%"+name+"%'";
		List<Product> dsp=loadDB(sql);
		return dsp;
	}
	public static List<Product> loadPrice()
	{
		String sql="SELECT *FROM `product` ORDER BY `id_product` ASC LIMIT 5 ";
		List<Product> ds=loadDB(sql);
		return ds;
	}
	public static void main(String[] args) {
		
	}
	public static void insertKH(Product pr) {
		try (Connection conn=CSDL.getCnn()){
			String sql="INSERT INTO `product`(`id_product`, `id_catalog`, `name_product`, `price`, `status`, `description`, `content`, `discount`, `image_link`, `created`) VALUES (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement pstm=conn.prepareStatement(sql);
			pstm.setInt(1,pr.getProductid());
			pstm.setInt(2,pr.getCatalogid());
			pstm.setString(3,pr.getProductname());
			pstm.setString(4,pr.getPrice());
			pstm.setInt(5,pr.getStatus());
			pstm.setString(6,pr.getDescription());
			pstm.setString(7,pr.getContent());
			pstm.setInt(8,pr.getDiscount());
			pstm.setString(9,pr.getImage());
			pstm.setString(10,pr.getCreated());
			pstm.executeLargeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void delete(String sql) {
		try(Connection conn=CSDL.getCnn()) {
			Statement stm=conn.createStatement();
			@SuppressWarnings("unused")
			int result=stm.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void updateKH(Product pr) {
		try (Connection conn=CSDL.getCnn()){
			String sql="UPDATE `product` SET `id_catalog`=?,`name_product`=?,`price`=?,`status`=?,`description`=?,`content`=?,`discount`=?,`image_link`=?,`created`=? WHERE `id_product`=?";
			PreparedStatement pstm= conn.prepareStatement(sql);
			pstm.setInt(10,pr.getProductid());
			pstm.setInt(1,pr.getCatalogid());
			pstm.setString(2,pr.getProductname());
			pstm.setString(3,pr.getPrice());
			pstm.setInt(4,pr.getStatus());
			pstm.setString(5,pr.getDescription());
			pstm.setString(6,pr.getContent());
			pstm.setInt(7,pr.getDiscount());
			pstm.setString(8,pr.getImage());
			pstm.setString(9,pr.getCreated());
			pstm.executeLargeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Product getP(String id) {
		Product p=null;
		try(Connection connect=CSDL.getCnn()) {
			String sql= "SELECT * FROM `product` WHERE id_product='"+id+"'";
			Statement stm=connect.createStatement();
			ResultSet rs=stm.executeQuery(sql);
			
			if(rs.next()) {
				int productid=rs.getInt(1);
				int catalogid=rs.getInt(2);
				String productname=rs.getString(3);
				String price=rs.getString(4);
				int status=rs.getInt(5);
				String description=rs.getString(6);
				String content=rs.getString(7);
				int discount=rs.getInt(8);
				String image=rs.getString(9);
				String created=rs.getString(10);
				p=new Product(productid, catalogid, productname, price, status, description,content,discount,image,created);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return p;
	}
	
	//coded kieu nhu vay. hoi dai
//	public static SanPham getspTop1() {
//		String sql="SELECT *FROM `sanpham` ORDER BY masp DESC LIMIT 1";
//		SanPham sp=null;
//		try (Connection conn=SQLConncect.getConn()){
//			Statement stm=conn.createStatement();
//			ResultSet rs=stm.executeQuery(sql);
//			if(rs.next()) {
//				int masp=rs.getInt(1);
//				int math=rs.getInt(2);
//				String tensp=rs.getString(3);
//				int gia=rs.getInt(4);
//				int giagiam=rs.getInt(5);
//				String hinh=rs.getString(6);
//				int sl=rs.getInt(7);
//				int phai=rs.getInt(8);
//				String title=rs.getString(9);
//				String mota=rs.getString(10);
//				sp=new SanPham(masp, math, tensp, gia, giagiam, hinh, sl, phai, title, mota);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return sp;
//	}
}

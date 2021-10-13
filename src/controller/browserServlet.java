package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessLogin.catalogBL;
import businessLogin.productBL;
import javaBean.Catalog;
import javaBean.Product;

/**
 * Servlet implementation class browserServlet
 */
@WebServlet({ "/browserServlet", "/browser.html" })
public class browserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public browserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int categoryId = Integer.parseInt(request.getParameter("categoryId"));
		request.setAttribute("check", categoryId);
		// viet them cac lenh vao day de thuc hien yeu cau
		//???
		
		List<Catalog> ds=catalogBL.LoadCate();
		request.setAttribute("ds", ds);

//		int tongSoTrang, trang = 0;
//		String sql="SELECT * FROM `product` WHERE id_catalog ='"+categoryId+"'";
//		tongSoTrang=productBL.TongSoTrang(8, sql);
//		if(request.getParameter("trang")==null)
//			trang=1;
//		else
//			trang=Integer.parseInt(request.getParameter("trang"));
     	List<Product> dsp=productBL.loadAllPCate(categoryId);
//		request.setAttribute("trang", trang);
//		request.setAttribute("tongTrang", tongSoTrang);
		request.setAttribute("dsp", dsp);
		
		
		request.getRequestDispatcher("Display/browsers.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

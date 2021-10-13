package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessLogin.productBL;
import javaBean.Product;

/**
 * Servlet implementation class productServlet
 */
@WebServlet({ "/productServlet", "/product.html" })
public class productServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public productServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int tongSoTrang, trang;
		String sql="SELECT * FROM `product`";
		tongSoTrang=productBL.TongSoTrang(9, sql);
		if(request.getParameter("trang")==null)
			trang=1;
		else
			trang=Integer.parseInt(request.getParameter("trang"));
		List<Product> dsp=productBL.PhanTrangP(9, trang);
		request.setAttribute("trang", trang);
		request.setAttribute("tongSoTrang", tongSoTrang);
		request.setAttribute("dsp", dsp);
		
		
		request.getRequestDispatcher("Display/products.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

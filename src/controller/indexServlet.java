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
 * Servlet implementation class indexServlet
 */
@WebServlet({ "/indexServlet", "/index.html" })
public class indexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public indexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Catalog> ds=catalogBL.LoadCate();
		request.setAttribute("dsCate", ds);
		List<Product> dsprice=productBL.loadPrice();
		request.setAttribute("dsPrice", dsprice);
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
		
		
		request.getRequestDispatcher("Display/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

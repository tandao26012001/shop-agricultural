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
 * Servlet implementation class detailServlet
 */
@WebServlet({"/detailServlet","/detail.html"})
public class detailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public detailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// viet them cac lenh vao day de thuc hien yeu cau
		//???
		int idpr=Integer.parseInt(request.getParameter("productId"));
		//int id=Integer.parseInt(request.getParameter("idpr")); //cai param nay o dau vay
		List<Product> ctp=productBL.CTProduct(idpr);
		request.setAttribute("ctp", ctp);
		request.getRequestDispatcher("Display/details.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

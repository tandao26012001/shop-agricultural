package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import businessLogin.productBL;
import javaBean.Product;

/**
 * Servlet implementation class suaspServlet
 */
@WebServlet("/suaspServlet")
public class suaspServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public suaspServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id=request.getParameter("productid");
		
		Product p=productBL.getP(id);
		request.setAttribute("p", p);
		request.getRequestDispatcher("Admin/suasp.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		if(request.getParameter("btnsua")!=null) {
			int productid = Integer.parseInt(request.getParameter("txtproductid"));
			int catalogid=Integer.parseInt(request.getParameter("txtcatalogid"));
			String productname = request.getParameter("txtproductname");
			String price= request.getParameter("txtprice");
			int  status = Integer.parseInt(request.getParameter("txtstatus"));
			int discount = Integer.parseInt(request.getParameter("txtdiscount"));
			String description = request.getParameter("txtdescription");
			String content = request.getParameter("txtcontent");
			String image=request.getParameter("txtimage");
			String created=request.getParameter("txtcreated");
			
			Product p = new Product();
			p.setProductid(productid);
			p.setCatalogid(catalogid);
			p.setProductname(productname);
			p.setPrice(price);
			p.setStatus(status);
			p.setDiscount(discount);
			p.setDescription(description);
			p.setContent(content);
			p.setImage(image);
			p.setCreated(created);
			productBL.updateKH(p);
			response.sendRedirect("prServlet");
		}
	}
}

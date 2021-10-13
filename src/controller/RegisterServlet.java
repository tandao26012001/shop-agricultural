package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import businessLogin.userBL;
import javaBean.Uses;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet({"/RegisterServlet","/register.html"})
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		
		if(request.getParameter("btnRegister") !=null) {

			String name = request.getParameter("name");
			String pass= request.getParameter("password");
			int  promission = Integer.parseInt(request.getParameter("promission"));
			
			Uses p = new Uses();

			p.setUsername(name);
			p.setPassword(pass);
			p.setPermission(promission);

			userBL.insertUser(p);
		}
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

}

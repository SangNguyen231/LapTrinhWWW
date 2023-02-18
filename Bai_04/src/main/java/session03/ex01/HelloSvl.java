package session03.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloSvl
 */
@WebServlet("/demo")
public class HelloSvl extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public HelloSvl() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		String fname = req.getParameter("FirstName");
		String lname = req.getParameter("LastName");
		String name = fname + ' ' + lname;
		String email = req.getParameter("Email");
		String facebook = req.getParameter("Facebook");
		String shortbio = req.getParameter("ShortBio");
		String html = "<br>" + "<html>" + "<head>" + "<title>Result Page</title>" + "</head>" + "<body>"
				+ "First Name: " + name + "<br>" + "Email: " + email + "<br> Facebook URL: " + facebook + "<br>"
				+ "Short Bio: " + shortbio + "<br>" + "</body>" + "</html>";
		out.println(html);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package webfirst;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = { "/HelloServlet" })
public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>HelloServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>HelloServlet says \"Hello, World!\"</h1>");
			out.println("<h1>welcome</h1>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		try {
			out.println("<html>");
			out.println("<head>");
			out.println("<title>HelloServlet</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h1>HelloServlet says \"Hello, World!\"</h1>");
			out.println("<h1>welcome</h1>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}
}

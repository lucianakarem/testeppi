package testegit;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("oi")
public class TesteServlet extends HttpServlet{
protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out = response.getWriter();
out.println("<htm>");	
out.println("<body>");
out.println("<<h1><oi>/h1>");
out.println("</body>");
out.println("</html>");
}


}


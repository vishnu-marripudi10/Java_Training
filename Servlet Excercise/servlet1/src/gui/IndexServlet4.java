package gui;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/IndexServlet4")
public class IndexServlet4 extends HttpServlet {
private static final long serialVersionUID = 1L;
    public IndexServlet4() {
        super();
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter pw=response.getWriter();
      pw.write("<form action=\"./DisplayServlet4\" method=\"post\">");
      pw.write("Name: <input type=\"text\" name=\"Name\"><br>");
      pw.write("PhoneNumber: <input type=\"text\" name=\"PhoneNumber\"><br>");
      pw.write("Email: <input type=\"text\" name=\"Email\"><br>");
      pw.write("City: <input type=\"text\" name=\"City\"><br>");
      pw.write("<input type=\"submit\" value=\"submit\">");
      pw.write("</form>");
      pw.close();
}
}

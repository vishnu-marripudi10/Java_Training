package gui;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DisplayServlet4")
public class DisplayServlet4 extends HttpServlet {
private static final long serialVersionUID = 1L;
    public DisplayServlet4() {
        super();
    }

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter pw=response.getWriter();
String Name=request.getParameter("Name");
String phoneNumber=request.getParameter("PhoneNumber");
String Email=request.getParameter("Email");
String City=request.getParameter("City");
pw.println("<h1>The user details are</h1>");
pw.write("<table border=\"1\">");
pw.write("<tr>");
pw.write("<td>Name</td><td>PhoneNumber</td><td>Email</td><td>City</td>");
pw.write("</tr>");
pw.write("<body>");
pw.write("<td>"+Name+"</td><td>"+phoneNumber+"</td><td>"+Email+"</td><td>"+City+"</td><td>");
pw.write("</body>");
pw.write("</table>");
pw.close();
}
}
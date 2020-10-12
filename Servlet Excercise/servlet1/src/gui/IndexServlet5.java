package gui;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/IndexServlet5")
public class IndexServlet5 extends HttpServlet {
private static final long serialVersionUID = 1L;
    public IndexServlet5() {
        super();
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
     PrintWriter pw=response.getWriter();
     pw.write("<form action=\"./DisplayServlet5\" method=\"post\">");
     pw.write("<h1 color=red>Event Creation</h1>");
     pw.write("Eventname :\t<input type=\"text\" name=\"eventname\" required><br>");
     pw.write("Hallname :\t<input type=\"text\" name=\"hallname\"><br>");
     pw.write("Event type:\t<input type=\"radio\" name=\"text\" value=\"Exhibition\">Exhibition</input><br>");
     pw.write("\t\t\t\t\t<input type=\"radio\" name=\"text\" value=\"Stage event\">Stage event</input><br>");
     pw.write("Details<input type=\"text\" name=\"details\"><br>");
     pw.write("Owner<input type=\"text\" name=\"owner\"><br>");
     pw.write("Start Date<input type=\"text\" name=\"startdate\"><br>");
     pw.write("End Date<input type=\"text\" name=\"enddate\"><br><br>");
     pw.write("<input type=\"submit\" value=\"Create\">");
     //pw.write("<button type=\"create\">Create!</button>");
     pw.write("</form>");
     pw.close();
}

}
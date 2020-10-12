package gui;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DisplayServlet5")
public class DisplayServlet5 extends HttpServlet {
private static final long serialVersionUID = 1L;
public DisplayServlet5() {
super();
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html");
PrintWriter pw = response.getWriter();
String EventName=request.getParameter("eventname");
String HallName=request.getParameter("hallname");
String EventType=request.getParameter("eventtype");
String Details=request.getParameter("details");
String Owner=request.getParameter("owner");
String Startdate=request.getParameter("startdate");
String Enddate=request.getParameter("enddate");
pw.println("<h1>Event details are</h1>");
pw.write("<table border=\"1\">");
pw.write("<body>");
pw.write("<tr><th>EventName<td>"+EventName+"</td></th></tr>"
+ "<tr><th>HallName<td>"+HallName+"</td></th></tr>"
+ "<tr><th>EventType<td>"+EventType+"</td></th></tr>"
+"<tr><th>Details<td>"+Details+"</td></th></tr>"
+"<tr><th>Owner<td>"+Owner+"</td></th></tr>"
+"<tr><th>Startdate<td>"+Startdate+"</td></th></tr>"
+"<tr><th>Enddate<td>"+Enddate+"</td></th></tr>");
pw.write("</body>");
pw.write("</table>");
pw.close();


}

}
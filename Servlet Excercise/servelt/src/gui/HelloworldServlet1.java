package gui;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Helloworld")
public class HelloworldServlet1 extends HttpServlet {
private static final long serialVersionUID = 1L;
        public HelloworldServlet1() {
        super();
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<h1 style=\"text-align: center;\">Welcome to Hall Paradise </h1");
out.println("<h1 style=\"color:pink;\"></h1");
out.println("<p>The type of events are</p>");
out.println("<li style=\"text-align: center;\">Exhibition</li>");
out.println("<li style=\"text-align: center;\">Stage Show</li>");
out.println("</html>");
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
}
}
package gui;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/HelloWorldServlet2")
public class HelloWorldServlet2 extends HttpServlet {
private static final long serialVersionUID = 1L;
      public HelloWorldServlet2() {
        super();
    }
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
PrintWriter out=response.getWriter();
out.println("<html>");
out.println("<h1 style=\"text-align: center;\">Welcome to Hall Paradise </h1");
out.println("<nav><a href=\"Exhibition.html\">Exhibition</a></nav>");
out.println("<nav><a href=\"Stage Show.html\">Stage show</a></nav>");
   out.println("</html>");
}
protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
doGet(request, response);
}

}
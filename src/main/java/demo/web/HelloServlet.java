package demo.web;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String value = request.getParameter("name");

        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h1>" + value + "</h1>");
        out.println("</body></html>");
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");

        PrintWriter myResponse = response.getWriter();
        String message = "This is your response from a POST call. <br> The response is a Java Servlet !";

        myResponse.println("<li><b>You enter name: </b>" + request.getParameter("name") + "</li>");
        myResponse.println("<li><b>You enter phone: </b>" + request.getParameter("telephone") + "</li>");


    }

    public void destroy() {
    }
}
package vn.edu.iuh.fit.demomvc;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.iuh.fit.entities.User;
import vn.edu.iuh.fit.services.UserService;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();

        User us1=new User("teo","teo@gmail.com","123","disable");
        User us2=new User("det","det@gmail.com","123","disable");
        User us3=new User("men","men@gmail.com","123","disable");

        UserService userService = new UserService();
        userService.save(us1);
        userService.save(us2);
        userService.save(us3);

        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}
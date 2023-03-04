package vn.edu.iuh.fit.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.edu.iuh.fit.entities.User;
import vn.edu.iuh.fit.services.UserService;

import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = "/Controller")
public class MainController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        UserService userService = new UserService();
        HttpSession session = request.getSession(true);

        switch (action) {
            case "list_users":
                List<User> lst = userService.findAll();
                session.setAttribute("users", lst);
                response.sendRedirect("list_users.jsp");
                break;
            case "add_new_user_view":
                response.sendRedirect("new_users.jsp");
                break;
            case "add_new_user":
                String userName = request.getParameter("username");
                String email = request.getParameter("email");
                String password = request.getParameter("password");
                String state = request.getParameter("state");
                User user = new User(userName, email, password, state);
                userService.save(user);
                response.sendRedirect("Controller?action=list_users");
                break;
            case "edit_user_view":
                String userid = request.getParameter("id");
                User selUser=userService.findById(new User(),Long.parseLong(userid));
                session.setAttribute("selUser",selUser);
                response.sendRedirect("edit_user.jsp");
                break;
            case "update_user":
                userid = request.getParameter("userid");
                userName = request.getParameter("username");
                email = request.getParameter("email");
                password = request.getParameter("password");
                state = request.getParameter("state");
                User user1 = new User(userName, email, password, state);
                user1.setUserId(Long.parseLong(userid));
                userService.updateUser(user1);
                response.sendRedirect("Controller?action=list_users");
                break;
            case "delete_user":

                userid = request.getParameter("id");
                User delUser = new User();
                delUser.setUserId(Long.parseLong(userid));
                userService.deleteUser(delUser,Long.parseLong(userid));
                response.sendRedirect("Controller?action=list_users");
                break;
        }
    }
}

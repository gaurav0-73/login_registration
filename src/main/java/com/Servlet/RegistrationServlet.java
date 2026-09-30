package com.Servlet;

import java.io.IOException;

import com.nit.Dao.User;
import com.nit.Dao.UserDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String number = req.getParameter("number");
        String gender = req.getParameter("gender");
        String password = req.getParameter("pass");
        
        System.out.println("NAME = [" + name + "]");
        System.out.println("NUMBER = [" + number + "]");

        // Validation
        if (name == null || name.trim().isEmpty()
                || number == null || !number.matches("\\d{10}")) {

            resp.setContentType("text/html");

            RequestDispatcher rd =
                    req.getRequestDispatcher("RegistrationFail.jsp");

            rd.forward(req, resp);

            return;
        }
        User user = new User();

        user.setName(name);
        user.setEmail(email);
        user.setAddress(address);
        user.setNumber(number);
        user.setGender(gender);
        user.setPassword(password);

        UserDao dao = new UserDao();

        boolean result = dao.registerUser(user);

        if (result) {

            HttpSession session = req.getSession();

            // Store user data in session
            session.setAttribute("username", name);
            session.setAttribute("name", name);
            session.setAttribute("email", email);
            session.setAttribute("address", address);
            session.setAttribute("number", number);
            session.setAttribute("gender", gender);

            RequestDispatcher rd =req.getRequestDispatcher("RegistrationSuccess.jsp");

            rd.forward(req, resp);

        } else {

            resp.setContentType("text/html");
            RequestDispatcher rd =req.getRequestDispatcher("RegistrationFail.jsp");

            rd.forward(req, resp);
  
        }
    }
}
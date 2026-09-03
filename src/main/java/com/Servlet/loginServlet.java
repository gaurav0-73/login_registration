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

@WebServlet("/login")
public class loginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String password = req.getParameter("pass");

        UserDao dao = new UserDao();

        User result = dao.loginUser(name, password);

        if (result != null) {

            HttpSession session = req.getSession();

            session.setAttribute("username", result.getName());
            session.setAttribute("userpassword", result.getPassword());
         

            RequestDispatcher rd =
                    req.getRequestDispatcher("loginSucc.jsp");

            rd.forward(req, resp);

        } else {

            RequestDispatcher rd =
                    req.getRequestDispatcher("loginFail.jsp");

            rd.forward(req, resp);
        }
    }
}
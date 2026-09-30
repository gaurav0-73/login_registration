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

@WebServlet("/profile")
public class ProfileServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        if (session == null) {
            resp.sendRedirect("login.html");
            return;
        }

        String username = (String) session.getAttribute("username");

        if (username == null) {
            resp.sendRedirect("login.html");
            return;
        }

        UserDao dao = new UserDao();

        User user = dao.getUserByName(username);

        if (user != null) {

            req.setAttribute("user", user);

            RequestDispatcher rd =
                    req.getRequestDispatcher("profile.jsp");

            rd.forward(req, resp);

        } else {

            resp.sendRedirect("loginFail.jsp");
        }
    }
}


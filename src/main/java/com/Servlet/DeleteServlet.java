package com.Servlet;

import java.io.IOException;

import com.nit.Dao.UserDao;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html");

        HttpSession session = req.getSession();

        String name = (String) session.getAttribute("username");

        UserDao dao = new UserDao();

        boolean result = dao.deleteUser(name);
        if (result) {

        	session.invalidate();
            RequestDispatcher rd = req.getRequestDispatcher("/delete.jsp");

            rd.forward(req, resp);
        }else {

            resp.getWriter().println("<h2>Account Delete Failed</h2>");
        }
    }
}
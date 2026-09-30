
package com.Servlet;

import java.io.IOException;

import com.nit.Dao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/update")
public class UpdateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        HttpSession session = req.getSession();

        // Old name stored in session
        String oldName = (String) session.getAttribute("username");

        // Get update type and new value
        String type = req.getParameter("type");
        String value = req.getParameter("value");

        System.out.println("TYPE = " + type);
        System.out.println("VALUE = " + value);

        UserDao dao = new UserDao();

        boolean result = false;

        // UPDATE NAME
        if ("name".equals(type)) {

            result = dao.updateName(oldName, value);

            if (result) {
                session.setAttribute("username", value);
            }
        }

        // UPDATE ADDRESS
        else if ("address".equals(type)) {

            result = dao.updateAddress(oldName, value);

            if (result) {
                session.setAttribute("userAddress", value);
            }
        }

        // UPDATE NUMBER
        else if ("number".equals(type)) {

            result = dao.updateNumber(oldName, value);

            if (result) {
                session.setAttribute("userNumber", value);
            }
        }

        // SUCCESS
        if (result) {

            resp.sendRedirect("updateSuccessful.jsp");

        } else {

            resp.sendRedirect("updateFail.jsp");
        }
    }
}

package com.example.servlet;

import com.example.Warehouse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/users")
public class GetUsersServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        Warehouse warehouse = Warehouse.getInstance();
        req.setAttribute("users", warehouse.getUsers());
        getServletContext().getRequestDispatcher("/jsp/users.jsp").forward(req, resp);
    }

}

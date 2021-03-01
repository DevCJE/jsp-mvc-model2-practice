package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SubController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int location = Integer.parseInt(req.getParameter("location"));
        String result;

        if(location == 1){
            result = "/WEB-INF/subContext1.jsp";
        } else {
            result = "/WEB-INF/subContext2.jsp";
        }

        RequestDispatcher rd = req.getRequestDispatcher(result);
        rd.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}

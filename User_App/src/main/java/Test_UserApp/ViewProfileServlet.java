package Test_UserApp;

import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewProfileServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Cookie c[] = req.getCookies();
        if (c == null) {
            req.setAttribute("msg", "Session Expired....<br>");
            req.getRequestDispatcher("Msg.jsp").forward(req, res);
        } else {
            String fName = c[0].getValue();
            req.setAttribute("name", fName);
            req.getRequestDispatcher("ViewProfile.jsp").forward(req, res);
        }
    }
}

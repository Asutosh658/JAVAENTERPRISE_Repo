package Test_UserApp;



import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@SuppressWarnings("serial")
@WebServlet("/reg")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        
        UserBean ub = new UserBean(); // Create a UserBean object
        
        // Set user details from request parameters
        ub.setuName(req.getParameter("uname"));
        ub.setpWord(req.getParameter("pword"));
        ub.setfName(req.getParameter("fname"));
        ub.setlName(req.getParameter("lname"));
        ub.setAddr(req.getParameter("addr"));
        ub.setmId(req.getParameter("mid"));
        ub.setPhNo(Long.parseLong(req.getParameter("phno")));

        // Insert user details into the database
        int k = new RegisterDAO().insert(ub);
        
        // Check if the registration was successful
        if (k > 0) {
            req.setAttribute("msg", "User Registered Successfully...<br>");
            RequestDispatcher rd = req.getRequestDispatcher("Register.jsp");
            rd.forward(req, res); // Forward to the registration page with a success message
        }
    }
}


import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Yoda
 */
public class MyServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
           

        String name = request.getParameter("name");
        
         
         if (name == null) {
            out.println("<p>Name: MISSING</p>");
         } else {
            out.println("<p>Name: " + name + "</p>");
         }

        String lname = request.getParameter("lname");
         
         if (lname == null) {
            out.println("<p>Name: MISSING</p>");
         } else {
            out.println("<p>Last Name: " + lname + "</p>");
         }

        String email = request.getParameter("email");
         if (email == null) {
            out.println("<p>email: MISSING</p>");
         } else {
            out.println("<p>email: " + email + "</p>");
         }
      
        

    
  
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
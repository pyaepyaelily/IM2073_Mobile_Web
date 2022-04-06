// To save as "ebookshop\WEB-INF\classes\QueryMultiValueServlet.java".
import java.io.*;
import java.sql.*;
import jakarta.servlet.*;            // Tomcat 10
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
//import javax.servlet.*;            // Tomcat 9
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;

@WebServlet("/currentqns2")   // Configure the request URL for this servlet (Tomcat 7/Servlet 3.0 upwards)
public class qns1Servlet extends HttpServlet {

   // The doGet() runs once per HTTP GET request to this servlet.
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
               throws ServletException, IOException {
      try (
         // Step 1: Allocate a database 'Connection' object
         Connection conn = DriverManager.getConnection(
               "jdbc:mysql://localhost:3306/clickerdb?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
               "myuser", "xxxx");   // For MySQL
               // The format is: "jdbc:mysql://hostname:port/databaseName", "username", "password"

         // Step 2: Allocate a 'Statement' object in the Connection
         Statement stmt = conn.createStatement();
      ){
         
         String[] ids = request.getParameterValues("qnsID");
         if (ids != null) {
            String sqlStr;
            int count;
            sqlStr = "INSERT INTO currentqnstable (qnsID) VALUES (2)";
            //sqlStr = "DELETE FROM currentqnstable WHERE qnsID = 1";
            count = stmt.executeUpdate(sqlStr);
            response.sendRedirect("mathqns2.html");
         }
      } catch (Exception ex) {
               ex.printStackTrace();
         } 
   }
}
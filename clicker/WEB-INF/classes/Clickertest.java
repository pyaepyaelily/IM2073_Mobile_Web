import java.io.*;
import java.sql.*;
import jakarta.servlet.*; // Tomcat 10
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.util.*;

@WebServlet("/query") // Configure the request URL for this servlet (Tomcat 7/Servlet 3.0 upwards)
public class Clickertest extends HttpServlet {
    int score = 0;
    // The doGet() runs once per HTTP GET request to this servlet.
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set the MIME type for the response message
        response.setContentType("text/html");
        // Get a output writer to write the response message into the network socket
        PrintWriter out = response.getWriter();

        // Print an HTML page as the output of the query
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head><title>Query Response</title></head>");
        out.println("<body>");

        try (
                // Step 1: Allocate a database 'Connection' object
                Connection conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/clickerdb?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                        "myuser", "xxxx"); // For MySQL
                // The format is: "jdbc:mysql://hostname:port/databaseName", "username",
                // "password"

                // Step 2: Allocate a 'Statement' object in the Connection
                Statement stmt = conn.createStatement();) {
            // Step 3: Execute a SQL SELECT query
            String option = request.getParameter("option");
            String qnsID = request.getParameter("qnsID");
            String sqlStr = "INSERT INTO responsetable (qnsID, response, studentID) VALUES (" + qnsID + "" + ",'"
                    + option + "' , 1)";
            // out.println("<p>" + sqlStr + "</p>"); // for debugging
            int count = 0;
            count = stmt.executeUpdate(sqlStr);

            // out.println("<h3>Thank you for your query.</h3>");

            int rsCount = 0;
            String sqlStr1 = "select * from qnstable where qnsID = " + qnsID + " AND answer LIKE '" + option + "%' ";
            boolean results = stmt.execute(sqlStr1);
            ResultSet rset = stmt.executeQuery(sqlStr1); // Send the query to the server
            
            if (!rset.isBeforeFirst()) {
                out.println("<h3>Sorry you got it wrong. Please proceed to next question.</h3>");
            } else {
                score = score + 1;
                out.println("<h3>Good job! Please proceed to next question.</h3>");
                String sqlStr2 = "UPDATE studentTable SET score = " + score + " WHERE studentID = 1";
               
                // out.println("<p>" + sqlStr2 + "</p>");  // for debugging
                count = stmt.executeUpdate(sqlStr2);
                out.println("<p>" + score + " record updated.</p>");
            }

            // if (results == true){
            // out.println("<h3>Good job! Please proceed to next question.</h3>");
            // }
            // else{
            // out.println("<h3>Sorry you got it wrong. Please proceed to next
            // question.</h3>");
            // }

        } catch (Exception ex) {
            out.println("<p>Error: " + ex.getMessage() + "</p>");
            out.println("<p>Check Tomcat console for details.</p>");
            ex.printStackTrace();
        } // Step 5: Close conn and stmt - Done automatically by try-with-resources (JDK
          // 7)

        out.println("</body></html>");
        out.close();
    }
}
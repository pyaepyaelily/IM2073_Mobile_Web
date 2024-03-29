import java.io.*;
import java.sql.*;
import jakarta.servlet.*; // Tomcat 10
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import java.util.*;

@WebServlet("/queryScore") // Configure the request URL for this servlet (Tomcat 7/Servlet 3.0 upwards)
public class ClickerScore extends HttpServlet {

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

        out.write("<link rel='stylesheet' href='https://www.w3schools.com/w3css/4/w3.css'>");


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

            out.println("<header class='w3-display-container w3-content w3-wide' style='max-width:1500px' id='home'>");
            out.println("<img class='w3-image' class='w3-opacity' src='https://images.unsplash.com/photo-1464618663641-bbdd760ae84a?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=2070&q=80' alt='cloud' width='1500' height='800'>");

            String option = request.getParameter("option");
            String qnsID = request.getParameter("qnsID");

            String sqlStr1 = "select score from studentTable where studentID = 1;";
            boolean results = stmt.execute(sqlStr1);
            ResultSet rset = stmt.executeQuery(sqlStr1); // Send the query to the server

            out.println("<div class='w3-display-middle w3-margin-top w3-center'>");
            if (!rset.isBeforeFirst()) {
                out.println("<h3>Your score is 0</h3>");
            } else {

                while (rset.next()) {
                    if (rset.getInt("score") == 0) {
                        out.println("<h3 class= 'w3-text-white'>Your score is 0</h3>");
                    } else {
                        out.println("<h3 class= 'w3-text-white'>Good job! Your score is " + rset.getInt("score") + "</h3>");
                    }

                }
            }

            // if (results == true){
            // out.println("<h3>Good job! Please proceed to next question.</h3>");
            // }
            // else{
            // out.println("<h3>Sorry you got it wrong. Please proceed to next
            // question.</h3>");
            // }
            out.println("</div>");
            out.println("</header>");

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
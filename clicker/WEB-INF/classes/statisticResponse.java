
// To save as "ebookshop\WEB-INF\classes\QueryServlet.java".
import java.io.*;
import java.sql.*;
import jakarta.servlet.*; // Tomcat 10
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import javax.swing.*;
//import javax.servlet.*;            // Tomcat 9
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;

@WebServlet("/display") // Configure the request URL for this servlet (Tomcat 7/Servlet 3.0 upwards)
public class statisticResponse extends HttpServlet {
   JFrame f;

   // The doGet() runs once per HTTP GET request to this servlet.
   @Override
   public void doGet(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
      // Set the MIME type for the response message
      response.setContentType("text/html");
      // Get a output writer to write the response message into the network socket
      PrintWriter out = response.getWriter();
      // Print an HTML page as the output of the query
      out.println("<html>");
      out.println("<head><title>Display Statistics</title></head>");
      out.println("<body>");
      out.write("<script src=\"https://www.gstatic.com/charts/loader.js\"></script>\r\n");
      // out.write(
      // " <script
      // src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js\"></script>\r\n");
      try (
            // Step 1: Allocate a database 'Connection' object
            Connection conn = DriverManager.getConnection(
                  "jdbc:mysql://localhost:3306/clickerdb?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                  "myuser", "xxxx"); // For MySQL
            // The format is: "jdbc:mysql://hostname:port/databaseName", "username",
            // "password"

            // Step 2: Allocate a 'Statement' object in the Connection
            Statement stmt = conn.createStatement();) {
         String qnsID = request.getParameter("qnsID");

         String sqlStrA = "select * from responsetable where qnsID = " + qnsID + " AND response = 'A'";
         ResultSet rsetA = stmt.executeQuery(sqlStrA);
         int countA = 0;
         while (rsetA.next()) {
            countA++;
         }
         // out.println("<p>countA =" + countA + "</p>");

         String sqlStrB = "select * from responsetable where qnsID = " + qnsID + " AND response = 'B'";
         ResultSet rsetB = stmt.executeQuery(sqlStrB);
         int countB = 0;
         while (rsetB.next()) {
            countB++;
         }
         // out.println("<p>countB =" + countB + "</p>");

         String sqlStrC = "select * from responsetable where qnsID = " + qnsID + " AND response = 'C'";
         ResultSet rsetC = stmt.executeQuery(sqlStrC);
         int countC = 0;
         while (rsetC.next()) {
            countC++;
         }
         // out.println("<p>countC =" + countC + "</p>");

         String sqlStrD = "select * from responsetable where qnsID = " + qnsID + " AND response = 'D'";
         ResultSet rsetD = stmt.executeQuery(sqlStrD);
         int countD = 0;
         while (rsetD.next()) {
            countD++;
         }
         // out.println("<p>countD =" + countD + "</p>");
         out.println("<h3 style='text-align: center;' >Visualization of response to question" + qnsID + "</h3>");
         out.println("<script type=\"text/javascript\">");
         // out.println("alert('Added to cart!');");
         // Load the Visualization API and the corechart package.
         out.println("google.charts.load('current', {'packages':['corechart']});");
         // Set a callback to run when the Google Visualization API is loaded.
         out.println("google.charts.setOnLoadCallback(drawChart);");
         // Callback that creates and populates a data table,
         // instantiates the pie chart, passes in the data and
         // draws it.
         out.println(" function drawChart() {");
         out.println("var data = new google.visualization.DataTable();");
         out.println("data.addColumn('string', 'Topping'); data.addColumn('number', 'Slices'); data.addRows([");
         out.println("['A', " + countA + "],");
         out.println("['B', " + countB + "],");
         out.println("['C', " + countC + "],");
         out.println(" ['D', " + countD + "] ]); ");

         // Create the data table.
         // Set chart options
         out.println("var options = {'title':'Student response to question " + qnsID + "',");
         out.println("'width':400,");
         out.println("  'height':300};");
         // Instantiate and draw our chart, passing in some options.
         out.println("var piechart = new google.visualization.PieChart(document.getElementById('piechart_div'));");
         out.println("piechart.draw(data, options);");
         out.println("var barchart_options = {title:'Student response to question " + qnsID + "',");
         out.println(" width:400, height:300, legend: 'none'};");
         out.println("var barchart = new google.visualization.BarChart(document.getElementById('barchart_div'));");
         out.println("  barchart.draw(data, barchart_options);");

         out.println(" }");
         out.println("</script>");

         // out.println("<div id='piechart_div'></div>");
         // out.println("<div id='barchart_div' style='border: 1px solid #ccc'></div>");

         out.println("<table class='center'>");
         out.println("<tr>");
         out.println("<td><div id='piechart_div' style='border: 1px solid #ccc; text-align: center;'></div></td>");
         out.println("<td><div id='barchart_div' style='border: 1px solid #ccc; text-align: center;'></div></td>");
         out.println("</tr>");
         out.println("</table>");

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

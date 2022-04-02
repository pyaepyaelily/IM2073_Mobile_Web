/* Servlet code to generate bar chart using JFreeChart */
/* Basic libraries required to support servlet code */
import java.io.IOException;
import java.io.OutputStream;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/* JFreechart specific libraries to generate chart */
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities; /* This class will return the chart to the output stream */
import org.jfree.chart.JFreeChart; /* This class will hold the chart object */
import org.jfree.data.category.DefaultCategoryDataset; /* This class will help the servlet to load chart data */
import org.jfree.chart.plot.PlotOrientation;
/* Main servlet code starts here */
public class BarChartServletExample extends HttpServlet {
public BarChartServletExample() {
}
public void doGet(HttpServletRequest request, HttpServletResponse response)
throws ServletException, IOException {
         OutputStream out = response.getOutputStream(); /* Get the output stream from the response object */
        try {
               /* Step - 1: Define the data for the bar chart  */
               DefaultCategoryDataset bar_chart_servlet = new DefaultCategoryDataset();
               bar_chart_servlet.addValue(33, "Q1", "Rome");
               bar_chart_servlet.addValue(44, "Q1", "Cairo");
               bar_chart_servlet.addValue(22, "Q2", "Rome");
               bar_chart_servlet.addValue(12, "Q2", "Cairo");
               bar_chart_servlet.addValue(56, "Q3", "Rome");
               bar_chart_servlet.addValue(98, "Q3", "Cairo");
               bar_chart_servlet.addValue(2, "Q4", "Rome");
               bar_chart_servlet.addValue(15, "Q4", "Cairo");    
                
               /* Step -2:Define the JFreeChart object to create bar chart */
               JFreeChart BarChartObject=ChartFactory.createBarChart("jFreeChart Servlet Example Code","Country","Sales",bar_chart_servlet,PlotOrientation.VERTICAL,true,true,false);
               
               /* Step -3: Set the response type to PNG */
               response.setContentType("image/png"); /* Set the HTTP Response Type */
               
               /* Step -4: Write the response to the output stream */
               ChartUtilities.writeChartAsPNG(out, BarChartObject, 400, 300);/* Write the data to the output stream */
        }
        catch (Exception e) {
                System.err.println(e.toString()); /* Throw exceptions to log files */
        }
        finally {
                out.close();/* Close the output stream */
        }
        }
}

package pl.mibdbz.testDB;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String user = "diabetes";
        String pass = "diabetes";
        
        String jdbcUrl = "jdbc:mysql://localhost:3306/measurements?useSSL=false&serverTimezone=UTC";
        String driver = "com.mysql.jdbc.Driver";

        
         //get connection to database
        try{
            PrintWriter out = response.getWriter();
            out.println("\nConnecting to DB...\n" + jdbcUrl);
            
            Class.forName(driver);
            
            Connection myConn = DriverManager.getConnection(jdbcUrl, user, pass);
            out.println("\nSUCCESSFULL!!!\n");
            
            myConn.close();
            
        }catch(Exception ex){
            ex.printStackTrace();
            throw new ServletException(ex);
        }
    }
    
}


package hotel.management.system;

import java.sql.*;

public class Conn {
    
    Connection C;
    Statement s;
    Conn(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            C = DriverManager.getConnection("jdbc:mysql:///hotelmanagementsystem","root", "Mahi@900");
            s = C.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}

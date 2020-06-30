
package estacionamiento;

/*import java.sql.Connection;
import java.sql.DriverManager;
import java.beans.Statement;
import java.sql.ResultSet;
*/

public class Conexion {
    /*Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Estacionamiento","root","");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
    }
    public static void main(String[] args) {
        Conexion cn=new Conexion();
        /*Statement st;
        ResultSet rs;
        try {
            //st=cn.con.createStatement();
            st=(Statement) cn.con.createStatement();
            rs=st.executeQuery("SELECT * FROM Acomodadores");
            while (rs.next()) {                
                System.out.println(rs.getInt("idAcomodador")+" " +rs.getString("Nombre")+" " +rs.getString("Puesto"));
            }
            cn.con.close();
        } catch (Exception e) {
        }
        
    }*/
}
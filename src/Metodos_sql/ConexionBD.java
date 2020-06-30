
package Metodos_sql;
//Se importan las librerias necesarias para el metodo de conexion a la base de datos.
import estacionamiento.Contrasena;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class ConexionBD {
    //Se crean las variables necesarias para la ejecucion de conexion a la base de datos.
    public static final String URL = "jdbc:mysql://localhost:3306/Estacionamiento";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";
    
    java.sql.Connection con;
    //Se crea el metodo de conexion a la base de datos que sera utilizado en diferentes puntos del programa.
    public ConexionBD(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Estacionamiento","root","");
        } catch (Exception e) {
            System.err.println("Error:" +e);
        }
    }
    public static void main(String[] args) {
        ConexionBD cn=new ConexionBD();  
        System.out.println("Conexion establecida");
    }
    //Se genera el metodo getConection que dara acceso a la base de datos en diferentes momentos del programa.
    public static Connection getConection(){
        Connection con = null;
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(URL,USERNAME,PASSWORD);
            JOptionPane.showMessageDialog(null, "Conexion exitosa");
            
        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
    //Se genera la validacion de las credenciales del acomodador para que pueda ingresar al menu de registro de vehiculos.
    public int validar_ingreso() throws SQLException{
        String usuario = Contrasena.txt_cuenta.getText();
        String clave = String.valueOf(Contrasena.jpsf_contra.getPassword());
        
        int resultado = 0;
        
        String SSQL = "SELECT * FROM acomodadores WHERE idAcomodador ='"+usuario+"' AND Contraseña = '"+clave+"'";
        
        //Connection conect = null;
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(SSQL);
        
        if(rs.next()){
            resultado = 1;
        }
        con.close();
        return resultado;
    }
}
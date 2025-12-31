package gui; 

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConexionBD {
    // Datos de tu MySQL 8.0.44
    private static final String URL = "jdbc:mysql://localhost:3306/smartocupation";
    private static final String USER = "root"; 
    private static final String PASS = "JFOAIjfien/855+"; 

    public static Connection conectar() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return con;
    }
}
package gui;

import java.sql.Connection;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConexionBDTest {
    
    @Test
    public void testConectar() {
        System.out.println("Verificando conexión...");
        Connection con = ConexionBD.conectar();
        assertNotNull("La conexión falló", con);
        try {
            if (con != null) con.close();
        } catch (Exception e) {}
    }
}
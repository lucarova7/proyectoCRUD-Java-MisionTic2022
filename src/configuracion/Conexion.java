package configuracion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import utilidades.Propiedades;

public abstract class Conexion {

    private String usuario;
    private String clave;
    private String url;
    private String driver;
    protected Connection objConexion;

    public Conexion() {
//        Aqui debes colocar tu datos de ingreso a MySql para poder que te sirve el codigo
//        this.usuario = "root";
//        this.clave = "misionTic2022";
//        this.url = "jdbc:mysql://localhost:3306/bd_productos";
//        this.driver = "com.mysql.cj.jdbc.Driver";

        String nombreArchivo = "variablesBD";
        this.usuario = Propiedades.leer(nombreArchivo, "nombre_usuario").replaceAll("\"", "");
        this.clave = Propiedades.leer(nombreArchivo, "clave_usuario").replaceAll("\"", "");
        this.url = Propiedades.leer(nombreArchivo, "url_conexion").replaceAll("\"", "");
        this.driver = Propiedades.leer(nombreArchivo, "driver").replaceAll("\"", "");
        
        activar();
    }

    private void activar() {
        try {
            Class.forName(driver);
            objConexion = DriverManager.getConnection(url, usuario, clave);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Propiedades.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}

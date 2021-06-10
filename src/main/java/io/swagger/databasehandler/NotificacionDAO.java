package io.swagger.databasehandler;

import java.sql.Connection;
import java.sql.DriverManager;
import io.swagger.model.Notificacion;
import java.util.List;

public class NotificacionDAO {

    private Connection con;
    private TrabajoDAO trabajoDAO;

    public NotificacionDAO() {
        try{
            this.con = DriverManager.getConnection("jdbc:mysql://10.0.2.15:3306/aos4","root","qwerty");
            this.trabajoDAO = new TrabajoDAO(con);
        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println("No se ha podido inicializar la conexión con la base de datos.");
        }
    }
    
    void insertar(Notificacion notificacion) {
        con.prepareStatement("INSERT INTO notificaciones VALUES(?, ?, ?, ?");
    }

    void eliminar(Notificacion notificacion) {

    }

    List<Notificacion> obtenerTodos() {
        
    }

    Notificacion obtener(Integer id) {

    }
}

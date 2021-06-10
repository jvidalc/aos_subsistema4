package io.swagger.databasehandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import io.swagger.model.Notificacion;
import java.util.List;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class NotificacionDAO {

    private Connection con;
    private TrabajoDAO trabajoDAO;
    private Logger logger = LogManager.getLogger(NotificacionDAO.class);
    
    public NotificacionDAO() {
        try{
            this.con = DriverManager.getConnection("jdbc:mysql://172.19.0.2:3306/aos4","root","qwerty");
            this.trabajoDAO = new TrabajoDAO(con);
        }
        catch(Exception ex){
            logger.error("No se ha podido inicializar la conexión con la base de datos.");
            ex.printStackTrace();
        }
    }
    
    int insertar(Notificacion notificacion) {
        try(Statement s = con.createStatement();){
            String query = 
            "INSERT INTO notificaciones (clienteId, fechaNotificacion, trabajoId) VALUES (" + notificacion.getClienteId().toString() + ", "+ notificacion.getFechaNotificacion().toString() + ", " + notificacion.getTrabajo().getTrabajoId() + ")";
            s.executeQuery(query);
            return 201;
        }
        catch(SQLException sqlEx) {
            return sqlEx.getErrorCode();
        }
        catch(Exception e){
            return 400;
        }
    }

    void eliminar(Notificacion notificacion) {

    }

    List<Notificacion> obtenerTodos() {
        
    }

    Notificacion obtener(Integer id) {

    }
}

package io.swagger.databasehandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import io.swagger.model.Notificacion;
import java.util.List;
import java.util.ArrayList;

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
    
    public int insertar(Notificacion notificacion) {
        try(Statement s = con.createStatement()){
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

    public void eliminar(Integer notificacionId) {
        try(PreparedStatement ps = con.prepareStatement("DELETE FROM notificaciones WHERE id = ?;")) {
            ps.setInt(1,notificacionId);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Notificacion> obtenerTodos() {
        List<Notificacion> resul = new ArrayList<>();
        try(Statement s = con.createStatement()){
            String query = "SELECT * FROM notificaciones";
            ResultSet rs = s.executeQuery(query);
            while(rs.next()){
                Notificacion nueva = new Notificacion();
                nueva.setNotificacionId(rs.getInt("id"));
                nueva.setFechaNotificacion(rs.getDate("fechaNotificacion").toLocalDate());
                nueva.setTrabajo(trabajoDAO.obtener(rs.getInt("trabajoId")));
                resul.add(nueva);
            }
            return resul;
        }
        catch(Exception e){
            return new ArrayList<>();
        }
    }

    public Notificacion obtener(Integer id) {

    }
}

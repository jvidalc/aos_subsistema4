package io.swagger.databasehandler;

import io.swagger.model.Trabajo;

import java.sql.Connection;
import java.util.List;

public class TrabajoDAO {

    private Connection con;

    public TrabajoDAO(Connection con) {
        this.con = con;
    }

    void insertar(Trabajo notificacion){
        
    }

    void eliminar(Trabajo notificacion) {

    }

    List<Trabajo> obtenerTodos() {

    }

    Trabajo obtener(Integer id) {
        try (PreparedStatement ps = con.prepareStatement("SELECT * FROM trabajos WHERE id = ?;")) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Trabajo trab = new Notificacion();
            trab.setTrabajoId(rs.getInt("id"));
            trab.setNombreTrabajo(rs.getIn("nombreTrabajo"))
            trab.setEstadoTrabajo(rs.getString("estado"));

            return trab;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
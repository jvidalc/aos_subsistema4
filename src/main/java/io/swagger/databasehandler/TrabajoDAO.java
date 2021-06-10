package io.swagger.databasehandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

import io.swagger.model.Notificacion;
import io.swagger.model.Trabajo;

import java.util.List;
import java.util.ArrayList;

public class TrabajoDAO {

    private Connection con;

    public TrabajoDAO(Connection con) {
        this.con = con;
    }

    public List<Trabajo> obtenerTodos() {
        List<Trabajo> resul = new ArrayList<>();
        try(Statement s = con.createStatement()){
            String query = "SELECT * FROM trabajos;";
            ResultSet rs = s.executeQuery(query);
            while(rs.next()){
                Trabajo nuevo = new Trabajo();
                nuevo.setTrabajoId(rs.getInt("id"));
                nuevo.setNombreTrabajo(rs.getString("nombreTrabajo"));
                nuevo.setEstadoTrabajo(Trabajo.EstadoTrabajoEnum.fromValue(rs.getString("estado")));
                resul.add(nuevo);
            }
            return resul;
        }
        catch(Exception e){
            return new ArrayList<>();
        }
    }

    public Trabajo obtener(Integer id) {
        try (PreparedStatement ps = con.prepareStatement("SELECT * FROM trabajos WHERE id = ?;")) {
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            Trabajo trab = new Trabajo();
            trab.setTrabajoId(rs.getInt("id"));
            trab.setNombreTrabajo(rs.getString("nombreTrabajo"));
            trab.setEstadoTrabajo(Trabajo.EstadoTrabajoEnum.fromValue(rs.getString("estado")));

            return trab;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


}
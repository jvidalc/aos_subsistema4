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

    }
}
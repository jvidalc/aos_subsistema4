package io.swagger.databasehandler;

import io.swagger.model.Trabajo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

public class TrabajoDAO {

    private Connection con;

    public TrabajoDAO() {
        try{
            this.con = DriverManager.getConnection("jdbc:mysql://10.0.2.15:3306/databaseName","root","qwerty");
        }
        catch(Exception ex){
            ex.printStackTrace();
            System.out.println("No se ha podido inicializar la conexión con la base de datos.");
        }
    }

    void insertar(Trabajo notificacion){
        con.prepareStatement("INSERT INTO notificaciones ")
    }

    void eliminar(Trabajo notificacion) {

    }

    List<Trabajo> obtenerTodos() {

    }

    Trabajo obtener(Integer id) {

    }
}
package com.example.proyecto_dam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion_bbdd {

    //propiedades de la clase
    protected static Connection conn;
    protected static final String driver = "com.mysql.jdbc.Driver";
    protected static final String user ="root";
    protected static final String password = "";
    protected static final String url= "jdbc:mysql://localhost:3306/rewardme";

    //Creación del método para conectar a la bbdd
    public static void Conectar() {
//constructor vacio
        conn=null;
        try{
            Class.forName(driver);
            conn= (Connection) DriverManager.getConnection(url, user, password);
            if(conn!=null){
                System.out.println("Conectado a la base de datos");}
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar"+e);
        }

    }
    //Creación del método para desconectar a la bbdd
    public static void Desconectar(){
        conn=null;
        System.out.println("Desconexión exitosa!");
    }





}

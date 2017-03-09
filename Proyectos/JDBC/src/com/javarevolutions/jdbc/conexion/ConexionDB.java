package com.javarevolutions.jdbc.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
	public Connection getConnection(){
		Connection conn = null;
		try{
			Class.forName("org.postgresql.Driver");
			conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/revolutions","postgres","052001085am1");
			
		} catch(ClassNotFoundException cnfe){
			cnfe.printStackTrace();
		}
		catch(SQLException sql){
			sql.printStackTrace();
		}
		return conn;
	}
}

package modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

import controlador.Principal;


public class Coneccion {
	private static Connection conexionBD;
	
	private static String CONECTION_STRING = "jdbc:sqlite:BDPregunta3.db";
//	private static String USUARIO = "C##PATRON";
//	private static String CLAVE =  "PATRON";
	
	static {
		
		Connection conexion = null;  
		
		try {
			
			Class.forName("org.sqlite.JDBC");
			//JOptionPane.showMessageDialog(null, "Driver correctamente instalado");
			
			try {
				conexionBD = DriverManager.getConnection(CONECTION_STRING);
				//JOptionPane.showMessageDialog(null, "Conexion establecida correctamente. Acceso habilitado a la Base de Datos");
				
			}catch(SQLException e) {
				JOptionPane.showMessageDialog(null, "ERROR, no se pudo conectar con la Base de Datos. || " +  e.getMessage());
				e.printStackTrace();
			}//Try conexion
			
			
		} catch(ClassNotFoundException e){
			JOptionPane.showMessageDialog(null, "Error de conexion. Drivers sin instalar. || " +  e.getMessage());
			e.printStackTrace();
			
		}//Try drivers 
	}
	
	public static Connection getConnection() {
		return conexionBD;
	}
	
	
}//Fin clase

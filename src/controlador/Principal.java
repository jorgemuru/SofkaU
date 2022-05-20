package controlador;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.Coneccion;
import java.awt.EventQueue;
import vista.FrmPrincipal;

public class Principal {
	private static String estadoBD = ""; //Estado de la conexion a la BD
	public static Coneccion conectorBD = new Coneccion();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		conectarBD();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrmPrincipal frmInicio = new FrmPrincipal();
					frmInicio.setEstado(estadoBD);
					frmInicio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}//Main

	//Getters y setters
	public static String getEstadoBD() {
		return estadoBD;
	}

	public static void setEstadoBD(String estadoBD) {
		Principal.estadoBD = estadoBD;
	}
	
	public static Coneccion getConectorBD() {
		return conectorBD;
	}

	public static void setConectorBD(Coneccion conectorBD) {
		Principal.conectorBD = conectorBD;
	}

	private static void conectarBD() {
		
		try {
			//Listamos los registros ingresados.
			String consulta="SELECT * FROM AUXILIAR";
			Statement sentencia = conectorBD.getConnection().createStatement();
			ResultSet auxiliarRS = sentencia.executeQuery(consulta);
			estadoBD = "Conectado";
			
//			System.out.println("------ LISTADO DE LAS PERSONAS REGISTRADAS EN LA BASE DE DATOS ------");
//			while (personaRS.next()) {
//				System.out.println(personaRS.getString("DOCUMENTO") + ", " + personaRS.getString("APELLIDO1") + ", " + personaRS.getString("NOMBRE1"));
//			}
//			System.out.println("------ FIN DEL LISTADO ------");
			
		} catch(SQLException e) {
			JOptionPane.showMessageDialog(null, "Error al conectar a la Base de Datos: " +  e.getMessage());
			e.printStackTrace();
			estadoBD = "Desconectado";
			return;	
		}
		
		//Cerramos la conexion
//		try {
//			conectorBD.getConnection().close();
//			JOptionPane.showMessageDialog(null, "Conexion cerrada exitosamente");
			
//		}catch (SQLException e) {
//			JOptionPane.showMessageDialog(null, "ERROR DE CONEXION, no se pudo cerrar la Conexion correctamente");
//			e.printStackTrace();
//			return;	
//		} 
	
	}//ConectarBD
	
}//Class
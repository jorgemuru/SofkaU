package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.Principal;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FrmPrincipal extends JFrame {
	//private static Principal controladora = null;
	private JPanel pnlFondo;
	private JTextField txtJugador;
	private static String estado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

	}

	/**
	 * Create the frame.
	 */
	public FrmPrincipal() {
		//this.controladora = pControl;
		setTitle("SofkaU || Desafio Tecnico");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 400);
		pnlFondo = new JPanel();
		pnlFondo.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(pnlFondo);
		pnlFondo.setLayout(null);
		
		JPanel pnlTitulos = new JPanel();
		pnlTitulos.setBackground(Color.WHITE);
		pnlTitulos.setBounds(0, 0, 176, 361);
		pnlFondo.add(pnlTitulos);
		pnlTitulos.setLayout(null);
		
		JLabel lblUno = new JLabel("SofkaU");
		lblUno.setForeground(new Color(0, 153, 255));
		lblUno.setHorizontalAlignment(SwingConstants.CENTER);
		lblUno.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 24));
		lblUno.setBounds(10, 11, 156, 50);
		pnlTitulos.add(lblUno);
		
		JLabel lblDos = new JLabel("Desaf\u00EDo T\u00E9cnico");
		lblDos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDos.setForeground(new Color(0, 51, 255));
		lblDos.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 14));
		lblDos.setBounds(10, 257, 156, 23);
		pnlTitulos.add(lblDos);
		
		JLabel lblTres = new JLabel("Jorge Martinez");
		lblTres.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTres.setForeground(new Color(0, 0, 0));
		lblTres.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
		lblTres.setBounds(10, 278, 156, 18);
		pnlTitulos.add(lblTres);
		
		JLabel lblCuatro = new JLabel("Mayo 2022 - Ver 1.0");
		lblCuatro.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCuatro.setForeground(Color.BLACK);
		lblCuatro.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 8));
		lblCuatro.setBounds(10, 307, 156, 18);
		pnlTitulos.add(lblCuatro);
		
		JLabel lblEdoBD = new JLabel(getEstado());
		lblEdoBD.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEdoBD.setForeground(new Color(255, 204, 204));
		lblEdoBD.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 8));
		lblEdoBD.setBounds(10, 321, 156, 18);
		//lblEdoBD.setText(getEstado());
		pnlTitulos.add(lblEdoBD);
		
		JPanel pnlDatos = new JPanel();
		pnlDatos.setBackground(new Color(102, 153, 255));
		pnlDatos.setBounds(176, 0, 408, 361);
		pnlFondo.add(pnlDatos);
		pnlDatos.setLayout(null);
		
		JLabel lblTitulo = new JLabel("PreguntaTRES");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblTitulo.setBounds(0, 11, 408, 57);
		pnlDatos.add(lblTitulo);
		
		JLabel lblJugador = new JLabel("Jugador:");
		lblJugador.setFont(new Font("Tahoma", Font.ITALIC, 18));
		lblJugador.setBounds(10, 159, 388, 22);
		pnlDatos.add(lblJugador);
		
		txtJugador = new JTextField();
		txtJugador.setBackground(new Color(102, 153, 255));
		txtJugador.setForeground(new Color(255, 51, 0));
		txtJugador.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtJugador.setBounds(10, 192, 388, 35);
		pnlDatos.add(txtJugador);
		txtJugador.setColumns(10);
		
		JButton btnJugar = new JButton("JUGAR");
		btnJugar.setBackground(new Color(102, 153, 255));
		btnJugar.setForeground(Color.WHITE);
		btnJugar.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnJugar.setBounds(10, 255, 388, 35);
		pnlDatos.add(btnJugar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setForeground(Color.RED);
		btnSalir.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSalir.setBounds(309, 313, 89, 23);
		pnlDatos.add(btnSalir);
	}
	
	public void frmPrincipal() {
		
	}

	public static String getEstado() {
		return estado;
	}

	public static void setEstado(String estado) {
		FrmPrincipal.estado = estado;
	}
	
	
	
}//Fin clase

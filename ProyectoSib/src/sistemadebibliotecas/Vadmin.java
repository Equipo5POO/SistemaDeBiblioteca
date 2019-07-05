package sistemadebibliotecas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JList;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;
import java.awt.Cursor;

public class Vadmin extends JFrame {
	private JMenu mnLectores;
	private JMenu mnGestionDeLibros;
	private JMenu mnNewMenu;
	private JMenuBar menuBar;

	
	public Vadmin() {
		getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		getContentPane().setBackground(Color.WHITE);
		getContentPane().setFont(UIManager.getFont("InternalFrame.titleFont"));
		setTitle("ADMINISTRADOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 520, 398);
		
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		mnLectores = new JMenu("Lectores");
		mnLectores.setForeground(Color.BLACK);
		menuBar.add(mnLectores);
		
		JMenuItem mntmListaDeLectores = new JMenuItem("Lista de lectores");
		mnLectores.add(mntmListaDeLectores);
		
		JMenuItem mntmAgregarLector = new JMenuItem("Agregar lector");
		mnLectores.add(mntmAgregarLector);
		
		JMenu mnBibliotecarios = new JMenu("Bibliotecarios");
		menuBar.add(mnBibliotecarios);
		
		JMenuItem mntmAgregarBibliotecario = new JMenuItem("Agregar Bibliotecario");
		mnBibliotecarios.add(mntmAgregarBibliotecario);
		
		mnGestionDeLibros = new JMenu("Gestion de libros");
		mnGestionDeLibros.setForeground(Color.BLACK);
		mnGestionDeLibros.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnGestionDeLibros);
		
		JMenuItem mntmPedidos = new JMenuItem("Pedidos");
		mnGestionDeLibros.add(mntmPedidos);
		
		JMenuItem mntmAgregarLibro = new JMenuItem("Agregar libro");
		mnGestionDeLibros.add(mntmAgregarLibro);
		
		JMenuItem mntmEliminarLibro = new JMenuItem("Eliminar libro");
		mnGestionDeLibros.add(mntmEliminarLibro);
		
		mnNewMenu = new JMenu("Usuario");
		mnNewMenu.setFont(new Font("Segoe UI", Font.BOLD, 12));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmCambiarContrasea = new JMenuItem("Cambiar contrase\u00F1a");
		mnNewMenu.add(mntmCambiarContrasea);
		
		JMenuItem mntmCerrarSesin = new JMenuItem("Cerrar sesi\u00F3n");
		mntmCerrarSesin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmCerrarSesin);
	}
	protected JMenu getMnLectores() {
		return mnLectores;
	}
	protected JMenu getMnGestionDeLibros() {
		return mnGestionDeLibros;
	}
	
	protected JMenu getMnNewMenu() {
		return mnNewMenu;
	}
}

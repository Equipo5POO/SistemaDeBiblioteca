package sistemadebibliotecas;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vlogin extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panelinicisecion;
	public static JTextField loginusuario;
	public static JPasswordField password;
	Vadmin ventanabiblio= new Vadmin();

	
	public Vlogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 327, 343);
		panelinicisecion = new JPanel();
		panelinicisecion.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelinicisecion);
		panelinicisecion.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inicio de sesi\u00F3n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(98, 11, 104, 21);
		panelinicisecion.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setBounds(20, 84, 46, 14);
		panelinicisecion.add(lblNewLabel_1);
		
		loginusuario = new JTextField();
		loginusuario.setBounds(98, 81, 176, 20);
		panelinicisecion.add(loginusuario);
		loginusuario.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(20, 135, 68, 14);
		panelinicisecion.add(lblContrasea);
		
		password = new JPasswordField();
		password.setBounds(98, 132, 176, 20);
		panelinicisecion.add(password);
		
		
		final Datosusuario data= new Datosusuario();
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(data.probarPass()==1){//mostrar mensaje al entrar
					JOptionPane.showMessageDialog(null, "Bienvenido");
					ventanabiblio.setVisible(true);
					loginusuario.setText("");//Esto es para que se borre lostextline
					password.setText("");
				}
				else{
					JOptionPane.showMessageDialog(null, "Ingrese la contraseña correcta");
					loginusuario.setText("");//Esto es para que se borre lostextline
					password.setText("");
				}
				
				
			}
		});
		btnNewButton.setBounds(20, 204, 89, 23);
		panelinicisecion.add(btnNewButton);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(185, 204, 89, 23);
		panelinicisecion.add(btnSalir);
	}

}

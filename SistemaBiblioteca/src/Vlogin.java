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
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Vlogin extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel panelinicisecion;
	public static JTextField txtUser;
	public static JPasswordField txtPwd;
	Vadmin ventanabiblio= new Vadmin();
	
	private static Scanner sc;
	private static int intentos;
	private static String user,pwd;
	private JButton btnSalir;

	
	public Vlogin() {
		
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 333, 348);
		panelinicisecion = new JPanel();
		panelinicisecion.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelinicisecion);
		panelinicisecion.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Inicio de sesi\u00F3n");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(98, 11, 104, 21);
		panelinicisecion.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setBounds(20, 84, 56, 14);
		panelinicisecion.add(lblNewLabel_1);
		
		txtUser = new JTextField();
		txtUser.setBounds(113, 81, 176, 20);
		panelinicisecion.add(txtUser);
		txtUser.setColumns(10);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(20, 135, 73, 14);
		panelinicisecion.add(lblContrasea);
		
		txtPwd = new JPasswordField();
		txtPwd.setBounds(113, 132, 176, 20);
		panelinicisecion.add(txtPwd);
		
		
		final Datosusuario data= new Datosusuario();
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.addActionListener(new ActionListener() {
			
		   public void actionPerformed(ActionEvent arg0) {
				
				int nLineas=0;
				int i=0;
				String [] usuarios = null;
				String linea;
				
				try {
					sc = new Scanner(new File("usuarios.txt"));
					File f = new File("usuarios.txt");
					FileReader fr = new FileReader(f);
					BufferedReader br = new BufferedReader(fr);
					
					while((linea=br.readLine())!=null){
						nLineas++;	
					}

				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				usuarios = new String [nLineas];//Tamaño del array
				
				while (sc.hasNextLine()){
					
					usuarios[i++] = sc.nextLine();//Alamacenando cada linea en una posicion del array
					
				}
				
				intentos++;
				user = txtUser.getText();
				pwd=txtPwd.getText();
				
				Seguridad segu = new Seguridad();
				segu.validarUsuario(usuarios, user, pwd, intentos);
				
			}
		});
		btnNewButton.setBounds(20, 204, 89, 23);
		panelinicisecion.add(btnNewButton);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent arg0) {
				System.exit(1);
			}
		
		});
		btnSalir.setBounds(185, 204, 89, 23);
		panelinicisecion.add(btnSalir);
	}

}

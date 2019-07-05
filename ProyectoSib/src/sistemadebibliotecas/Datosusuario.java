package sistemadebibliotecas;

public class Datosusuario {
	String usuario1="";
	String pass="";
	@SuppressWarnings("deprecation")
	public int probarPass(){
		usuario1= Vlogin.loginusuario.getText();
		pass= Vlogin.password.getText();
		if(usuario1.equals("lusuario")&& pass.equals("1234")){
			return 1;	
		}
		else
			return 0;
		
	}
	
}

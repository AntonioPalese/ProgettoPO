
import java.util.ArrayList;

public class Login extends SignUp{

	//private String Username;
	//private String Password;	
    //public ConnectionUsers c;  
	
	
	//public void connect() {
	//	c = new ConnectionUsers();		
	//}
	
	public boolean verifica() {
		this.connect();
		ArrayList<String> utenti = new ArrayList<String>(); 
		utenti = connection.getutenti(Username, Password);
		connection.closeConnection();
		for(String s : utenti) {
			if (s.equals(this.Username + " " + this.Password)) {
				return true;
			}
		}
		return false;		
	}
	
	
	
	
}

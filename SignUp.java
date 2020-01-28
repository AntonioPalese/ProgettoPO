import java.sql.SQLException;
import java.util.ArrayList;

public class SignUp {

	protected String Name;
	protected String Surname;
	protected String Username;
	protected String Password;
	protected ConnectionUsers connection;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getUsername() {
		return Username;
	}
	public void setUsername(String username) {
		Username = username;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	
	public boolean registration() throws SQLException {
		// TODO Auto-generated method stub
		this.connect();
		/*if (this.Name == null || this.Surname == null || this.Username == null || this.Password == null) {
			
			
		}*/
		boolean res = connection.record(this);
		connection.closeConnection();
		return res;
	}
	
	protected void connect() {
		// TODO Auto-generated method stub	
		connection = new ConnectionUsers();
	}
	
	public boolean verifica() {
		this.connect();
		ArrayList<String> utenti = new ArrayList<String>(); 
		utenti = connection.getutenti(Username, Password);
		connection.closeConnection();
		for(String s : utenti) {
			String[] strarr = new String[2];
			strarr = s.split(" ");
			if (strarr[0].equals(this.Username)) {
				System.out.println("trovato username" + strarr[0] + "già in uso");
				return true;
			}
		}
		return false;		
	}
	
	public void setNull() {
		this.setName(null);
		this.setSurname(null);
		this.setUsername(null);
		this.setPassword(null);
	}
	
	
	
	
}

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ConnectionUsers {
	Statement state;
	Connection cn;
	ResultSet rs;
	public ConnectionUsers(){


		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch(ClassNotFoundException e){
			System.out.println(e.getMessage());
		}

		try {
			cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_utenti?user=root&password=4shbkmiswllvw7e");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*try {
			state = cn.createStatement();			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			rs = state.executeQuery("SELECT * FROM hotel_chain");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			while(rs.next()) {
				rs.getInt(1);
				System.out.println(rs.getString("hotel_chain_name"));
				rs.getString(3);
				rs.getString(4);
				}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	}
	
	public Connection getCn() {
		return cn;
	}

	public ArrayList<String> getutenti(String username, String password){
		// TODO Auto-generated method stub
		ArrayList<String> array = new ArrayList<String>();
		String sql = new String("SELECT username, password from utente_registrato");
		
       try {
        state = cn.createStatement();
		rs = state.executeQuery(sql);
		
		while(rs.next()) {
			System.out.println(rs.getString("Username") + rs.getString("Password"));
			array.add(rs.getString("Username") + " " + rs.getString("Password"));
			
		}
       }catch(SQLException e) {
    	   e.printStackTrace();    	   
       }
		
		return array;
	}
	
	public boolean record(SignUp user){
		// TODO Auto-generated method stub
		String sql = new String("INSERT INTO utente_registrato values (" + "\"" + user.getName() + "\"" + " ," + "\"" + user.getSurname() + "\"" + " ," + "\"" + user.getUsername() + "\"" + " ," + "\"" + user.getPassword() + "\"" + ")");
		System.out.println(sql);
		try {
			state = cn.createStatement();
			state.executeUpdate(sql);
		}catch(SQLException e) {
			e.printStackTrace();
			return false;		
		}
		return true;
	}
	
	public void closeConnection() {		
		try {
			cn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	
	
}

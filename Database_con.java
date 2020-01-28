/*
 * import java.sql.*;
 * 
 * public class Database_con {
 * 
 * Connection cn = null;
 * 
 * 
 * public Database_con(){
 * 
 * 
 * 
 * try{ Class.forName("com.mysql.cj.jdbc.Driver"); }
 * catch(ClassNotFoundException e){ System.out.println(e.getMessage()); }
 * 
 * try { cn = DriverManager.getConnection(
 * "jdbc:mysql://localhost:3306/Hotel_database?user=root&password=4shbkmiswllvw7e"
 * ); } catch (SQLException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); }
 * 
 * 
 * try { state = cn.createStatement(); } catch (SQLException e) { // TODO
 * Auto-generated catch block e.printStackTrace(); } try { rs =
 * state.executeQuery("SELECT * FROM hotel_chain"); } catch (SQLException e) {
 * // TODO Auto-generated catch block e.printStackTrace(); } try {
 * while(rs.next()) { rs.getInt(1);
 * System.out.println(rs.getString("hotel_chain_name")); rs.getString(3);
 * rs.getString(4); } } catch (SQLException e) { // TODO Auto-generated catch
 * block e.printStackTrace(); }
 * 
 * }
 * 
 * public Connection createConnection(){ try{
 * Class.forName("com.mysql.cj.jdbc.Driver"); } catch(ClassNotFoundException e){
 * System.out.println(e.getMessage()); }
 * 
 * try { this.cn = DriverManager.getConnection(
 * "jdbc:mysql://localhost:3306/Hotel_database?user=root&password=4shbkmiswllvw7e"
 * ); } catch (SQLException e) { // TODO Auto-generated catch block
 * e.printStackTrace(); } return cn; }
 * 
 * public void close() throws SQLException{ // TODO Auto-generated method stub
 * if (cn != null) cn.close();
 * 
 * }
 * 
 * 
 * public boolean record(SignUp user){ // TODO Auto-generated method stub String
 * sql = new String("INSERT INTO UTENTE_REGISTRATO (" + user.getName() + " ," +
 * user.getSurname() + " ," + user.getUsername() + " ," + user.getPassword());
 * System.out.println(sql); try { state = cn.createStatement();
 * state.executeUpdate(sql); }catch(SQLException e) { e.printStackTrace();
 * return false; } return true; }
 * 
 * 
 * 
 * 
 * 
 * 
 * }
 */
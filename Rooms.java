import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class Rooms {

	private int roomID;
	private String roomType;
	private boolean reserved;
	private String phone;

	private Database_con mycn = new Database_con();

	/*
	 * public void fillRoom_type_JTable(JTable table) {
	 * 
	 * PreparedStatement ps; ResultSet rs; String sql = "Select * from room_type ";
	 * try { ps = mycn.createConnection().prepareStatement(sql);
	 * 
	 * rs = ps.executeQuery();
	 * 
	 * 
	 * DefaultTableModel deftableModel = (DefaultTableModel)table.getModel();
	 * 
	 * Object[] rows;
	 * 
	 * while(rs.next()) { rows = new Object[5]; rows[0] = rs.getInt(1); rows[1] =
	 * rs.getString(2); rows[2] = rs.getString(3); rows[3] = rs.getString(4);
	 * rows[4] = rs.getString(5);
	 * 
	 * deftableModel.addRow(rows); } } catch(SQLException e) { e.printStackTrace();
	 * } }
	 */

	public int getRoomID() {
		return roomID;
	}

	public void setRoomID(int roomID) {
		this.roomID = roomID;
	}

	public String getRoomType() {
		return roomType;
	}

	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public boolean getReserved() {
		return reserved;
	}

	public void setReserved(boolean reserved) {
		this.reserved = reserved;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public boolean addRoom(JFrame frame){

		PreparedStatement st = null;
		String sql = "insert into Rooms values (?,?,?,?)";

		try {
			st = mycn.createConnection().prepareStatement(sql);

			st.setInt(1, this.roomID);
			st.setString(2, this.roomType);
			st.setString(3, this.phone);
			st.setBoolean(4, false);

			return (st.executeUpdate() > 0);	

		}catch(SQLException e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(frame, "Room already exists", "Error Panel", JOptionPane.ERROR_MESSAGE);
			return false;
		}
		finally {
			if (st != null)
				try {
					st.close();
					mycn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}	
		}	

	}

	public boolean editRoom(int number, String type, String phone) {

		PreparedStatement st = null;
		String sql = "update rooms set room_type_name = ?, phone = ? where room_id = ?";

		try {
			st = mycn.createConnection().prepareStatement(sql);

			st.setString(1, type);
			st.setString(2, phone);
			st.setInt(3, number);

			return (st.executeUpdate() > 0);	

		}catch(SQLException e) {
			e.printStackTrace();	
			return false;
		}finally {
			if (st != null)
				try {
					st.close();
					mycn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}	
		}
	}

	public boolean removeRoom() {

		PreparedStatement st = null;
		String sql = "delete from rooms where room_id = ?";

		try {
			st = mycn.createConnection().prepareStatement(sql);

			st.setInt(1, this.roomID);			

			return (st.executeUpdate() > 0);	

		}catch(SQLException e) {
			e.printStackTrace();	
			return false;
		}finally {
			if (st != null)
				try {
					st.close();
					mycn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}	
		}

	}

	public void fillRoomJTable(JTable table) {
		
		PreparedStatement st = null, st2 = null, st3 = null;
		ResultSet rs;
		String sql = "select room_id, r.room_type_name, ro.room_cost, phone, reserved\r\n" + 
				"from rooms r,room_type ro\r\n" + 
				"where r.room_type_name = ro.room_type_name;";
		
		String sql2 = "update rooms\r\n" + 
				"set reserved = true\r\n" + 
				"where rooms.room_id in (select r.rooms_room_id\r\n" + 
				"from rooms_booked r)";
		
		String sql3 = "update rooms\r\n" + 
				"set reserved = false \r\n" + 
				"where rooms.room_id not in (select r.rooms_room_id\r\n" + 
				"from rooms_booked r);\r\n" + 
				"";
		
		
		
		try {
			st2 = mycn.createConnection().prepareStatement(sql2);
			st2.executeUpdate();
			st3 = mycn.createConnection().prepareStatement(sql3);
			st3.executeUpdate();
			
			
			st = mycn.createConnection().prepareStatement(sql);
			rs = st.executeQuery();


			DefaultTableModel deftableModel = (DefaultTableModel)table.getModel();

			Object[] rows;
			
			while(rs.next()) {
				rows = new Object[5];
				rows[0] = rs.getInt(1);
				String s = rs.getString(2);
				rows[1] = s;
				
				rows[2] = rs.getInt(3);
				rows[3] = rs.getString(4);
				rows[4] = rs.getBoolean(5);

				deftableModel.addRow(rows);
			}
			
			
		}
		catch(SQLException e) {
			e.printStackTrace();    		
			System.out.println("errore linea 174");
		}finally {
			if (st != null && st2 != null && st3 != null)
				try {
					st.close();
					st2.close();
					st3.close();
					mycn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}	
		}
	}

}

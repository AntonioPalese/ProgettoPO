import java.sql.*;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class Reservation {

	private int id;
	private String name;
	private String surname;
	private Date check_in;
	private Date check_out;
	private String room_type;
	private String e_mail;
	private int total_rooms;
	private int count;

	private Database_con mycn = new Database_con();

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Date getCheck_in() {
		return check_in;
	}
	public void setCheck_in(Date check_in) {
		this.check_in = check_in;
	}
	public Date getCheck_out() {
		return check_out;
	}
	public void setCheck_out(Date check_out) {
		this.check_out = check_out;
	}
	public String getRoom_type() {
		return room_type;
	}
	public void setRoom_type(String room_type) {
		this.room_type = room_type;
	}
	public int getTotal_rooms() {
		return total_rooms;
	}
	public void setTotal_rooms(int total_rooms) {
		this.total_rooms = total_rooms;
	}

	public void fillReservationJTable(JTable table) {

		PreparedStatement st = null;
		ResultSet rs;
		String sql = "select distinct b.booking_id, b.guest_first_name, b.guest_last_name, b.email_address, date_format(b.check_in_date, \"%d/%m/%Y\") as check_in_date,  date_format(b.check_out_date, \"%d/%m/%Y\") as check_out_date, r.room_type_name, b.total_rooms_booked\r\n" + 
				"from bookings b, rooms_booked rb, rooms r \r\n" + 
				"where b.booking_id = rb.bookings_booking_id and rb.rooms_room_id = r.room_id";
		try {
			st = mycn.createConnection().prepareStatement(sql);
			rs = st.executeQuery();


			DefaultTableModel deftableModel = (DefaultTableModel)table.getModel();

			Object[] rows;

			while(rs.next()) {
				rows = new Object[8];
				rows[0] = rs.getInt(1);
				rows[1] = rs.getString(2);
				rows[2] = rs.getString(3);
				rows[3] = rs.getString(4);
				/*
				 * int i = rs.getInt(5); if(i == 0) rows[4] = null; else rows[4] = i;
				 */
				String s1 = rs.getString(5).split(" ")[0];
				String s2 = rs.getString(6).split(" ")[0];

				rows[4] = s1;
				rows[5] = s2;
				rows[6] = rs.getString(7);
				rows[7] = rs.getInt(8);

				deftableModel.addRow(rows);
			}


		}
		catch(SQLException e) {
			e.printStackTrace();    	
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

	public boolean addReservation(JFrame frame, boolean edit){


		PreparedStatement st = null, st2 = null, st3 = null, st4 = null, st5 = null;
		ResultSet rs2, rs3 = null; 
		String sql = "insert into  bookings (booking_id, guest_first_name, guest_last_name, email_address, check_in_date, check_out_date, total_rooms_booked ) \r\n" + 
				"values (?, ?, ?, ?, ?, ?, ?)";

		String sql2 = "select count(r.room_id) as room_count\r\n" + 
				"from rooms r\r\n" + 
				"where r.reserved = false and r.room_type_name = ?";

		String sql3 = "select * \r\n" + 
				"from rooms r\r\n" + 
				"where r.room_type_name = ? and r.reserved = false;";

		String sql5 = "update rooms\r\n" + 
				"set reserved = true\r\n" + 
				"where rooms.room_id in (select r.rooms_room_id\r\n" + 
				"from rooms_booked r)";

		String sql4 = "insert into rooms_booked values (?, ?, ?);";

		int result = 0;


		try {
			st2 = mycn.createConnection().prepareStatement(sql2);
			st2.setString(1, this.room_type);
			rs2 = st2.executeQuery();
			rs2.first();
			result = rs2.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {
			if(st2 != null)
				try {
					st2.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}

		//System.out.println(rs2.getInt("room_count"));
		if(result < this.total_rooms) {
			JOptionPane.showMessageDialog(frame, "Not Available Rooms", "Error Panel", JOptionPane.ERROR_MESSAGE);
			return false;				
		}
		else {
			try {
				st = mycn.createConnection().prepareStatement(sql);
				st.setInt(1, this.id);
				st.setString(2, this.name);
				st.setString(3, this.surname);
				st.setString(4, this.e_mail);
				st.setDate(5, this.check_in);
				st.setDate(6, this.check_out);
				st.setInt(7, this.total_rooms);
				st.executeUpdate();	
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				if(edit == false)
					JOptionPane.showMessageDialog(frame, "Reservation already exists/Client doesn't exist", "Error Panel", JOptionPane.ERROR_MESSAGE);
				else
					JOptionPane.showMessageDialog(frame, "Error: Editing client doesn't exist", "Error Panel", JOptionPane.ERROR_MESSAGE);
				return false;
			}
			finally {
				if(st != null)
					try {
						st.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
			}

			try {
				st3 = mycn.createConnection().prepareStatement(sql3);
				st3.setString(1, this.room_type);
				rs3 = st3.executeQuery();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}

			//rs3.first();



			try {
				for (int i = 0; i < this.total_rooms; i++) {
					rs3.next();
					st4 = mycn.createConnection().prepareStatement(sql4);
					this.count = new Random().nextInt(1000);
					st4.setInt(1, this.count);
					st4.setInt(2, this.id);
					st4.setInt(3, rs3.getInt(1));  
					st4.executeUpdate();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return false;
			}finally {
				if (st4 != null && st3 != null)
					try {
						st3.close();
						st4.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

			}


			/*
			 * while(rs3.next()) { st.setInt(1, this.id); st.setString(2, this.name);
			 * st.setString(3, this.surname); st.setString(4, this.e_mail); st.setDate(5,
			 * this.check_in); st.setDate(6, this.check_out); st.setInt(7,this.total_rooms);
			 * }
			 */


		}		
		try {
			st5 = mycn.createConnection().prepareStatement(sql5);
			st5.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}finally {
			if(st5 != null)
				try {
					st5.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if(mycn != null)
				try {
					mycn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}


		/*
		 * finally { if (st != null && st2 != null && st3 != null && st4 != null && st5
		 * != null) try { st.close(); st2.close(); st3.close(); st4.close();
		 * st5.close(); mycn.close(); } catch (SQLException e) { // TODO Auto-generated
		 * catch block e.printStackTrace();
		 * 
		 * } }
		 */

		return true;
		/*
		 * try { st = mycn.createConnection().prepareStatement(sql);
		 * 
		 * st.setString(1, this.first_name); st.setString(2, this.last_name);
		 * st.setString(3, this.contact_number); st.setString(4, this.e_mail);
		 * st.setString(5, this.credit_card);
		 * 
		 * return (st.executeUpdate() > 0);
		 * 
		 * }catch(SQLException e) { e.printStackTrace(); return false; } finally { if
		 * (st != null) try { st.close(); mycn.close(); } catch (SQLException e) { //
		 * TODO Auto-generated catch block e.printStackTrace();
		 * 
		 * } }
		 */
	}

	public boolean editReservation(JFrame frame) {

		PreparedStatement st = null, st2 = null, st3 = null, st4 = null;
		ResultSet rs;
		boolean res2 = false;
		String sql = "delete \r\n" + 
				"from bookings\r\n" + 
				"where booking_id = ?\r\n" + 
				"";

		String sql2 = "update rooms\r\n" + 
				"set reserved = true\r\n" + 
				"where rooms.room_id in (select r.rooms_room_id\r\n" + 
				"from rooms_booked r)";

		String sql4 = "update rooms\r\n" + 
				"set reserved = false \r\n" + 
				"where rooms.room_id not in (select r.rooms_room_id\r\n" + 
				"from rooms_booked r);\r\n" + 
				"";

		String sql3 = "select distinct b.booking_id, b.guest_first_name, b.guest_last_name, b.email_address, b.check_in_date, b.check_out_date, r.room_type_name, b.total_rooms_booked\r\n" + 
				"from bookings b, rooms r, rooms_booked rb \r\n" + 
				"where b.booking_id = rb.bookings_booking_id and rb.rooms_room_id = r.room_id and b.booking_id = ?;";

		try {
			st3 = mycn.createConnection().prepareStatement(sql3);
			st3.setInt(1, this.id);
			rs = st3.executeQuery();
			st = mycn.createConnection().prepareStatement(sql);
			st.setInt(1, this.id);
			st.executeUpdate();
			st2 = mycn.createConnection().prepareStatement(sql2);
			st2.executeUpdate();
			st4 = mycn.createConnection().prepareStatement(sql4);
			st4.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			return false;			
		}finally {
			if(st != null && st2 != null && st4 != null)
				try {
				st.close();
				st2.close();
				st4.close();
				}catch(SQLException e) {
					e.printStackTrace();
					return false;					
				}
		}
			res2 = this.addReservation(frame, true);			
		/*
		 * }catch(SQLException e) { JOptionPane.showMessageDialog(frame,
		 * "Client non exists", "Error Panel", JOptionPane.ERROR_MESSAGE);
		 * e.printStackTrace(); return false; }
		 */
		if(res2) {
			System.out.println("add nella edit" + res2);
			try {
				if(st != null && mycn != null) {
					st.close();
					mycn.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return true;
		}
		System.out.println("add nella edit" + res2);

		try {
			rs.next();
			this.id = rs.getInt(1);
			this.name = rs.getString(2);
			this.surname = rs.getString(3);
			this.e_mail = rs.getString(4);
			this.check_in = rs.getDate(5);
			this.check_out = rs.getDate(6);
			this.room_type = rs.getString(7);
			this.total_rooms = rs.getInt(8);

			boolean res = this.addReservation(frame, false);
			System.out.println("seconda add nella edit" + res);
			return false;

		}catch(SQLException e) {
			e.printStackTrace();	
			return false;
		}finally {
			if (st3 != null && mycn != null) {
				try {
					st3.close();
					mycn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}	
			}
		}
	}

	public boolean removeReservation() {

		PreparedStatement st = null, st2 = null, st3 = null;
		String sql = "delete from bookings where booking_id = ?";
		int res;

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
			st = mycn.createConnection().prepareStatement(sql);
			st.setInt(1, this.id);
			res = st.executeUpdate();

			st2 = mycn.createConnection().prepareStatement(sql2);
			st2.executeUpdate();

			st3 = mycn.createConnection().prepareStatement(sql3);
			st3.executeUpdate();			

		}catch(SQLException e) {
			e.printStackTrace();	
			return false;
		}finally {
			if (st != null && st2 != null && st3 != null)
				try {
					st.close();
					mycn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();

				}	
		}
		return (res > 0) ;

	}
	public String getE_mail() {
		return e_mail;
	}
	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

}



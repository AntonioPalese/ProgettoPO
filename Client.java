import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Client {

	private String first_name;
	private String last_name;
	private String contact_number;
	private String e_mail;
	private String credit_card;

	private Database_con mycn = new Database_con();

	public boolean addClient(){

		PreparedStatement st = null;
		String sql = "insert into guests values (?,?,?,?,?)";

		try {
			st = mycn.createConnection().prepareStatement(sql);

			st.setString(1, this.first_name);
			st.setString(2, this.last_name);
			st.setString(3, this.contact_number);
			st.setString(4, this.e_mail);
			st.setString(5, this.credit_card);

			return (st.executeUpdate() > 0);	

		}catch(SQLException e) {
			e.printStackTrace();
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

	public void fillClientsJTable(JTable table) {

		PreparedStatement st = null;
		ResultSet rs;
		String sql = "SELECT g.guest_first_name, g.guest_last_name, g.guest_contact_number, g.guest_email_address, g.guest_credit_card, sum(r.room_cost * b.time_lenght) as total_amount\r\n" + 
				"from guests g left join bookings b on ((b.guest_first_name = g.guest_first_name) and (b.guest_last_name = g.guest_last_name) and (b.email_address = g.guest_email_address))\r\n" + 
				"left join rooms_booked rb on (rb.bookings_booking_id = b.booking_id) left join rooms ro on (rb.rooms_room_id = ro.room_id) left join room_type r on (r.room_type_name = ro.room_type_name)\r\n" + 
				"group by g.guest_first_name, g.guest_last_name, g.guest_email_address";
		try {
			st = mycn.createConnection().prepareStatement(sql);
			rs = st.executeQuery();


			DefaultTableModel deftableModel = (DefaultTableModel)table.getModel();

			Object[] rows;

			while(rs.next()) {
				rows = new Object[6];
				rows[0] = rs.getString(1);
				rows[1] = rs.getString(2);
				rows[2] = rs.getString(3);
				rows[3] = rs.getString(4);
				/*
				 * int i = rs.getInt(5); if(i == 0) rows[4] = null; else rows[4] = i;
				 */
				rows[4] = rs.getString(5);
				rows[5] = rs.getDouble(6);
				deftableModel.addRow(rows);
			}


		}
		catch(SQLException e) {
			e.printStackTrace();    		
			System.out.println("errore linea 174");
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
	
	public boolean editClients(String first_name, String last_name, String e_mail, String number, String credit_card) {

		PreparedStatement st = null;
		String sql = "update guests\r\n" + 
				"set guests.guest_first_name = ?, guests.guest_last_name = ?, guests.guest_email_address = ?, guests.guest_contact_number = ?, \r\n" + 
				"guests.guest_credit_card = ? where guests.guest_first_name = ? and guests.guest_last_name = ? and guests.guest_email_address = ?\r\n" + 
				"";
				       

		try {
			st = mycn.createConnection().prepareStatement(sql);
            st.setString(1, first_name);
			st.setString(2, last_name);
			st.setString(3, e_mail);
			st.setString(4, number);
			st.setString(5, credit_card);
			st.setString(6, this.first_name);			
			st.setString(7, this.last_name);
			st.setString(8, this.e_mail);			


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

	public boolean removeClients() {

		PreparedStatement st = null;
		String sql = "delete from guests where guest_first_name = ? and guest_last_name = ? and guest_email_address = ?";

		try {
			st = mycn.createConnection().prepareStatement(sql);

			st.setString(1, this.first_name);
			st.setString(2, this.last_name);
			st.setString(3, this.e_mail);


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
	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getContact_number() {
		return contact_number;
	}

	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}

	public String getE_mail() {
		return e_mail;
	}

	public void setE_mail(String e_mail) {
		this.e_mail = e_mail;
	}

	public String getCredit_card() {
		return credit_card;
	}

	public void setCredit_card(String credit_card) {
		this.credit_card = credit_card;
	}

}

import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pales
 */
public class MainForm2 extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Creates new form MainForm2
	 */
	public MainForm2() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jMenuBar2 = new javax.swing.JMenuBar();
		jMenu6 = new javax.swing.JMenu();
		jMenuItem1 = new javax.swing.JMenuItem();
		jSeparator1 = new javax.swing.JPopupMenu.Separator();
		jMenuItem3 = new javax.swing.JMenuItem();
		jSeparator2 = new javax.swing.JPopupMenu.Separator();
		jMenuItem2 = new javax.swing.JMenuItem();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		//setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
		//setFocusableWindowState(false);
		//setLocation(new java.awt.Point(500, 500));
		//setLocationByPlatform(true);

		jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\pales\\OneDrive\\Desktop\\HotelSfondo.jpg")); // NOI18N
		jLabel1.setText("jLabel1");

		jMenu6.setBackground(new java.awt.Color(51, 51, 255));
		jMenu6.setForeground(new java.awt.Color(51, 51, 255));
		jMenu6.setText("Manage");
		jMenu6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
		jMenu6.setMinimumSize(new java.awt.Dimension(100, 40));
		jMenu6.setPreferredSize(new java.awt.Dimension(100, 40));

		jMenuItem1.setText("Clients");
		jMenuItem1.setPreferredSize(new java.awt.Dimension(100, 35));
		jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem1ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem1);
		jMenu6.add(jSeparator1);

		jMenuItem3.setText("Rooms");
		jMenuItem3.setPreferredSize(new java.awt.Dimension(100, 35));
		jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem3ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem3);
		jMenu6.add(jSeparator2);

		jMenuItem2.setText("Reservations");
		jMenuItem2.setPreferredSize(new java.awt.Dimension(117, 35));
		jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jMenuItem2ActionPerformed(evt);
			}
		});
		jMenu6.add(jMenuItem2);

		jMenuBar2.add(jMenu6);

		setJMenuBar(jMenuBar2);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(jLabel1).addGap(0, 146, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addComponent(jLabel1).addGap(0, 154, Short.MAX_VALUE)));

		pack();
	}// </editor-fold>

	private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		ClientsForm clf = new ClientsForm();
		clf.setVisible(true);
		clf.pack();
		clf.setLocationRelativeTo(null);
		clf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		RoomsForm rf = new RoomsForm();
		rf.setVisible(true);
		rf.pack();
		rf.setLocationRelativeTo(null);
		rf.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		Reservation_Form rform = new Reservation_Form();
		rform.setVisible(true);
		rform.pack();
		rform.setLocationRelativeTo(null);
		rform.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	/**
	 * @param args the command line arguments
	 */
	/*
	 * public static void main(String args[]) { Set the Nimbus look and feel
	 * //<editor-fold defaultstate="collapsed"
	 * desc=" Look and feel setting code (optional) "> If Nimbus (introduced in Java
	 * SE 6) is not available, stay with the default look and feel. For details see
	 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
	 * 
	 * try { for (javax.swing.UIManager.LookAndFeelInfo info :
	 * javax.swing.UIManager.getInstalledLookAndFeels()) { if
	 * ("Nimbus".equals(info.getName())) {
	 * javax.swing.UIManager.setLookAndFeel(info.getClassName()); break; } } } catch
	 * (ClassNotFoundException ex) {
	 * java.util.logging.Logger.getLogger(MainForm2.class.getName()).log(java.util.
	 * logging.Level.SEVERE, null, ex); } catch (InstantiationException ex) {
	 * java.util.logging.Logger.getLogger(MainForm2.class.getName()).log(java.util.
	 * logging.Level.SEVERE, null, ex); } catch (IllegalAccessException ex) {
	 * java.util.logging.Logger.getLogger(MainForm2.class.getName()).log(java.util.
	 * logging.Level.SEVERE, null, ex); } catch
	 * (javax.swing.UnsupportedLookAndFeelException ex) {
	 * java.util.logging.Logger.getLogger(MainForm2.class.getName()).log(java.util.
	 * logging.Level.SEVERE, null, ex); } //</editor-fold>
	 * 
	 * Create and display the form java.awt.EventQueue.invokeLater(new Runnable() {
	 * public void run() { new MainForm2().setVisible(true); } }); }
	 */

	// Variables declaration - do not modify
	private javax.swing.JLabel jLabel1;
	private javax.swing.JMenu jMenu6;
	private javax.swing.JMenuBar jMenuBar2;
	private javax.swing.JMenuItem jMenuItem1;
	private javax.swing.JMenuItem jMenuItem2;
	private javax.swing.JMenuItem jMenuItem3;
	private javax.swing.JPopupMenu.Separator jSeparator1;
	private javax.swing.JPopupMenu.Separator jSeparator2;
	// End of variables declaration
}

import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jasmineguglielmi
 */
public class signupForm extends javax.swing.JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * Creates new form RegisterForm
	 */
	public signupForm() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */

	// <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jTextField3 = new javax.swing.JTextField();
		jTextFieldCloseAccount = new javax.swing.JTextField();
		jTextFieldShowMinAccount = new javax.swing.JTextField();
		jPanel2 = new javax.swing.JPanel();
		jTextField1 = new javax.swing.JTextField();
		jTextField = new javax.swing.JTextField();
		jPasswordFieldCreateAcc = new javax.swing.JPasswordField();
		jTextFieldNameAcc = new javax.swing.JTextField();
		jButtonCancel = new javax.swing.JButton();
		jButtonRegister = new javax.swing.JButton();
		jTextField4 = new javax.swing.JTextField();
		jPasswordFieldCkPwAcc = new javax.swing.JPasswordField();
		jTextField5 = new javax.swing.JTextField();
		jTextFieldSurnameAcc = new javax.swing.JTextField();
		jTextField7 = new javax.swing.JTextField();
		jTextFieldUserAcc = new javax.swing.JTextField();
		jLabelLogin = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setUndecorated(true);

		jPanel1.setBackground(new java.awt.Color(255, 51, 0));
		jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		jTextField3.setEditable(false);
		jTextField3.setBackground(new java.awt.Color(255, 51, 0));
		jTextField3.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
		jTextField3.setForeground(new java.awt.Color(255, 255, 255));
		jTextField3.setText("Create New Account");
		jTextField3.setBorder(null);
		jTextField3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

		jTextFieldCloseAccount.setEditable(false);
		jTextFieldCloseAccount.setBackground(new java.awt.Color(255, 51, 0));
		jTextFieldCloseAccount.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
		jTextFieldCloseAccount.setForeground(new java.awt.Color(255, 255, 255));
		jTextFieldCloseAccount.setText("X");
		jTextFieldCloseAccount.setBorder(null);
		jTextFieldCloseAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		jTextFieldCloseAccount.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTextFieldCloseAccountMouseClicked(evt);
			}
		});
		jTextFieldCloseAccount.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldCloseAccountActionPerformed(evt);
			}
		});

		jTextFieldShowMinAccount.setEditable(false);
		jTextFieldShowMinAccount.setBackground(new java.awt.Color(255, 51, 0));
		jTextFieldShowMinAccount.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
		jTextFieldShowMinAccount.setForeground(new java.awt.Color(255, 255, 255));
		jTextFieldShowMinAccount.setText("_");
		jTextFieldShowMinAccount.setBorder(null);
		jTextFieldShowMinAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		jTextFieldShowMinAccount.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTextFieldShowMinAccountMouseClicked(evt);
			}
		});
		jTextFieldShowMinAccount.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldShowMinAccountActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup()
						.addGap(36, 36, 36)
						.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(79, 79, 79)
						.addComponent(jTextFieldShowMinAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18)
						.addComponent(jTextFieldCloseAccount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(15, Short.MAX_VALUE))
				);
		jPanel1Layout.setVerticalGroup(
				jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap(24, Short.MAX_VALUE)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextFieldCloseAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextFieldShowMinAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(14, 14, 14))
				);

		jPanel2.setBackground(new java.awt.Color(102, 204, 255));

		jTextField1.setEditable(false);
		jTextField1.setBackground(new java.awt.Color(102, 205, 255));
		jTextField1.setForeground(new java.awt.Color(255, 255, 255));
		jTextField1.setText("Password:");
		jTextField1.setBorder(null);
		jTextField1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField1ActionPerformed(evt);
			}
		});

		jTextField.setEditable(false);
		jTextField.setBackground(new java.awt.Color(102, 205, 255));
		jTextField.setForeground(new java.awt.Color(255, 255, 255));
		jTextField.setText("Surname:");
		jTextField.setBorder(null);
		jTextField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldActionPerformed(evt);
			}
		});

		jPasswordFieldCreateAcc.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
		jPasswordFieldCreateAcc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordFieldCreateAccActionPerformed(evt);
			}
		});

		jTextFieldNameAcc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldNameAccActionPerformed(evt);
			}
		});

		jButtonCancel.setBackground(new java.awt.Color(255, 102, 102));
		jButtonCancel.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
		jButtonCancel.setForeground(new java.awt.Color(255, 255, 255));
		jButtonCancel.setText("Cancel");
		jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonCancelActionPerformed(evt);
			}
		});

		jButtonRegister.setBackground(new java.awt.Color(0, 204, 102));
		jButtonRegister.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
		jButtonRegister.setForeground(new java.awt.Color(255, 255, 255));
		jButtonRegister.setText("Register");
		jButtonRegister.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonRegisterActionPerformed(evt);
			}
		});

		jTextField4.setEditable(false);
		jTextField4.setBackground(new java.awt.Color(102, 205, 255));
		jTextField4.setForeground(new java.awt.Color(255, 255, 255));
		jTextField4.setText("Check password:");
		jTextField4.setBorder(null);
		jTextField4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField4ActionPerformed(evt);
			}
		});

		jPasswordFieldCkPwAcc.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
		jPasswordFieldCkPwAcc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jPasswordFieldCkPwAccActionPerformed(evt);
			}
		});

		jTextField5.setEditable(false);
		jTextField5.setBackground(new java.awt.Color(102, 205, 255));
		jTextField5.setForeground(new java.awt.Color(255, 255, 255));
		jTextField5.setText("Name:");
		jTextField5.setBorder(null);
		jTextField5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField5ActionPerformed(evt);
			}
		});

		jTextFieldSurnameAcc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldSurnameAccActionPerformed(evt);
			}
		});

		jTextField7.setEditable(false);
		jTextField7.setBackground(new java.awt.Color(102, 205, 255));
		jTextField7.setForeground(new java.awt.Color(255, 255, 255));
		jTextField7.setText("Username:");
		jTextField7.setBorder(null);
		jTextField7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextField7ActionPerformed(evt);
			}
		});

		jTextFieldUserAcc.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jTextFieldUserAccActionPerformed(evt);
			}
		});

		jLabelLogin.setBackground(new java.awt.Color(255, 255, 255));
		jLabelLogin.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
		jLabelLogin.setForeground(new java.awt.Color(0, 0, 0));
		jLabelLogin.setText("Already have an account? Click here to login");
		jLabelLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		jLabelLogin.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jLabelLoginMouseClicked(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGap(15, 15, 15)
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel2Layout.createSequentialGroup()
														.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(18, 18, 18)
														.addComponent(jTextFieldUserAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel2Layout.createSequentialGroup()
														.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(21, 21, 21)
														.addComponent(jPasswordFieldCreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
												.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
														.addGroup(jPanel2Layout.createSequentialGroup()
																.addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addGap(26, 26, 26)
																.addComponent(jTextFieldSurnameAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(jPanel2Layout.createSequentialGroup()
																.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
																.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
																.addComponent(jTextFieldNameAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
												.addGroup(jPanel2Layout.createSequentialGroup()
														.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
														.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
														.addComponent(jPasswordFieldCkPwAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
								.addGroup(jPanel2Layout.createSequentialGroup()
										.addGap(65, 65, 65)
										.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jLabelLogin)
												.addGroup(jPanel2Layout.createSequentialGroup()
														.addComponent(jButtonCancel)
														.addGap(76, 76, 76)
														.addComponent(jButtonRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				);
		jPanel2Layout.setVerticalGroup(
				jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup()
						.addGap(25, 25, 25)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextFieldNameAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextFieldSurnameAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jTextFieldUserAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPasswordFieldCreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jPasswordFieldCkPwAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jButtonRegister)
								.addComponent(jButtonCancel))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jLabelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(18, 18, 18))
				);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				.addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
				);
		layout.setVerticalGroup(
				layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				);

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jTextFieldCloseAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldCloseAccountMouseClicked
		System.exit(0);
	}//GEN-LAST:event_jTextFieldCloseAccountMouseClicked

	private void jTextFieldCloseAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCloseAccountActionPerformed

	}//GEN-LAST:event_jTextFieldCloseAccountActionPerformed

	private void jTextFieldShowMinAccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldShowMinAccountMouseClicked
		this.setState(JFrame.ICONIFIED);
	}//GEN-LAST:event_jTextFieldShowMinAccountMouseClicked

	private void jTextFieldShowMinAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldShowMinAccountActionPerformed

	}//GEN-LAST:event_jTextFieldShowMinAccountActionPerformed

	private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jTextField1ActionPerformed

	private void jTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jTextFieldActionPerformed

	private void jPasswordFieldCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldCreateAccActionPerformed
		// TODO add your handling code here:
		/*String command = new String(evt.getActionCommand());
		System.out.println(command);
		sign.setPassword(command);*/
	}//GEN-LAST:event_jPasswordFieldCreateAccActionPerformed

	private void jTextFieldNameAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNameAccActionPerformed
		// TODO add your handling code here:
		/*String command = new String(evt.getActionCommand());
		System.out.println(command);
		sign.setName(command);*/

	}//GEN-LAST:event_jTextFieldNameAccActionPerformed

	private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
		// TODO add your handling code here:
		jTextFieldNameAcc.setText("");
		jTextFieldSurnameAcc.setText("");
		jTextFieldUserAcc.setText("");
		jPasswordFieldCreateAcc.setText("");
		jPasswordFieldCkPwAcc.setText("");
	}//GEN-LAST:event_jButtonCancelActionPerformed

	private void jButtonRegisterActionPerformed(java.awt.event.ActionEvent evt){//GEN-FIRST:event_jButtonRegisterActionPerformed
		// TODO add your handling code here:
		System.out.println(sign.getName() + sign.getSurname() + sign.getUsername() + sign.getPassword());
		if (jTextFieldNameAcc.getText().trim().isEmpty()) 
			JOptionPane.showMessageDialog(this, "Campo \" Name \" obbligatorio");
		else if (jTextFieldSurnameAcc.getText().trim().isEmpty())
			JOptionPane.showMessageDialog(this, "Campo \" Surname \" obbligatorio");
		else if (jTextFieldUserAcc.getText().trim().isEmpty())
			JOptionPane.showMessageDialog(this, "Campo \" Username \" obbligatorio");
		else if(new String(jPasswordFieldCreateAcc.getPassword()).trim().isEmpty())
			JOptionPane.showMessageDialog(this, "Campo \" Password \" obbligatorio");
		//System.out.println(new String(jPasswordFieldCkPwAcc.getPassword()));
		//System.out.println(new String(jPasswordFieldCkPwAcc.getPassword()).equals(new String (jPasswordFieldCreateAcc.getPassword())));
		//System.out.println(new String(jPasswordFieldCkPwAcc.getPassword()).trim().isEmpty());
		else if(!(new String(jPasswordFieldCkPwAcc.getPassword()).equals(new String(jPasswordFieldCreateAcc.getPassword()))) || new String(jPasswordFieldCkPwAcc.getPassword()).trim().isEmpty())
			JOptionPane.showMessageDialog(this, "Campo \" CheckPassword\" Errore");
		else {
			String command = new String(jTextFieldNameAcc.getText());
			System.out.println(command);
			sign.setName(command);
			String command1 = new String(jTextFieldSurnameAcc.getText());
			System.out.println(command1);
			sign.setSurname(command1);
			String command2 = new String(jTextFieldUserAcc.getText());
			System.out.println(command2);
			sign.setUsername(command2);
			String command3 = new String(jPasswordFieldCreateAcc.getPassword());
			System.out.println(command3);
			sign.setPassword(command3);
			String command4 = new String(jPasswordFieldCkPwAcc.getPassword());
			System.out.println(command4);
			//if(!command4.equals(new String(jPasswordFieldCreateAcc.getPassword()))) {
			//	JOptionPane.showMessageDialog(this, "Error checking password","Password Error", JOptionPane.INFORMATION_MESSAGE);			
			//}
			if(!sign.verifica()) {
				try {
					sign.registration();
				}
				catch (SQLException e) {
					e.printStackTrace();
				}
			}
			else
				JOptionPane.showMessageDialog(this, "Username non disponibile");
		}

		sign.setNull();//GEN-LAST:event_jButtonRegisterActionPerformed
		//this.jButtonCancelActionPerformed(null);
	}
	private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jTextField4ActionPerformed

	private void jPasswordFieldCkPwAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordFieldCkPwAccActionPerformed
		// TODO add your handling code here:
		/*String command = new String(evt.getActionCommand());
		System.out.println(command);
		if(!command.equals(jPasswordFieldCreateAcc.getText())) {
			JOptionPane.showMessageDialog(this, "Error checking password","Password Error", JOptionPane.INFORMATION_MESSAGE);			
		}*/
	}//GEN-LAST:event_jPasswordFieldCkPwAccActionPerformed

	private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jTextField5ActionPerformed

	private void jTextFieldSurnameAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSurnameAccActionPerformed
		// TODO add your handling code here:
		/*String command = new String(evt.getActionCommand());
		System.out.println(command);
		sign.setSurname(command);*/
	}//GEN-LAST:event_jTextFieldSurnameAccActionPerformed

	private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
		// TODO add your handling code here:
	}//GEN-LAST:event_jTextField7ActionPerformed

	private void jTextFieldUserAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUserAccActionPerformed
		// TODO add your handling code here:
		/*String command = new String(evt.getActionCommand());
		System.out.println(command);
		sign.setUsername(command);*/
	}//GEN-LAST:event_jTextFieldUserAccActionPerformed

	private void jLabelLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLoginMouseClicked
		LoginForm logf = new LoginForm();
		logf.setVisible(true);
		logf.pack();
		logf.setLocationRelativeTo(null);
		logf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.dispose();
	}//GEN-LAST:event_jLabelLoginMouseClicked

	/**
	 * @param args the command line arguments
	 */
	/**
	 * @param args
	 */
	/*public static void main(String args[]) {
		/* Set the Nimbus look and feel */
	//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
	/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
	 * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(signupForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>
		//</editor-fold>

		/* Create and display the form 
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new signupForm().setVisible(true);
				new Provaconnessione();
			}
		});
	}
	 */

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private SignUp sign = new SignUp();
	private javax.swing.JButton jButtonCancel;
	private javax.swing.JButton jButtonRegister;
	private javax.swing.JLabel jLabelLogin;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPasswordField jPasswordFieldCkPwAcc;
	private javax.swing.JPasswordField jPasswordFieldCreateAcc;
	private javax.swing.JTextField jTextField;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField7;
	private javax.swing.JTextField jTextFieldCloseAccount;
	private javax.swing.JTextField jTextFieldNameAcc;
	private javax.swing.JTextField jTextFieldShowMinAccount;
	private javax.swing.JTextField jTextFieldSurnameAcc;
	private javax.swing.JTextField jTextFieldUserAcc;
	// End of variables declaration//GEN-END:variables
}

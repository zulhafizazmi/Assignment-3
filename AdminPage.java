package Assignment;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AdminPage {

	protected JFrame AdminPage;
	private JTextField txtUserName;
	private JTextField txtPassword;
	private JTextField Exit;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminPage window = new AdminPage();
					window.AdminPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AdminPage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		AdminPage = new JFrame();
		AdminPage.getContentPane().setForeground(Color.WHITE);
		AdminPage.getContentPane().setBackground(SystemColor.controlHighlight);
		AdminPage.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 128)));
		panel.setBackground(new Color(230, 230, 250));
		panel.setBounds(10, 11, 1145, 678);
		AdminPage.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel GroceryItemsLabel = new JLabel("Welcome Admin");
		GroceryItemsLabel.setForeground(new Color(0, 0, 0));
		GroceryItemsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		GroceryItemsLabel.setFont(new Font("Rockwell", Font.BOLD, 40));
		GroceryItemsLabel.setBounds(466, 11, 654, 61);
		panel.add(GroceryItemsLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBorder(new MatteBorder(8, 8, 8, 8, (Color) new Color(0, 0, 128)));
		panel_1.setBackground(new Color(0, 0, 128));
		panel_1.setBounds(0, 0, 435, 678);
		panel.add(panel_1);
				
		JLabel Location = new JLabel("Location : Tumpat");
		Location.setForeground(new Color(255, 255, 255));
		Location.setFont(new Font("STXinwei", Font.BOLD, 18));
		Location.setBounds(10, 533, 241, 30);
		panel_1.add(Location);
		
		JLabel Fax = new JLabel("Fax : 09-7193642");
		Fax.setForeground(new Color(255, 255, 255));
		Fax.setFont(new Font("STXinwei", Font.BOLD, 18));
		Fax.setBounds(10, 563, 230, 30);
		panel_1.add(Fax);
		
		JLabel lblWatsun = new JLabel("Watsun");
		lblWatsun.setHorizontalAlignment(SwingConstants.CENTER);
		lblWatsun.setForeground(new Color(255, 255, 255));
		lblWatsun.setFont(new Font("Rockwell", Font.BOLD, 40));
		lblWatsun.setBounds(24, 275, 384, 61);
		panel_1.add(lblWatsun);
		
		JLabel Login = new JLabel("Login");
		Login.setBounds(647, 64, 291, 61);
		panel.add(Login);
		Login.setHorizontalAlignment(SwingConstants.CENTER);
		Login.setForeground(new Color(0, 0, 0));
		Login.setFont(new Font("Times New Roman", Font.BOLD, 29));
		
		txtUserName = new JTextField();
		txtUserName.setBackground(new Color(255, 255, 255));
		txtUserName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userName = "zulhafizazmi";
				txtUserName.setText(userName);
			}
		});
			
		txtUserName.setForeground(new Color(169, 169, 169));
		txtUserName.setHorizontalAlignment(SwingConstants.CENTER);
		txtUserName.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtUserName.setBounds(703, 335, 417, 38);
		panel.add(txtUserName);
		txtUserName.setColumns(10);
		
		txtPassword = new JTextField();
		txtPasswsetBackground(new Color(255, 255, 255));
		txtPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String password = "zulhafiz123";
				txtPassword.setText(password);
			}
		});
		txtPassword.setHorizontalAlignment(SwingConstants.CENTER);
		txtPassword.setForeground(new Color(169, 169, 169));
		txtPassword.setFont(new Font("Times New Roman", Font.ITALIC, 18));
		txtPassword.setColumns(10);
		txtPassword.setBounds(703, 408, 417, 38);
		panel.add(txtPassword);
		
		JLabel lblUsername = new JLabel("Username");
		lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
		lblUsername.setForeground(new Color(0, 0, 0));
		lblUsername.setFont(new Font("Times New Roman", Font.BOLD, 29));
		lblUsername.setBounds(445, 335, 291, 38);
		panel.add(lblUsername);
		
		JLabel Password = new JLabel("Password");
		Password.setHorizontalAlignment(SwingConstants.CENTER);
		Password.setForeground(new Color(0, 0, 0));
		Password.setFont(new Font("Times New Roman", Font.BOLD, 29));
		Password.setBounds(445, 404, 291, 38);
		panel.add(Password);
		
		JButton LoginButton = new JButton("Login");
		LoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					if(txtUserName.getText().equals("zulhafizazmi") && txtPassword.getText().equals("zulhafiz123")) {
						JOptionPane.showMessageDialog(null, "Login Succesful");

						new Employee().em.setVisible(true);//calling another frame/window
						AdminPage.dispose();
					
					}else
						JOptionPane.showMessageDialog(null, "Please enter the right user name and password");
					
				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, "Please enter the right user name and password");
				}
			}
		});
		LoginButton.setBackground(new Color(0, 0, 128));
		LoginButton.setForeground(new Color(0, 0, 0));
		LoginButton.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		LoginButton.setBounds(545, 547, 147, 45);
		panel.add(LoginButton);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtUserName.setText("");
				txtPassword.setText("");
			}
		});
		btnClear.setBackground(new Color(0, 0, 128));
		btnClear.setForeground(new Color(0, 0, 0));
		btnClear.setFont(new Font("Times New Roman", Font.PLAIN, 29));
		btnClear.setBounds(804, 547, 147, 45);
		panel.add(btnClear);
		
		Exit = new JTextField();
		Exit.setBackground(new Color(0, 0, 128));
		Exit.setText("x");
		Exit.setHorizontalAlignment(SwingConstants.CENTER);
		Exit.setForeground(new Color(255, 0, 0));
		Exit.setFont(new Font("STXinwei", Font.BOLD, 29));
		Exit.setColumns(10);
		Exit.setBounds(1091, 11, 44, 38);
		panel.add(Exit);
		AdminPage.setBounds(100, 100, 1179, 747);
		AdminPage.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void txtPasswsetBackground(Color color) {
		// TODO Auto-generated method stub
		
	}
}
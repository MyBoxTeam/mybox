package View;

import java.awt.*;

import javax.swing.*;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;


public class ServerUI extends JFrame {

	JPanel contentPane;
	JLabel DBname;
	JLabel portnum;
	JLabel DBpass;
	JLabel DBuser;
	private JTextField nametext;
	private JTextField usertxt;
	private JTextField porttxt;
	private JPasswordField passtxt;
	JButton connectbtn;
	private JTextField textField;
	JLabel lblConnectionStatus;
	ServerUI server;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ServerUI serverui = new ServerUI();
					serverui.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void setServer(ServerUI server)
	{
		this.server = server;
	}

	/**
	 * Create the frame.
	 */
	public ServerUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		setTitle("MyBox Server");
		setResizable(false);
		ImageIcon icon =new ImageIcon(getClass().getResource("/images/icon.png"));
		setIconImage(icon.getImage());
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 240, 230));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		DBname = new JLabel("Data Base name:");
		DBname.setFont(new Font("Tahoma", Font.BOLD, 15));
		DBname.setBounds(24, 44, 167, 20);
		contentPane.add(DBname);

		DBuser = new JLabel("Data Base User:");
		DBuser.setFont(new Font("Tahoma", Font.BOLD, 15));
		DBuser.setBounds(24, 87, 167, 20);
		contentPane.add(DBuser);

		portnum = new JLabel("Port Number:");
		portnum.setFont(new Font("Tahoma", Font.BOLD, 15));
		portnum.setBounds(24, 178, 167, 20);
		contentPane.add(portnum);

		DBpass = new JLabel("Data Base Password:");
		DBpass.setFont(new Font("Tahoma", Font.BOLD, 15));
		DBpass.setBounds(24,132, 167, 20);
		contentPane.add(DBpass);

		nametext = new JTextField();
		nametext.setColumns(10);
		nametext.setBounds(229, 44, 180, 20);
		contentPane.add(nametext);

		usertxt = new JTextField();
		usertxt.setColumns(10);
		usertxt.setBounds(229, 89, 180, 20);
		contentPane.add(usertxt);

		porttxt = new JTextField();
		porttxt.setColumns(10);
		porttxt.setBounds(229, 180, 180, 20);
		contentPane.add(porttxt);

		passtxt = new JPasswordField();
		passtxt.setColumns(10);
		passtxt.setBounds(229, 134, 180, 20);
		contentPane.add(passtxt);

		connectbtn = new JButton("Connect");
		connectbtn.setBackground(new Color(245, 255, 250));
		connectbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		connectbtn.setBounds(175, 209, 100, 39);
		connectbtn.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(connectbtn);

		textField = new JTextField();
		textField.setEditable(false);
		textField.setBackground(new Color(250, 240, 230));
		textField.setBounds(24, 284, 429, 76);
		contentPane.add(textField);
		textField.setColumns(10);

		lblConnectionStatus = new JLabel("Connection status:");
		lblConnectionStatus.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConnectionStatus.setBounds(172, 259, 117, 14);
		contentPane.add(lblConnectionStatus);

	}
	/***Setters and Getters*/
	public String getNametext() {
		return nametext.getText();
	}
	public String getUsertxt() {
		return usertxt.getText();
	}
	public String getPorttxt() {
		return porttxt.getText();
	}
	public String getPasstxt() {
		return String.valueOf(passtxt.getPassword());
	}
	public String getTextField() {
		return textField.getText();
	}
	public void setNametext() {
		this.nametext.setText("");
	}
	public void setUsertxt() {
		this.usertxt.setText("");
	}
	public void setPorttxt() {
		this.porttxt.setText("");
	}
	public void setPasstxt() {
		this.passtxt.setText("");
	}
	public void setTextField(String text) {
		this.textField.setText(text);
	}

	/****ActionListeners*/
	public void addConnectActionListener(ActionListener listener)
	{
		connectbtn.addActionListener( listener);
	}
}

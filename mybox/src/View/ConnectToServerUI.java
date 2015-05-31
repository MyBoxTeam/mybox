package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class ConnectToServerUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JButton btnConnect;

	public String getTextField() {
		return textField.getText();
	}

	public JButton getBtnConnect() {
		return btnConnect;
	}

	public void setTextField(JTextField textField) {
		this.textField.setText("");
	}

	public void setBtnConnect(JButton btnConnect) {
		this.btnConnect = btnConnect;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConnectToServerUI frame = new ConnectToServerUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConnectToServerUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 150);
		setTitle("Connect to server");
		setVisible(true);
		setResizable(false);
		ImageIcon icon =new ImageIcon(getClass().getResource("/images/icon.png"));
		setIconImage(icon.getImage());
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 240, 230));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblServerIp = new JLabel("Server IP:");
		lblServerIp.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblServerIp.setBounds(32, 39, 111, 19);
		contentPane.add(lblServerIp);
		
		textField = new JTextField();
		textField.setBounds(176, 40, 196, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnConnect = new JButton("Connect");
		btnConnect.setBackground(new Color(245, 255, 250));
		btnConnect.setBounds(120, 81, 89, 23);
		contentPane.add(btnConnect);
		
		
	}
	public void addConnectActionListener(ActionListener listener)
	{
		btnConnect.addActionListener(listener);
	}
}

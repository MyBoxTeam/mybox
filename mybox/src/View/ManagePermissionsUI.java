package View;


import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.SwingConstants;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;

import javax.swing.JList;
import javax.swing.JScrollPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ManagePermissionsUI extends JFrame {

	JPanel contentPane;
	JButton btnChange;
	JButton btnLogOut;
	JList list;
	Object[] array={1,2,5,3322,4,5,6,6,7,7,43,435435,5435,6,65,656,422,53,4,5,6,7,6,4,32};
	JScrollPane scrollPane;
	JButton btnCancel;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagePermissionsUI frame = new ManagePermissionsUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ManagePermissionsUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setTitle("Manage file permissions");
		setBounds(100, 100, 500, 400);
		setResizable(false);
		ImageIcon icon =new ImageIcon(getClass().getResource("/images/icon.png"));
		setIconImage(icon.getImage());
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 240, 230));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		btnChange = new JButton("Change");
		btnChange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AccessTypeUI access = new AccessTypeUI();
				
			}
		});
		btnChange.setBackground(new Color(245, 255, 250));
		btnChange.setBounds(23, 18, 104, 34);
		contentPane.add(btnChange);
		
		btnLogOut = new JButton("Log Out");
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLogOut.setBackground(new Color(245, 255, 250));
		btnLogOut.setBounds(23, 294, 104, 34);
		contentPane.add(btnLogOut);
		
		list = new JList();
		list.setListData(array);
		
		scrollPane = new JScrollPane(list);
		scrollPane.setSize(333, 310);
		scrollPane.setLocation(151, 18);
		contentPane.add(scrollPane);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnCancel.setBackground(new Color(245, 255, 250));
		btnCancel.setBounds(23, 260, 104, 23);
		contentPane.add(btnCancel);
		
					
	}
	public void clearFields()
	{
		btnChange.setEnabled(false);
		list.setSelectedIndex(-2);
	}

	public String getGroup_list() {
		return (String) list.getSelectedValue();
	}
	public void setGroup_list(String[] newlist) {
		list = new JList<String>(newlist);
	}
	public void addSelectGroupActionListener(MouseListener listener)
	{
		list.addMouseListener(listener);
	}
	public void addChangeActionListener(MouseListener listener)
	{
		btnChange.addMouseListener(listener);
	}
	public void addCancelActionListener(MouseListener listener)
	{
		btnCancel.addMouseListener(listener);
	}
	public void addLogOutActionListener(MouseListener listener)
	{
		btnLogOut.addMouseListener(listener);
	}
	

}

package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTable;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.CompoundBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ManageRequestsUI extends JFrame {

	JPanel contentPane;
	JButton button;
	ImageIcon icon;
	JLabel lblRequestsList;
	JButton btnReply;
	JButton btnDelete ;
	JList reqlist;
	JScrollPane scrollPane;
	

	/**
	 * Create the frame.
	 */
	public ManageRequestsUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Manage requests");
		setBounds(100, 100, 600, 500);
		setResizable(false);
		icon =new ImageIcon(getClass().getResource("/images/icon.png"));
		setIconImage(icon.getImage());
		contentPane = new JPanel();
		contentPane.setVisible(true);
		contentPane.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		contentPane.setBackground(new Color(250, 240, 230));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		lblRequestsList = new JLabel("Requests list:");
		lblRequestsList.setForeground(new Color(160, 82, 45));
		lblRequestsList.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblRequestsList.setBounds(151, 25, 280, 32);
		contentPane.add(lblRequestsList);

		button = new JButton("Log out");
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(new Color(245, 255, 250));
		button.setBounds(10, 387, 106, 40);
		contentPane.add(button);


		btnReply = new JButton("Reply");
		btnReply.setBackground(new Color(245, 255, 250));
		btnReply.setBounds(10, 80, 106, 30);
		contentPane.add(btnReply);

		btnDelete = new JButton("Delete");
		btnDelete.setBackground(new Color(245, 255, 250));
		btnDelete.setBounds(10, 122, 106, 30);
		contentPane.add(btnDelete);

		reqlist = new JList();
		Object[] array={1,2,5,3322,4,5,6,6,7,7,43,435435,5435,6,65,656,422,53,4,5,6,7,6,4,32};
		reqlist.setListData(array);
	
		scrollPane = new JScrollPane(reqlist);
		scrollPane.setSize(333, 386);
		scrollPane.setLocation(151, 68);
		contentPane.add(scrollPane);

	}
	public String getReq_list() {
		return (String) reqlist.getSelectedValue();
	}
	public void setReqlist(String[] newlist) {
		reqlist = new JList<String>(newlist);
	}
	public void addSelectGroupActionListener(MouseListener listener)
	{
		reqlist.addMouseListener(listener);
	}
	public void addReplyActionListener(MouseListener listener)
	{
		btnReply.addMouseListener(listener);
	}
	public void addDeleteActionListener(MouseListener listener)
	{
		btnDelete.addMouseListener(listener);
	}
	public void addLogOutActionListener(MouseListener listener)
	{
		button.addMouseListener(listener);
	}
}

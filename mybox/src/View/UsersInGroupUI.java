package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;

public class UsersInGroupUI extends JDialog {

	final JPanel contentPanel = new JPanel();
	JButton btnDeleteUser;
	JList users;
	JButton btnCancel;
	
	/**
	 * Create the dialog.
	 */
	public UsersInGroupUI() {
		setBounds(100, 100, 350, 350);
		setTitle("Delete User from Group");
		setResizable(false);
		ImageIcon icon =new ImageIcon(getClass().getResource("/images/icon.png"));
		setIconImage(icon.getImage());
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(250, 240, 230));
		contentPanel.setLayout(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		btnDeleteUser = new JButton("Delete User");
		btnDeleteUser.setBackground(new Color(245, 255, 250));
		btnDeleteUser.setBounds(10, 48, 100, 23);
		contentPanel.add(btnDeleteUser);
		
		users = new JList();
		JScrollPane scrollPane = new JScrollPane(users);
		scrollPane.setSize(200, 260);
		scrollPane.setLocation(120,38);
		contentPanel.add(scrollPane);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(245, 255, 250));
		btnCancel.setBounds(10, 263, 102, 23);
		contentPanel.add(btnCancel);
	
	}
	public String getReq_list() {
		return (String) users.getSelectedValue();
	}
	public void setReqlist(String[] newlist) {
		users = new JList<String>(newlist);
	}
	public void addSelectGroupActionListener(MouseListener listener)
	{
		users.addMouseListener(listener);
	}
	public void addDeleteUSerActionListener(MouseListener listener)
	{
		btnDeleteUser.addMouseListener(listener);
	}
	public void addCancelActionListener(MouseListener listener)
	{
		btnCancel.addMouseListener(listener);
	}
	
}

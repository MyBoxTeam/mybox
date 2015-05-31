package View;

import java.awt.BorderLayout;
import java.awt.Color;

import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class AddUserToGroupUI extends JDialog {
	final JPanel contentPanel = new JPanel();
	JButton btnAddUser;
	JList users;
	JButton btnCancel;

	/**
	 * Create the dialog.
	 */
	public AddUserToGroupUI() {
		setBounds(100, 100, 350, 350);
		setTitle("Add User to Group");
		setResizable(false);
		ImageIcon icon =new ImageIcon(getClass().getResource("/images/icon.png"));
		setIconImage(icon.getImage());
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(250, 240, 230));
		contentPanel.setLayout(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		btnAddUser = new JButton("Add User");
		btnAddUser.setBackground(new Color(245, 255, 250));
		btnAddUser.setBounds(10, 48, 100, 23);
		contentPanel.add(btnAddUser);

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
	public void addAddUserUSerActionListener(MouseListener listener)
	{
		btnAddUser.addMouseListener(listener);
	}
	public void addCancelActionListener(MouseListener listener)
	{
		btnCancel.addMouseListener(listener);
	}

}
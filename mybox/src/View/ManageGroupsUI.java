package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.border.LineBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;

import javax.swing.JScrollPane;

public class ManageGroupsUI extends JFrame {

	private JPanel contentPane;
	public int num;
	JButton btnDeleteGroup;
	JButton btnDeleteUser;
	JButton btnAddUser;
	JLabel lblGroupsList;
	JButton button ;
	JButton btnCancel;
	JList group_list;
	JScrollPane scrollPane;
	Object[] array={1,2,322,4,555555,67,8,544,3,4,5,5,5,6,97,6,5,543};
	

	/**
	 * Create the frame.
	 */
	public ManageGroupsUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		setTitle("Manage groups");
		setBounds(100, 100, 600, 500);
		setResizable(false);
		ImageIcon icon =new ImageIcon(getClass().getResource("/images/icon.png"));
		setIconImage(icon.getImage());
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 240, 230));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		btnDeleteGroup = new JButton("Delete Group");
		btnDeleteGroup.setBackground(new Color(245, 255, 250));
		btnDeleteGroup.setBounds(10, 101, 107, 23);
		btnDeleteGroup.setEnabled(false);
		contentPane.add(btnDeleteGroup);
		
		JButton btnAddGroup = new JButton("Add Group");
		btnAddGroup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					AddNewGroupUI add_group= new AddNewGroupUI();
					add_group.setVisible(true);
			}
		});
		btnAddGroup.setBounds(10, 67, 107, 23);
		btnAddGroup.setBackground(new Color(245, 255, 250));
		contentPane.add(btnAddGroup);

		btnDeleteUser = new JButton("Delete User");
		btnDeleteUser.setBackground(new Color(245, 255, 250));
		btnDeleteUser.setEnabled(false);
		btnDeleteUser.setBounds(10, 135, 107, 23);
		contentPane.add(btnDeleteUser);
		
		btnAddUser = new JButton("Add User");
		btnAddUser.setBackground(new Color(245, 255, 250));
		btnAddUser.setEnabled(false);
		btnAddUser.setBounds(10, 169, 107, 23);
		contentPane.add(btnAddUser);
		
		lblGroupsList = new JLabel("Groups List");
		lblGroupsList.setForeground(new Color(160, 82, 45));
		lblGroupsList.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblGroupsList.setBounds(242, 27, 232, 32);
		contentPane.add(lblGroupsList);
		
		button = new JButton("Log out");
		button.setFont(new Font("Tahoma", Font.BOLD, 14));
		button.setBackground(new Color(245, 255, 250));
		button.setBounds(10, 479, 107, 38);
		contentPane.add(button);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(245, 255, 250));
		btnCancel.setBounds(10, 203, 107, 23);
		contentPane.add(btnCancel);
		
		group_list = new JList();
		group_list.setListData(array);
		group_list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 num= (int)group_list.getSelectedValue();
				 btnDeleteGroup.setEnabled(true);
				 btnDeleteUser.setEnabled(true);
				 btnAddUser.setEnabled(true);
				
			}
		});
		scrollPane = new JScrollPane(group_list);
		scrollPane.setSize(333, 386);
		scrollPane.setLocation(151, 68);
		contentPane.add(scrollPane);
	
	}
	public void clearFields()
	{
		btnDeleteGroup.setEnabled(false);
		btnAddUser.setEnabled(false);
		btnDeleteUser.setEnabled(false);
		group_list.setSelectedIndex(-1);
		
		
	}

	public String getGroup_list() {
		return (String) group_list.getSelectedValue();
	}
	public void setGroup_list(String[] list) {
		group_list = new JList<String>(list);
	}
	public void addDeleteGroupActionListener(ActionListener listener)
	{
		btnDeleteGroup.addActionListener(listener);
	}
	public void addDeleteUserlActionListener(ActionListener listener)
	{
		btnDeleteUser.addActionListener(listener);
	
	}
	public void addAddUserlActionListener(ActionListener listener)
	{
		btnAddUser.addActionListener(listener);
	}
	public void addLogOutlActionListener(ActionListener listener)
	{
		button.addActionListener(listener);
	}
	public void addCancellActionListener(ActionListener listener)
	{
		btnCancel.addActionListener(listener);
	}
	public void addSelectGrouplActionListener(MouseListener listener)
	{
		group_list.addMouseListener(listener);
	}
}

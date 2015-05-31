package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseListener;

public class PrivateSpaceSysAdminUI extends PrivateSpaceUI {

	private JPanel contentPane;
	JButton btnManagerequests ;
	JButton btnManageGroups;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrivateSpaceSysAdminUI frame = new PrivateSpaceSysAdminUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrivateSpaceSysAdminUI() {
		super();
		setTitle("System Administrator's Private Space");
		setVisible(true);
		btnManagerequests = new JButton("Manage Requests");
		btnManagerequests.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagePermissionsUI mperm = new ManagePermissionsUI();
				mperm.setVisible(true);
			}
		});
		btnManagerequests.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnManagerequests.setBackground(new Color(245, 255, 250));
		btnManagerequests.setBounds(21, 282, 134, 23);
		getContentPane().add(btnManagerequests);
		
		btnManageGroups = new JButton("Manage Groups");
		btnManageGroups.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ManageGroupsUI mgroup = new ManageGroupsUI();
				mgroup.setVisible(true);
			}
		});
		btnManageGroups.setBackground(new Color(245, 255, 250));
		btnManageGroups.setBounds(21, 248, 134, 23);
		getContentPane().add(btnManageGroups);
						
	}

	public void addSelectFileActionListener(MouseListener listener)
	{
		list.addMouseListener(listener);
	}
	public void addSearchFileActionListener(MouseListener listener)
	{
		btnNewButton.addMouseListener(listener);
	}
	public void addAddFileActionListener(MouseListener listener)
	{
		btnAddFile.addMouseListener(listener);
	}
	public void addUpdateFileActionListener(MouseListener listener)
	{
		btnUpdateFile.addMouseListener(listener);
	}
	public void addRenameFileActionListener(MouseListener listener)
	{
		btnRenameFila.addMouseListener(listener);
	}
	public void addNewFolderActionListener(MouseListener listener)
	{
		btnNewFolder.addMouseListener(listener);
	}
	public void addEditDetailsActionListener(MouseListener listener)
	{
		btnEditDetails.addMouseListener(listener);
	}
	public void addChangeAccessActionListener(MouseListener listener)
	{
		btnManagePermission.addMouseListener(listener);
	}
	public void addLogOutActionListener(MouseListener listener)
	{
		btnLogOut_1.addMouseListener(listener);
	}
	public void addRemoveTypeActionListener(ActionListener listener)
	{
		remove.addActionListener(listener);
	}
	public void addManageRequestsActionListener(ActionListener listener)
	{
		btnManagerequests.addActionListener(listener);
	}
	public void addManageGroupsActionListener(ActionListener listener)
	{
		btnManageGroups.addActionListener(listener);
	}
}

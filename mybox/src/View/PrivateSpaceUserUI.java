package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PrivateSpaceUserUI extends PrivateSpaceUI {

	JPanel contentPane;
	JButton btnSendRequestTo;

	public static void main(String[] args) {
		try {
			PrivateSpaceUserUI dialog = new PrivateSpaceUserUI();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create the frame.
	 */
	public PrivateSpaceUserUI() {
		super();
		setVisible(true);
		super.setTitle("Private space of user");		
		btnSendRequestTo = new JButton("Send Request");
		btnSendRequestTo.setBackground(new Color(245, 255, 250));	
		btnSendRequestTo.setBounds(22, 254, 134, 23);
		getContentPane().add(btnSendRequestTo);
		btnSendRequestTo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				RequestFormUI f= new RequestFormUI();
			}
		});
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
	public void addSendRequestActionListener(ActionListener listener)
	{
		btnSendRequestTo.addActionListener(listener);
	}
}

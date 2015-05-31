package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;

import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AddGroupAccessUI extends JDialog {

	private final JPanel contentPanel = new JPanel();
	JLabel lblGroupName;
	JLabel lblAccessType;
	JButton btnAccept;
	JButton btnCancel;
	JComboBox typelist;
	JComboBox g_list;
	/**
	 * Create the dialog.
	 */
	public AddGroupAccessUI() {
		setBounds(100, 100, 350, 200);
		setVisible(true);
		setResizable(false);
		setTitle("Add a group to file access");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		ImageIcon icon =new ImageIcon(getClass().getResource("/images/icon.png"));
		setIconImage(icon.getImage());
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(250, 240, 230));
		contentPanel.setLayout(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		lblGroupName = new JLabel("Group name:");
		lblGroupName.setBounds(23, 30, 99, 30);
		contentPanel.add(lblGroupName);
		
		lblAccessType = new JLabel("Access type:");
		lblAccessType.setBounds(23, 71, 99, 30);
		contentPanel.add(lblAccessType);
		
		btnAccept = new JButton("Accept");
		btnAccept.setBackground(new Color(245, 255, 250));
		btnAccept.setBounds(49, 127, 89, 23);
		contentPanel.add(btnAccept);
		
		btnCancel = new JButton("Cancel");
		btnCancel.setBackground(new Color(245, 255, 250));
		btnCancel.setBounds(178, 127, 89, 23);
		contentPanel.add(btnCancel);
		
		typelist = new JComboBox();
		typelist.setBounds(112, 71, 162, 29);
		typelist.addItem("Choose access type");
		typelist.addItem("Read Only");
		typelist.addItem("Read and Update");
		contentPanel.add(typelist);
		
		g_list = new JComboBox();
		g_list.setBounds(112, 30, 162, 29);
		g_list.addItem("Choose a group");
		contentPanel.add(g_list);
	}

	
	public void clearFields()
	{
		typelist.setSelectedItem(null);
		g_list.setSelectedItem(null);
	}

	public JPanel getContentPanel() {
		return contentPanel;
	}

	public String getTypelist() {
		return (String) typelist.getSelectedItem();
	}

	public String getG_list() {
		return (String)g_list.getSelectedItem();
	}

	public void setTypelist(String [] list) {
		typelist = new JComboBox<String>(list);
		typelist.addActionListener(typelist);
	}

	public void setG_list(String [] list) {
		g_list = new JComboBox<String>(list);
		g_list.addActionListener(g_list);
	}
	
	/***ActionListeners*/
	public void addCancelActionListener(ActionListener listener)
	{
		btnCancel.addActionListener(listener);
	}
	public void addApplylActionListener(ActionListener listener)
	{
		btnAccept.addActionListener(listener);
	}
	
	
	
}

package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class RequestFormUI extends JDialog {

	private final JPanel contentPanel = new JPanel();
	JLabel gname;
	JTextField group_name ;
	JButton send;
	JComboBox action;
	JComboBox group_list;


	/**
	 * Create the dialog.
	 */
	public RequestFormUI() {
		setBounds(100, 100, 400, 200);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Request form");
		setVisible(true);
		setResizable(false);
		ImageIcon icon =new ImageIcon(getClass().getResource("/images/icon.png"));
		setIconImage(icon.getImage());
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(250, 240, 230));
		contentPanel.setLayout(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);

		gname =new JLabel("Group name:");
		gname.setBounds(10, 15, 90, 50);

		send = new JButton("Send");
		send.setBackground(new Color(245, 255, 250));
		send.setBounds(110, 116, 180, 23);

		group_list = new JComboBox();
		group_list.setBackground(new Color(245, 255, 250));
		group_list.addItem("Choose a group");
		group_list.addItem("Group 1");
		group_list.addItem("Group 2");
		group_list.setBounds(110,29, 180, 23);

		action = new JComboBox();
		action.addItem("Select an action..");
		action.setBackground(new Color(245, 255, 250));
		action.addItem("Join");
		action.addItem("Leave");
		action.setBounds(110,70, 180, 23);

		contentPanel.add(action);
		contentPanel.add(group_list);		       
		contentPanel.add(gname);
		contentPanel.add(send);
		getContentPane().add(contentPanel);
		
		JLabel lblJoinleave = new JLabel("Join/Leave:");
		lblJoinleave.setBounds(10, 74, 71, 14);
		contentPanel.add(lblJoinleave);
		
	}
	public void addChooseGNameActionListener(ActionListener listener)
	{
		group_list.addActionListener(listener);
	}
	public void addChooseActActionListener(ActionListener listener)
	{
		action.addActionListener(listener);
	}
	public void addSendRequestActionListener(MouseListener listener)
	{
		send.addMouseListener(listener);
	}
}

package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class AddNewGroupUI extends JDialog {
	JTextField group_name;
	JPanel pan;
	JLabel gname;
	JButton send;

	/**
	 * Create the dialog.
	 */
	public AddNewGroupUI() {
		pan= new JPanel();
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Edit file details");
		ImageIcon icon =new ImageIcon(getClass().getResource("/images/icon.png"));
		setIconImage(icon.getImage());
		pan.setLayout(null);
		setResizable(false);
		pan.setBackground(new Color(250,240,230));				
		setBackground(new Color(250, 240, 230));
		setTitle("Add new group");
		setBounds(60,60,200,170);
               
        gname =new JLabel("Group name:");
        gname.setBounds(38, 11, 90, 35);
        
    	group_name = new JTextField();
    	group_name.setColumns(20);
    	group_name.setBounds(38,49,100,20);
    					
		send = new JButton("OK");
		send.setBackground(new Color(245, 255, 250));
		send.setBounds(48, 81, 80, 23);
		
		pan.add(group_name);		       
		pan.add(gname);
		pan.add(send);
		getContentPane().add(pan);
	}
	public void clearFields()
	{
		group_name.setText("");
	}
	
	/**Setters and getters*/
	public String getGroup_name() {
		return group_name.getText();
	}

	public void setGroup_name() {
		this.group_name.setText("");
	}
	public void addSendActionListener(ActionListener listener)
	{
		send.addActionListener(listener);
	}


}

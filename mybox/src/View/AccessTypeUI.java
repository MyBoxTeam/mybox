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
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AccessTypeUI extends JDialog {

	private final JPanel contentPanel = new JPanel();
	JComboBox access;
	JButton btnNext;
	JButton btnCancel;


	/**
	 * Create the dialog.
	 */
	public AccessTypeUI() {
		setBounds(100, 100, 300, 180);
		setVisible(true);
		setResizable(false);
		setTitle("Choose new Permission type");
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		ImageIcon icon =new ImageIcon(getClass().getResource("/images/icon.png"));
		setIconImage(icon.getImage());
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(250, 240, 230));
		contentPanel.setLayout(null);
		getContentPane().add(contentPanel);

		JLabel lblChooseAccessType = new JLabel("Choose Access Type:");
		lblChooseAccessType.setBounds(76, 21, 183, 19);
		contentPanel.add(lblChooseAccessType);

		access = new JComboBox();
		access.setBackground(new Color(250, 240, 230));
		access.setBounds(76, 45, 141, 19);
		access.addItem("Private");
		access.addItem("Group");
		access.addItem("Public");
		contentPanel.add(access);

		btnNext = new JButton("Next");
		btnNext.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String s = (String)access.getSelectedItem();
				switch(s){
				case "Private":
					/* enable access only for fileowner*/
					break;
				case "Group":
					AddGroupAccessUI acc = new AddGroupAccessUI();
					setVisible(false);
					break;
				case "Public":
					/*enable access for all users*/
					break;

				}
			}
		});
		btnNext.setBackground(new Color(245, 255, 250));
		btnNext.setBounds(39, 91, 89, 23);
		contentPanel.add(btnNext);

		btnCancel = new JButton("Cancel");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();		
			}
		});
		btnCancel.setBackground(new Color(245, 255, 250));
		btnCancel.setBounds(142, 91, 89, 23);
		contentPanel.add(btnCancel);
	}


	public JPanel getContentPanel() {
		return contentPanel;
	}
	public JComboBox getAccess() {
		return access;
	}
	public JButton getBtnNext() {
		return btnNext;
	}
	public void setAccess(JComboBox access) {
		this.access = access;
	}
	public void setBtnNext(JButton btnNext) {
		this.btnNext = btnNext;
	}
	public void setBtnCancel(JButton btnCancel) {
		this.btnCancel = btnCancel;
	}
	public JButton getBtnCancel() {
		return btnCancel;
	}
	/**********Action listeners*/
	public void addNextActionListener(ActionListener listener)
	{
		btnNext.addActionListener(listener);
	}
	public void addCancelActionListener(ActionListener listener)
	{
		btnCancel.addActionListener(listener);
	}
	public void addAccessActionListener(ActionListener listener)
	{
		access.addActionListener(listener);
	}

}

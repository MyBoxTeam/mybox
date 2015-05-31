package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EditFileDetailsUI extends JDialog {

	private JTextField textField;
	private final JPanel contentPanel = new JPanel();
	private JTextField textField_1;
	JButton btnApply;
	JButton btnCancel;
	private JTextArea textArea;
	JLabel lblFileName ;
	JLabel lblFileLocation;
	JLabel label;
	JLabel label_1;
	/**
	 * Create the dialog.
	 */
	public EditFileDetailsUI() {
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setTitle("Edit file details");
		setVisible(true);
		setResizable(false);
		ImageIcon icon =new ImageIcon(getClass().getResource("/images/icon.png"));
		setIconImage(icon.getImage());
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(250, 240, 230));
		contentPanel.setLayout(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		btnApply = new JButton("Apply");
		btnApply.setBackground(new Color(245, 255, 250));
		btnApply.setBounds(96, 227, 89, 23);
		contentPanel.add(btnApply);
		
		btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnCancel.setBackground(new Color(245, 255, 250));
		btnCancel.setBounds(222, 227, 89, 23);
		contentPanel.add(btnCancel);
		
		textField = new JTextField();
		textField.setBounds(165, 59, 180, 23);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(165, 100, 222, 99);
		contentPanel.add(textArea);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(165, 25, 180, 23);
		contentPanel.add(textField_1);
		
		lblFileName = new JLabel("File name:");
		lblFileName.setBounds(24, 29, 89, 14);
		contentPanel.add(lblFileName);
		
		lblFileLocation = new JLabel("File location:");
		lblFileLocation.setBounds(22, 63, 91, 14);
		contentPanel.add(lblFileLocation);
		
		label = new JLabel("(must be less than 30 words)");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		label.setBounds(24, 120, 145, 23);
		contentPanel.add(label);
		
		label_1 = new JLabel("File description:");
		label_1.setBounds(24, 103, 145, 19);
		contentPanel.add(label_1);
	}
	
	/**Setters and getters*/
	public String getTextField() {
		return textField.getText();
	}

	public void setTextField(JTextField textField) {
		this.textField.setText("");
	}

	public String getTextField_1() {
		return textField_1.getText();
	}

	public void setTextField_1(JTextField textField_1) {
		this.textField_1.setText("");
	}

	public String getTextArea() {
		return textArea.getText();
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea.setText("");
	}

	public void clearFields()
	{
		textField.setText("");
		textField_1.setText("");
		textArea.setText("");
	}
	public void addCancelActionListener(ActionListener listener)
	{
		btnCancel.addActionListener(listener);
	}
	public void addApplylActionListener(ActionListener listener)
	{
		btnApply.addActionListener(listener);
	}
}

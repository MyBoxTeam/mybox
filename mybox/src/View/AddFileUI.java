package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;

import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class AddFileUI extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	JLabel lblChooseAFile;
	JTextArea textArea ;
	JLabel lblEnterAFile_1;
	JLabel lblmustBelessThan;
	JButton btnApply;
	JButton btnCancel;
	JButton btnBrowse;

	/**
	 * Create the dialog.
	 */
	public AddFileUI() {
		setBounds(100, 100, 450, 300);
		setTitle("Add a file");
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		ImageIcon icon =new ImageIcon(getClass().getResource("/images/icon.png"));
		setIconImage(icon.getImage());
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(250, 240, 230));
		contentPanel.setLayout(null);
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		
		btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser fs=new JFileChooser(new File("c:\\"));
				fs.setDialogTitle("Upload a file");
				fs.setBackground(new Color(245, 255, 250));
				int result=fs.showOpenDialog(null);
				if (result==JFileChooser.APPROVE_OPTION)
				{
					File f1= fs.getSelectedFile();
					try {
						BufferedReader b=new BufferedReader(new FileReader(f1.getPath()));
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		btnBrowse.setBackground(new Color(245, 255, 250));
		btnBrowse.setBounds(165, 13, 89, 23);
		contentPanel.add(btnBrowse);
		
		lblChooseAFile = new JLabel("Choose a file:");
		lblChooseAFile.setBounds(10, 15, 101, 19);
		contentPanel.add(lblChooseAFile);
		{
			JLabel lblEnterAFile = new JLabel("Insert a file location:");
			lblEnterAFile.setBounds(10, 59, 145, 23);
			contentPanel.add(lblEnterAFile);
		}
		
		textField = new JTextField();
		textField.setBounds(165, 59, 180, 23);
		contentPanel.add(textField);
		textField.setColumns(10);
		
		textArea = new JTextArea();
		textArea.setBounds(165, 100, 222, 99);
		contentPanel.add(textArea);
		
		lblEnterAFile_1 = new JLabel("Insert a file description:");
		lblEnterAFile_1.setBounds(10, 105, 145, 19);
		contentPanel.add(lblEnterAFile_1);
		
		lblmustBelessThan = new JLabel("(must be less than 30 words)");
		lblmustBelessThan.setFont(new Font("Times New Roman", Font.PLAIN, 10));
		lblmustBelessThan.setBounds(10, 123, 145, 23);
		contentPanel.add(lblmustBelessThan);
		
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
	}
	public void ClearFIelds()
	{
		textField.setText("");
		textArea.setText("");
	}
	
	public String getTextField() {
		return textField.getSelectedText();
	}
	public void setTextField(JTextField textField) {
		this.textField.setText("");
	}
	public String getTextArea() {
		return textArea.getSelectedText();
	}
	public void setTextArea(JTextArea textArea) {
		this.textArea.setText("");
	}
	public JButton getBtnApply() {
		return btnApply;
	}
	public JButton getBtnCancel() {
		return btnCancel;
	}
	
	
	/****Action Listeners*///
	public void addCancelActionListener(ActionListener listener)
	{
		btnCancel.addActionListener(listener);
	}
	public void addApplylActionListener(ActionListener listener)
	{
		btnApply.addActionListener(listener);
	}
	public void addBrouseActionListener(ActionListener listener)
	{
		btnBrowse.addActionListener(listener);
	}
	


	

	
	
}

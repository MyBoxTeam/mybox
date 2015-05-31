package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JScrollPane;
import javax.swing.JLayeredPane;
import javax.swing.JList;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;

import java.awt.ScrollPane;

import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JRadioButton;

import java.awt.Choice;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JComboBox;

public class PrivateSpaceUI extends JFrame{

	JPanel contentPane;
	JTextField textField;
	public String search;
	public String remove_type;
	public int num;
	JButton btnNewFolder;
	JButton btnAddFile;
	JButton btnEditDetails;
	JButton btnLogOut;
	JButton btnRenameFila;
	JButton btnManagePermission;
	JComboBox remove;
	JButton btnLogout;
	JButton btnNewButton ;
	ImageIcon srh;
	JList list;
	JScrollPane scrollPane;
	JLabel lblFiles ;
	JButton btnLogOut_1;
	JButton btnUpdateFile;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrivateSpaceUI frame = new PrivateSpaceUI();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PrivateSpaceUI() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Private Space");
		setVisible(true);
		setBounds(0, 0, 600, 500);
		setResizable(false);
		ImageIcon icon =new ImageIcon(getClass().getResource("/images/icon.png"));
		setIconImage(icon.getImage());
		contentPane = new JPanel();

		contentPane.setBackground(new Color(250, 240, 230));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		btnAddFile = new JButton("Add File");
		btnAddFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddFileUI newfile = new AddFileUI();
				newfile.setVisible(true);				
			}
		});
		btnAddFile.setBackground(new Color(245, 255, 250));
		btnAddFile.setBounds(21, 10, 134, 23);
		contentPane.add(btnAddFile);
		btnNewFolder = new JButton("New Folder");
		btnNewFolder.setBackground(new Color(245, 255, 250));
		btnNewFolder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String foldername = JOptionPane.showInputDialog(btnNewFolder,
						"New Folder name", null);
				while(foldername.length()==0)
				{
					JOptionPane.showMessageDialog(btnNewFolder, "Folder name cannot be empty.Try again", "Oops..",0,null);
					foldername = JOptionPane.showInputDialog(btnNewFolder,
							"New Folder name", null);

				}
				String folderloc=JOptionPane.showInputDialog(btnNewFolder, "Folder location:");
				while(folderloc.length()==0)
				{
					JOptionPane.showMessageDialog(btnNewFolder, "Folder location cannot be empty.Try again", "Oops..",0,null);
					folderloc = JOptionPane.showInputDialog(btnNewFolder,
							"Folder location:", null);

				}
			}

			private void showMessageDialog(String string) {
				// TODO Auto-generated method stub

			}
		});
		btnNewFolder.setBounds(21, 148, 134, 23);
		contentPane.add(btnNewFolder);

		textField = new JTextField();
		textField.setBounds(407, 10, 134, 22);
		contentPane.add(textField);
		textField.setColumns(10);

		btnEditDetails = new JButton("Edit file details");
		btnEditDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EditFileDetailsUI edit = new EditFileDetailsUI();
				edit.setVisible(true);
			}
		});
		btnEditDetails.setBackground(new Color(245, 255, 250));
		//	btnEditDetails.setEnabled(false);
		btnEditDetails.setBounds(21, 182, 134, 23);
		contentPane.add(btnEditDetails);

		btnLogOut = new JButton("Log Out");
		btnLogOut.setBounds(680, 10, 115, 53);
		contentPane.add(btnLogOut);

		btnRenameFila = new JButton("Rename file");
		//	btnRenameFila.setEnabled(false);
		btnRenameFila.setBackground(new Color(245, 255, 250));
		btnRenameFila.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String newname = JOptionPane.showInputDialog(btnRenameFila,
						"New file name", null);				
			}
		});
		//btnRenameFila.setEnabled(false);
		btnRenameFila.setBounds(21, 114, 134, 23);
		contentPane.add(btnRenameFila);

		btnManagePermission = new JButton("Change file access");
		btnManagePermission.setBackground(new Color(245, 255, 250));
		btnManagePermission.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManagePermissionsUI window=new ManagePermissionsUI();
				window.setVisible(true);
			

			}
		});
		btnManagePermission.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnManagePermission.setBounds(21, 216, 134, 23);
		//	btnManagePermission.setEnabled(false);
		contentPane.add(btnManagePermission);


		remove = new JComboBox();		
		remove.setMaximumRowCount(3);
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JComboBox res = (JComboBox) e.getSource();
				String selection = (String) res.getSelectedItem();
				if(selection.equals("Permanently"))
				{
					System.out.println(num);
				}
				
			}
		});
		
		remove.setEditable(true);
		remove.setBackground(new Color(245, 255, 250));
		//	remove.setEnabled(false);
		remove.addItem("Remove File");
		remove.addItem("Temporary");
		remove.addItem("Permanently");
		remove.setBounds(21, 80, 134, 23);
		

		contentPane.add(remove);

		btnLogout = new JButton("Log out");
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLogout.setBackground(new Color(245, 255, 250));
		btnLogout.setBounds(21, 497, 134, 40);
		contentPane.add(btnLogout);

		btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			search = textField.getSelectedText().toLowerCase();
			}
		});
		btnNewButton.setBackground(new Color(245, 255, 250));
		srh =new ImageIcon(getClass().getResource("/images/search.png"));
		btnNewButton.setIcon(srh);
		btnNewButton.setBounds(545, 10, 28, 24);
		contentPane.add(btnNewButton);

		list = new JList();
		list.setFixedCellHeight(75);
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 num= (int)list.getSelectedValue();
				
			}
		});
		Object [] array = {1,4,2,3,4,5,6};
		list.setListData(array);
		
		scrollPane = new JScrollPane(list);
		scrollPane.setSize(373, 386);
		scrollPane.setLocation(187, 62);
		contentPane.add(scrollPane);

		lblFiles = new JLabel("Files");
		lblFiles.setForeground(new Color(160, 82, 45));
		lblFiles.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFiles.setBounds(187, 21, 102, 23);
		contentPane.add(lblFiles);
		
		btnLogOut_1 = new JButton("Log Out");
		btnLogOut_1.setBackground(new Color(248, 248, 255));
		btnLogOut_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnLogOut_1.setBounds(21, 437, 134, 23);
		contentPane.add(btnLogOut_1);
		
		btnUpdateFile = new JButton("Update file");
		btnUpdateFile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				UpdateFileUI filewin = new UpdateFileUI();
			}
		});
		btnUpdateFile.setBackground(new Color(245, 255, 250));
		btnUpdateFile.setBounds(21, 46, 134, 23);
		contentPane.add(btnUpdateFile);

	}

	public String getTextField() {
		return textField.getSelectedText();
	}

	public void setTextField(JTextField textField) {
		this.textField.setText("");
	}
	public String getList() {
		return (String) list.getSelectedValue();
	}
	public void setlist(File[] newlist) {
		list = new JList<File>(newlist);
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
}

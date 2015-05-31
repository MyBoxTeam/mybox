package View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

public class LogViewUI extends JFrame {

	private JPanel contentPane;
	JTextArea textArea ;

	
	/**
	 * Create the frame.
	 */
	public LogViewUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		setTitle("Log window");
		setVisible(true);
		setResizable(false);
		ImageIcon icon =new ImageIcon(getClass().getResource("/images/icon.png"));
		setIconImage(icon.getImage());
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 240, 230));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		textArea= new JTextArea();
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(26,26, 440, 320);
		contentPane.add(scrollPane);
	}


	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(String str) {
		this.textArea.setText(str);
	}
}

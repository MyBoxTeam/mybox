package Controller;
import javax.swing.JOptionPane;

public class SystemMessageController {

	
	public static void displayMessage(String Message){
		JOptionPane.showMessageDialog(null, Message, "System Message", 
				JOptionPane.INFORMATION_MESSAGE);
	}
	public static int displayConfirmationMessage(String Message){
		return JOptionPane.showConfirmDialog(null, Message, "System Confirmation Message", 2);
	}
	
	public static void displayErrorMessage(String Message){
		JOptionPane.showMessageDialog(null, Message, "System Error Message",
				JOptionPane.ERROR_MESSAGE);
	}
}

package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import Communication.Client;
import View.ClientUI;
import View.ConnectToServerUI;

public class ConnectToServerController {
	final public static int DEFAULT_PORT = 5555;
	ConnectToServerUI gui;
	String host;
	Client client;
	ClientUI login;
	
	public ConnectToServerController()
	{
		ConnectToServerUI gui= new ConnectToServerUI();
	}
	class ConnectToServerActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent arg0) {
			host= gui.getTextField();
			try {
				client= new Client(host, DEFAULT_PORT);
				
			} catch (IOException e1) {
				
				SystemMessageController.displayErrorMessage("The Connection was failed");
				gui.dispose();
			}
			login = new ClientUI();
			gui.dispose();
		}

}
}

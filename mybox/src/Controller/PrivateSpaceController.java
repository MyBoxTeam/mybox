package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import View.PrivateSpaceUI;
import Communication.Client;
import Entity.User;

public class PrivateSpaceController {

	private PrivateSpaceUI privateSpace;
	private Client client;
	private User user;


	public PrivateSpaceController(Client clien,
			ClientController clientcontroller) {
		this.client=client;
		privateSpace = new PrivateSpaceUI();
		privateSpace.addRemoveTypeActionListener(new PrivateSpaceListener(clientcontroller));
		
	}
	class PrivateSpaceListener implements ActionListener
	{

		public PrivateSpaceListener(ClientController clientcontroller) {

			
		}	

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}}

}

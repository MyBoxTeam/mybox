package Communication;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import Entity.User;

public class Client extends AbstractClient{

	public User currentUser;
	public String currentUsername;
	ArrayList<File> fileList;
	ArrayList<String> groupList;




	public Client(String host, int port) throws IOException {
		super(host, port);
		openConnection();
		currentUser= new User();
		fileList = new ArrayList<File>();
		groupList= new ArrayList<String>();

	}
	@Override
	protected void handleMessageFromServer(Object msg) {
		// TODO Auto-generated method stub

	}

	public User getCurrentUser() {
		return currentUser;
	}
	public String getCurrentUsername() {
		return currentUsername;
	}
	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
	public void setCurrentUsername(String currentUsername) {
		this.currentUsername = currentUsername;
	}


	public void quit() {
		try {
			closeConnection();
		} catch (IOException e) {
		}
		System.exit(0);
	}
	public void getData(String query, boolean b) {
		try {
			MessageHandle msg = new MessageHandle(query,b);
			sendToServer(msg);
		} catch (IOException e) {
			e.printStackTrace();
			quit();
		}

	}
}

package Entity;
import java.util.List;

import Communication.Client;

public class User {

	private String UserName;
	private String Password;
	private String FullName;
	private int Status = 0;
	private boolean isSysAdmin=false;
	
	public User()
	{
		
	}
	public User(String UN, String P, String FN, boolean sa) {
		setUserName(UN);
		setPassword(P);
		setFullName(FN);
		isSysAdmin=sa;
	}
	public String getUserName()
	{
		return this.UserName;
	}
	
	public String getPassword() {
		return Password;
	}
	public String getFullName() {
		return FullName;
	}
	public boolean isSysAdmin() {
		return isSysAdmin;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public void setFullName(String fullName) {
		FullName = fullName;
	}
	public void setSysAdmin(boolean isSysAdmin) {
		this.isSysAdmin = isSysAdmin;
	}
	public int getStatus() {
		return Status;
	}
	public void setStatus(int status) {
		Status = status;
	}
	
	public void getUserFromDB(Client client, String username)
	{
		String query = "Select * FROM users WHERE User_Name = "+username+" ";
		client.getData(query,false);
	}
	
	public void setStatusDB(Client client, int stat)
	{
		String username =client.getCurrentUser().getUserName();
		String query="UPDATE users SET status = "+stat+" WHERE user_name = "+username+"";
		client.getData(query,true);
	}
	
	}


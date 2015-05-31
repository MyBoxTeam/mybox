package Controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;

import Entity.User;
import Communication.EchoServer;
import Communication.ConnectionToClient;
import Entity.User;
import View.LogViewUI;
import View.ServerUI;

public class ServerController {
	private ServerUI gui;
	private LogViewUI lv;
	private ServerController sc;
	private Connection conn;
	private ArrayList<User> userlist;
	private String dbname;
	private String password;
	private String dbuser;
	private String portnum;
	private int port;
	private EchoServer sv;

	public ServerController(ServerUI Sui, LogViewUI Lvi)
	{
		gui=Sui;
		lv=Lvi;
		sc=this;
		gui.setUsertxt();
		gui.setPasstxt();
		gui.setPorttxt();
		gui.setNametext();
		userlist= new ArrayList<User>();
		gui.addConnectActionListener(new ServerListener());
	}
	public class ServerListener implements ActionListener
	{

		public void actionPerformed(ActionEvent arg0) {
			dbname=gui.getNametext();
			password=gui.getPasstxt();
			dbuser=gui.getUsertxt();
			portnum=gui.getPorttxt();
			port=Integer.parseInt(portnum);
			if(openConnectionDB()){
				sv = new EchoServer(port);
				sv.setConn(conn);

				try 
				{
					sv.listen(); //Start listening for connections
					sv.setController(sc);
					gui.dispose();
					lv.setVisible(true);

				} 
				catch (Exception ex) 
				{
					SystemMessageController.displayErrorMessage("ERROR - Could not listen for clients!");
				}
			}
		}
	}	
	public boolean openConnectionDB(){
		try 
		{
			Class.forName("com.mysql.jdbc.Driver").newInstance();
		} catch (Exception ex) {/* handle the error*/}

		try 
		{
			conn = DriverManager.getConnection(dbname,dbuser,password);
			//Connection conn = DriverManager.getConnection("jdbc:mysql://192.168.3.68/test","root","Root");
			gui.setTextField("SQL connection succeed");
			return true;

		} catch (SQLException ex) 
		{/* handle any errors*/
			gui.setTextField("SQLException: " + ex.getMessage());
			gui.setTextField("SQLState: " + ex.getSQLState());
			gui.setTextField("VendorError: " + ex.getErrorCode());
			return false;
		}

	}
	public void SetLog(User u, String Task){

        if(Task.equals("login")){
        	userlist.add(u);
        	lv.getTextArea();
        	lv.getTextArea().append("User name:  " + u.getUserName() +  ",  is connected\n");	
        }
        if(Task.equals("logout")){
        	lv.getTextArea();
        	lv.getTextArea().append("User name:  " + u.getUserName() +  ",  is disconnected\n");		
        	userlist.remove(u);
        
        }	
		
	}
}

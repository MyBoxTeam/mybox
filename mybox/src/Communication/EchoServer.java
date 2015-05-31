package Communication;


import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Controller.ServerController;
import Communication.AbstractServer;
import Communication.ConnectionToClient;



/**
 * This class overrides some of the methods in the abstract 
 * superclass in order to give more functionality to the server.
 *
 * @author Dr Timothy C. Lethbridge
 * @author Dr Robert Lagani&egrave;re
 * @author Fran&ccedil;ois B&eacute;langer
 * @author Paul Holden
 * @version July 2000
 */

public class EchoServer extends AbstractServer 
{
  //Class variables *************************************************
  /**
   * The default port to listen on.
   */

  private Connection conn;
  private ServerController controller;

   //Class variables *************************************************
   public Connection getConn() {
 	return conn;}
  //Constructors ****************************************************
  
  /**
   * Constructs an instance of the echo server.
   *
   * @param port The port number to connect on.
   */
  public EchoServer(int port) 
  {
    super(port);
  }

  //Instance methods ************************************************
  
  /**
   * This method handles any messages received from the client.
   *
   * @param msg The message received from the client.
   * @param client The connection from which the message originated.
   */

  public void handleMessageFromClient  (Object msg, ConnectionToClient client)
{		
	  ResultSet rs=null;
	  String str=msg.toString();
	  System.out.println("Message received: " + msg + " from " + client);
	  String[] tokens=str.split(" ");
		try 
		{
			Statement stmt = conn.createStatement();
			 System.out.println("Message received: " + msg + " from " + client);
			switch(tokens[0])
			{
			case ("1"):
			    	rs=stmt.executeQuery("SELECT * from files;");
			        
				   while(rs.next())
				   {
					   client.sendToClient(rs.getString(1)+" "+rs.getString(2));
				   }
				   rs.close();
				   stmt.close();
				   break;
			case ("2"):
				boolean exist=checkDB(conn, "files", "name", tokens[1], client);//checks if the file is already exists in DB
				if(exist==false)//if not exists, we can't update it
					{
					client.sendToClient("The file is not exist in DB");
					client.close();
					}
				else if(exist)//if exists
				{
					if(checkDB(conn, "files", "name", tokens[2], client))//checks if new name is not occupated
					{
						client.sendToClient("The new filename is already occupated");
						client.close();
					}
					else
					{
					rs=stmt.executeQuery("SELECT name from files;");
					PreparedStatement upd=conn.prepareStatement("UPDATE files SET name= ? WHERE name= ?");
					while(rs.next())
					{
						upd.setString(1, tokens[2]);
						upd.setString(2, tokens[1]);
						upd.executeUpdate();	
					} 
					client.sendToClient("File name was updated successfully");
					rs.close();}}
				break;
				
			case ("3"):
				String query = "INSERT INTO files (name,location)" +
				        "VALUES (?, ?)";
				PreparedStatement add=conn.prepareStatement(query);
				add.setString(1, tokens[1]);
				add.setString(2, tokens[2]);
				add.executeUpdate();
				client.sendToClient("File was added");
				break;
			case("4"):
				client.sendToClient("Good BYE "+client);
				client.close();
				
			
				
			}
			
		} catch (Exception e) {e.printStackTrace();}
}
  
  private ResultSet executeUpdate(String string) {
	// TODO Auto-generated method stub
	return null;
}

/**
   * This method overrides the one in the superclass.  Called
   * when the server starts listening for connections.
   */
  
 public void setConn(Connection conn) {
	this.conn = conn;
}
 public void setController(ServerController controller) {
		this.controller = controller;
	}

  protected void serverStarted()
  {
    System.out.println
      ("Server listening for connections on port " + getPort());
  }
  
  /**
   * This method overrides the one in the superclass.  Called
   * when the server stops listening for connections.
   */
  protected void serverStopped()
  {
    System.out.println
      ("Server has stopped listening for connections.");
  }
  
  //Class methods ***************************************************
  
  /**
   * This method is responsible for the creation of 
   * the server instance (there is no UI in this phase).
   *
   * @param args[0] The port number to listen on.  Defaults to 5555 
   *          if no argument is entered.
   */
   

public static boolean checkDB(Connection con, String table, String column, Object find, ConnectionToClient client)
{	
	boolean found=true;
	String sql="SELECT "+column+" FROM "+table+" ;";
	try {
		Statement stm =con.createStatement();
		ResultSet rs=stm.executeQuery(sql);
		while(rs.next())
		{
			if(find instanceof String)
			{
				if(((String)find).equals(rs.getString(1)))
				{
					found=true;
				}
				else
					found=false;			
			}
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return found;

}
  
}


//End of EchoServer class


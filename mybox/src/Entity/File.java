package Entity;
import java.io.*;

public class File {

	private String File_Name;
	private String Description;
	private String Location;
	private int File_Status = 0;
	private int Access_Type = 0;

	public String getFile_name() {
		return File_Name;
	}

	public void setFile_name(String File_name) {
		this.File_Name=File_Name;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String Description) {
		this.Description=Description;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String Location) {
		this.Location=Location;
	}

	public int getFile_Status() {
		return File_Status;
	}

	public void setFile_Status(int File_Status) {
		this.File_Status=File_Status;
	}

	public int getAccess_Type() {
		return Access_Type;
	}

	public void setAccess_Type(int Access_Type) {
		this.Access_Type=Access_Type;
	}

	public File(String name, String des, String loc) {
		File_Name=name;
		Description=des;
		Location=loc;
	
	}

}
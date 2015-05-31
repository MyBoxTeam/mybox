package Entity;

public class RequestToGroup {

	private String Type;
	private String Group_name;
	private boolean Confirmation = false;
	/////////////private String User_Name;

	public String getType() {
		return Type;
	}

	public void setType(String Type) {
		this.Type=Type;
	}

	public String getGroup_name() {
		return Group_name;
	}

	public void setGroup_name(String Group_name) {
		this.Group_name=Group_name;
	}

	public boolean getConfirmation() {
		return Confirmation;
	}

	public void setConfirmation(boolean Confirmation) {
		this.Confirmation=Confirmation;
	}

	public RequestToGroup() {
		
	}

}
package Entity;

public class InterestGroup {

	private String Group_Name;
	private int Num_Of_Members = 0;

	public String getGroup_Name() {
		return Group_Name;
	}

	public void setGroup_Name(String Group_Name) {
		this.Group_Name=Group_Name;
	}

	public int getNum_Of_Members() {
		return Num_Of_Members;
	}

	public void setNum_Of_Members(int Num_Of_Members) {
		this.Num_Of_Members=Num_Of_Members;
	}

	public InterestGroup(String GN, int num) {
		setGroup_Name(GN);
		setNum_Of_Members(num);
	}

}
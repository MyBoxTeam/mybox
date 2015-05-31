package Communication;

import java.util.ArrayList;

public class MessageHandle extends ArrayList {

	private Object obj;
	private boolean toupdate;
	private String str;
	public Object getObj() {
		return obj;
	}
	public boolean isToupdate() {
		return toupdate;
	}
	public String getStr() {
		return str;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	public void setToupdate(boolean toupdate) {
		this.toupdate = toupdate;
	}
	public void setStr(String str) {
		this.str = str;
	}
	public MessageHandle(Object obj,boolean update) {
		this.obj=obj;
		this.toupdate = update;
	}


	public MessageHandle(String str, boolean update) {
		this.str=str;
		this.toupdate = update;
	}
}

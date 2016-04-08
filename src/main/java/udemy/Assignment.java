package udemy;

import java.util.Date;

public class Assignment {
	
	private String mName, mClassName;
	private Date mAssinmnetDueDate;
	
	public Assignment(String name, String classname, Date assignmentDueDate){
		mName = name;
		mClassName = classname;
		mAssinmnetDueDate = assignmentDueDate;
		
				
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getmClassName() {
		return mClassName;
	}

	public void setmClassName(String mClassName) {
		this.mClassName = mClassName;
	}

	public Date getmAssinmnetDueDate() {
		return mAssinmnetDueDate;
	}

	public void setmAssinmnetDueDate(Date mAssinmnetDueDate) {
		this.mAssinmnetDueDate = mAssinmnetDueDate;
	}

}

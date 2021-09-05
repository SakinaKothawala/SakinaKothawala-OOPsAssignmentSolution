package com.techdepartment;
import com.inheritance.SuperDepartment;

public class TechDepartment extends SuperDepartment {
	private String departmentName;
    private String todayswork;
    private String workdeadline;
    private String stackinfo;
    //private String istodayAHoliday;
	
	public String getDepartmentName() {
		return departmentName;
	}		
		
	public void setDepartmentName(String departmentName) {
			this.departmentName = departmentName;		
 }
	

	public String getTodayswork() {
		return todayswork;
	}


	public void setTodayswork(String todayswork) {
		this.todayswork = todayswork;
	}


	public String getWorkdeadline() {
		return workdeadline;
	}


	public void setWorkdeadline(String workdeadline) {
		this.workdeadline = workdeadline;
	}

	public String getTechStackInformation() {
		return stackinfo;
	}

	public void setTechStackInformation(String stackinfo) {
		this.stackinfo = stackinfo;
	}
}


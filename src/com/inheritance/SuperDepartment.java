package com.inheritance;

public class SuperDepartment {
	protected String departmentName;
    protected String todayswork;
    protected String workdeadline;
    protected String istodayAHoliday;
    protected String activity;
    protected String stackinfo;   
   
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


	public String getIstodayAHoliday() {
		return istodayAHoliday;
	}

	public void setIstodayAHoliday(String istodayAHoliday) {
		this.istodayAHoliday = istodayAHoliday;
	}
	public String getDoActivity() {
		return activity;
	}

	public void setDoActivity(String activity) {
		this.activity = activity;
	}
	public String getTechStackInformation() {
		return stackinfo;
	}

	public void setTechStackInformation(String stackinfo) {
		this.stackinfo = stackinfo;
	}
}

package com.main;
import com.inheritance.*;
import com.hrdepartment.*;
import com.admindepartment.*;
import com.techdepartment.*;
import java.util.Scanner;

public class Driver {
	private static final Scanner sc = new Scanner( System.in );
	
  public static void main(String [] args)
	
	{
	  
	  SuperDepartment obj1 = new SuperDepartment();
	  
		obj1.setDepartmentName("Super Department");
		obj1.setTodayswork("No work as of now");
		obj1.setWorkdeadline("Nil");
		obj1.setIstodayAHoliday("Today is not a Holiday");
		
		SuperDepartment obj2 = new AdminDepartment();
		SuperDepartment obj3 = new HrDepartment();
		SuperDepartment obj4 = new TechDepartment();
		
	    System.out.println( "Kindly Choose your department : " );
		System.out.println( "1. Super Department" );
		System.out.println( "2. Admin Department" );
		System.out.println( "3. HR Department" );
		System.out.println( "4. Tech Department" );
		
		int choice = sc.nextInt();
		
		switch( choice ) {
				
		   case 1:
			    System.out.println(obj1.getDepartmentName());
				System.out.println(obj1.getTodayswork());
				System.out.println(obj1.getWorkdeadline());
				System.out.println(obj1.getIstodayAHoliday());
				break;
				
		   case 2:		
			    obj2.setDepartmentName("Welcome to Admin Department");
				obj2.setTodayswork("Complete your documents Submission ");
				obj2.setWorkdeadline("Complete By EOD");
				
				System.out.println(obj2.getDepartmentName());
				System.out.println(obj2.getTodayswork());
				System.out.println(obj2.getWorkdeadline());
				System.out.println(obj1.getIstodayAHoliday());
				break;
				
		   case 3:
			    obj3.setDepartmentName("Welcome to HR Department");
				obj3.setDoActivity("Team Lunch");
				obj3.setTodayswork("Fill Today's worksheet and mark attandance ");
				obj3.setWorkdeadline("Complete By EOD");
				
				System.out.println(obj3.getDepartmentName());
				System.out.println(obj3.getDoActivity());
				System.out.println(obj3.getTodayswork());
				System.out.println(obj3.getWorkdeadline());
				System.out.println(obj1.getIstodayAHoliday());
				break;
				
		   case 4:
			    obj4.setDepartmentName("Welcome to Tech Department");
				obj4.setTodayswork("Complete coding of module 1  ");
				obj4.setWorkdeadline("Complete By EOD");
				obj4.setTechStackInformation("Core Java");
				
				System.out.println(obj4.getDepartmentName());
				System.out.println(obj4.getTodayswork());
				System.out.println(obj4.getWorkdeadline());
				System.out.println(obj4.getTechStackInformation());
				System.out.println(obj1.getIstodayAHoliday());
				break;
		 default:
				System.out.println( "Incorrect choice" );
				return;	
		}
	  
	
	
	
	
	

		
		
		
		
		
    }
   
}

package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastname;
	private String password;
	private String department;
	private int defaultPasswordLength = 10;
	private int mailboxCapacity = 500;
	private String email;
	private String alternateEmail;
	private String companySuffix = "aeycompany.com";
	
	//Constructor to receive first name and last name//
	public String Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastname = lastName;
		
		
		//Call method asking for department - return department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//Call method that returns random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is " + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix; 
		System.out.println("Your email is " + email);
		
		//Generate random password
		
		private String randomPassword(int length) {
			
			String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%";
			char[] password = new char [length];
			for (int i=0; i<length; i++) {
				int rand = (int) (Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
			}
			return new String(password);
			
		}
		
	}
	
	private String randomPassword(int defaultPasswordLength2) {
		// TODO Auto-generated method stub
		return null;
	}

	//Ask for department
	private String setDepartment() {
		System.out.print("Enter the department/n1 for Sales/n2 for Development/n3 for Accounting/n0 for none/ Enter Department Code: ");
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		if (deptChoice == 1) {return "sales"; }
		else if (deptChoice == 2) {return "dev"; }
		else if (deptChoice == 3) {return "acct"; }
		else return ""; 
	}
	
	
	//Set mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
		
	}
	//Set alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
		
	}
	
	//Change password
	public void changePassword(String password) {
		this.password = password;
	}
	

	public int getMailboxCapacity() {return mailboxCapacity; };
	public String getAlternateEmail() {return alternateEmail; }
	public String getPassword() {return password; }
	
	public String showInfo() {
		return "DISPLAY NAME: " + firstName + " " + lastname + "COMPANY EMAIL: " + email + "MAILBOX CAPACITY: " + mailboxCapacity + "mb";
		
		
	}

	public String showInfo1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

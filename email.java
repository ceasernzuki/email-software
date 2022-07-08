package Clientemailapplication;

import java.util.Scanner;

public class email {
		
			private String firstName;
			private String lastName;
			private String password;
			private String department;
			private int mailboxCapacity =500;
			private String alternateEmail;
			private int defaultPasswordLength =5;
			private String email;
			private String companySuffix = "YandJ.com";
			
		// constructor for 1ast name and last name
		// ask department
		// generate password
		// set mailbox cap
		// set alternate email
		// change password
			

			email(String firstName, String lastName) {
				
				this.firstName = firstName;
				this.lastName = lastName;
			//System.out.println("EMAIL CREATED: " + this.firstName + " "+ this.lastName);
			
			//call a method asking for the department - return the department
			
			this.department = setDepartment();
			System.out.println("Department: "+ this.department);
			
			
			//method for random password
			this.password = randomPassword(defaultPasswordLength);
			//	System.out.println("Your password is:" + this.password);
			
			//combine elements to generate email
			email = firstName.toLowerCase() + "." +lastName.toLowerCase() + "@" +  department + "." + companySuffix;
			System.out.println("Your email is:" + email );

			}
			
			private String randomPassword(int length) {
			String passwordSet = "ABCDEF12345!@#$%";
			char[] password = new char[length];
			for (int i=0; i<length;i++){
				int rand = (int)(Math.random() * passwordSet.length());
				password[i] = passwordSet.charAt(rand);
				System.out.println(rand);
				System.out.println(passwordSet.charAt(rand));
			}
			return new String(password);

			}
			
			private String setDepartment() {
				System.out.print("New worker :" + firstName + ".Department Codes:\n1 for Sales\n2 for Development\n3 for Accounting \n0 for none\nEnter department code");
				Scanner in = new Scanner(System.in);
				int depChoice = in.nextInt();
				if (depChoice == 1) { return "sales";}
				else if (depChoice ==2) {return "dev";}
				else if(depChoice==3) {return"acct";}
				else { return "";}
				
			}
			public void setMailboxCapacity (int capacity) {
				this.mailboxCapacity = capacity;
			}
			public void setAlternateEmail(String altEmail) {
				this.alternateEmail = altEmail;
			}
			public void changePassword(String password) {
				this.password = password;
			}
			public int getmailboxCapacity() {return mailboxCapacity;}
			public String getAlternateEmail() {return alternateEmail;}
			public String getPassword() {return password;}	
			
			public String showInfo() {
				return "DISPLAY NAME: " + firstName + " " + lastName + 
						 "\nCOMPANY EMAIL:" + email +
						" \nMAILBOX CAPACITY:" + mailboxCapacity + "mb";
		// TODO Auto-generated constructor stub
	}
}

			

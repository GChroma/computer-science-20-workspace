package code;

import java.util.Scanner;
// command shift o auto import (maybe ctrl shift o idk mac version)

public class HelloWorld {

	public static void main(String[] args) {
		
		int year;
		String name;
		String birthdayConfirm;
		int age;
	
		System.out.println("Hello World! \n");
		
		System.out.print("Enter your name: ");
		
		//System.in is where it reads from (keyboard)
		Scanner myObj = new Scanner(System.in);
		
		name = myObj.next();
		
		System.out.println("Hello, " + name);

		System.out.print("What year were you born? ");
	
		year = myObj.nextInt();
		
		System.out.print("Has your birthday passed yet in this year? Y/N ");
		
		birthdayConfirm = myObj.next();
		
		if (birthdayConfirm.equals("Y")) {//check Y or N and assign age appropriately
			
			age = 2021 - year;
			
		} else if(birthdayConfirm.equals("N")) {
			
			age = 2021 - year - 1;
			
		} else {
			
			System.out.println("Please enter Y or N and nothing else.");
			age = 69420;//haha funny number (not error trapping this)
		}
		
		System.out.println("You are " + name + " and you are " + age + " years old.");
		
		if(age >= 18) {
			
			System.out.println("You may vote.");
			
		}else{
			
			System.out.println("You may not vote.");
			
		}
			
		
		myObj.close();
	}

}

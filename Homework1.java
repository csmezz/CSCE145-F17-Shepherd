package Homework;
import java.util.Scanner;

/*
 * Objective:
 
Write a program that prompts the user for important information, and then prints that information to the console.  The information that should be collected includes:
 
Name
Age
Height (in meters)
Blood Type
Cat person (true or false)
Dog person (true or false)
Are they a shape shifting reptilian (true or false)
Amount of gold buried on their land (in kilograms) 
 * 
 */


/*
 * Will Carpenter
 * 08/30/17
 * HW1
 */


//This will be the most verbose option
public class Homework1 {
	
	public static void main(String[] args){
		System.out.println("Welcome to the Big Brother System! Please input the information as prompted.");
		//Initialize your Scanner object to take in input
		Scanner keyboard = new Scanner(System.in);
		//Prompt the user for information, name first
		System.out.println("Please enter your name!");
		String Name = keyboard.nextLine(); //This line will store the information within the inputStream on your keyboard into a String variable you can use!
		//Now collect the user's Age
		System.out.println("Please enter your age!");
		double Age = keyboard.nextDouble(); //This line will store any real number (+-2 Billion) into a variable called Age
		//Now collect the user's Height
		System.out.println("Please enter your Height! (In meters)");
		double Height = keyboard.nextDouble(); //Getting the idea?
		//Now collect the user's Blood Type (Note, to get all different types of blood, use a string.
		System.out.println("Please enter your blood type!");
		String bloodType = keyboard.nextLine();
		//Now collect information about true or false situations
			//CatPerson first
		boolean isCatPerson = false;
		System.out.println("Are you a cat person? (Y/N)");
			if(keyboard.next().equalsIgnoreCase("Y")){
				isCatPerson = true;
			}
		//Similar System for Dog People
		boolean isDogPerson = false;
		System.out.println("Are you a dog person? (Y/N)");
			if(keyboard.next().equalsIgnoreCase("Y")){
				isDogPerson = true;
			}
		//Same system for reptillian question
		boolean isShapeShifter = false;
		System.out.println("Are you a shape shifting reptillian?");
			if(keyboard.next().equalsIgnoreCase("Y")){
				isShapeShifter = true;
			}
		//Last question asks for the amount of gold buried on their land. We can store this as a double
		double amountOfGoldBuriedOnLand = 0; //Normally you wouldn't want to use variable names quite this pointless and overly descriptive, just wastes space and time
		System.out.println("How much gold do you have buried on your land? (In Kg)");
		amountOfGoldBuriedOnLand = keyboard.nextDouble();
		
		//Now we can output everything
		
		//Note: There are easier ways to do this type of assignment, unfortunately we do not know how to do them yet.
		
		System.out.println("Name: " + Name);
		System.out.println("Age: " + Age + " years old");
		System.out.println("Height: " + Height + "m");
		System.out.println("Bloodtype: " + bloodType);
		System.out.println("Catperson: " + isCatPerson);
		System.out.println("Dogperson: " + isDogPerson);
		System.out.println("Reptillian Shape Shifter: " + isShapeShifter);
		System.out.println("Amount of gold buried on land: " + amountOfGoldBuriedOnLand + "Kg");
		
		
	}

}

/*
Jade Walters
CSCI 2251
Assignment: Human Resources
Purpose: 
Sources:
*/

/*TO DO	Write a class named Person. 
	This will be a very basic class with three attributes for storing name, 
	height, and weight information. This class should also have a toString method that 
	returns the Person data in a database-ready String format.
*/

public class Person {
	
	//instance variables
	private String name;
	private double height;
	private double weight;
	
	//constructor
	public Person(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
}
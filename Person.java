/*
Jade Walters
CSCI 2251
Assignment: Human Resources
Purpose: 
Sources:
*/

/*Write a class named Person. 
	This will be a very basic class with three attributes for storing name, 
	height, and weight information. This class should also have a toString method that 
	returns the Person data in a database-ready String format.
*/

public class Person {
	
	//instance variables for name, height, weight
	private String name;
	private double height;
	private double weight;
	
	//constructor
	public Person(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	//toSring method returns Person data in database-ready format
	@Override
	public String toString() {
		String personData = name + " " + height + " " + weight;
		return personData;
	}
}
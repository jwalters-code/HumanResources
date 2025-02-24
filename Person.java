/*
Jade Walters
CSCI 2251
Assignment: Human Resources
Purpose: to practice creating classes and using inheritence
Sources: I referenced some of my past assignments such as 
HurricaneRowData and TicTacToe
--I watched a Coding with John tutorial about interfaces and abstract class
source: https://www.youtube.com/watch?v=HvPlEJ3LHgE
--I looked at a GeeksforGeeks page for help on parseDouble method
source: https://www.geeksforgeeks.org/convert-string-to-double-in-java/
--I got help on the toString method for array lists from PrepInsta
source: https://prepinsta.com/java/arraylist-tostring-method/
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
	//will split on white space
	@Override
	public String toString() {
		String personData = name + " " + height + " " + weight;
		return personData;
	}
		
	//setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	//getter for name
	public String getName() {
		return this.name;
	}
	
	//setter for height
	public void setHeight(double height) {
		this.height = height;
	}
	
	//getter for height
	public double getHeight() {
		return this.height;
	}
	
	//setter for weight
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	//getter for weight
	public double getWeight() {
		return this.weight;
	}
}
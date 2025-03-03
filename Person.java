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

/*
TODO You are strongly encouraged to use super.add(p) in PersonOrderedSet.add and then perform a sort of the data to make sure 
everything is in order. You are allowed to use the built-in Collections.sort method, but in order to make it work, Person 
will need to implement the Comparable interface and implement a compareTo method (You’re encouraged to look this up.). 
You may also look up and modify a bubblesort or other sorting technique for solving this problem.
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
	
	//toSring method returns Person data in database-ready format
	@Override
	public String toString() {
		String personData = String.format("%s %.0f %.0f", name, height, weight);
		return personData;
	}
}
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
TODO	Write a class named, PersonOrderedSet. This class should extend PersonSet and override the add method to 
add Persons in alphabetical order by name. 
*/

/*
TODO You are strongly encouraged to use super.add(p) in PersonOrderedSet.add and then perform a sort of the data to make sure 
everything is in order. You are allowed to use the built-in Collections.sort method, but in order to make it work, Person 
will need to implement the Comparable interface and implement a compareTo method (You’re encouraged to look this up.). 
You may also look up and modify a bubblesort or other sorting technique for solving this problem.
*/

public class PersonOrderedSet extends PersonSet {
	
	@Override
	public void add(Person person) { 
		
		//add person to personSet
		super.add(person);
		
		//sort into alphabetical order
		
		
	}
	
	//toString method returns formatted array data with column headers
	@Override
	public String toString() {
		String orderedString = String.format("%-8s %-15s %15s\n", "Name", "Height (cm)", "Weight (kg)");
		orderedString = orderedString + super.toString();
		return orderedString;
	}
}



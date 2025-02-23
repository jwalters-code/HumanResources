/*
Jade Walters
CSCI 2251
Assignment: Human Resources
Purpose: 
Sources:
*/



/*	Write an interface named PersonList. The interface should have two abstract methods:
	A.	add – This method takes a Person as input and returns void. 
	B.	get – This method takes an int as input and returns a Person at the corresponding index of the input int.
*/

public interface PersonList {
	
	//add method takes Person as input and returns void
	public abstract void add(Person person);
	
	//TO DO finish method with return 
	//get method takes an int as input and returns Person at that index
	public abstract Person get(int index);
}
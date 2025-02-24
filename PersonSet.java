/*
Jade Walters
CSCI 2251
Assignment: Human Resources
Purpose: 
Sources:
*/

/*
	Write a class named, PersonSet, that implements the interface PersonList. Use an ArrayList and fill in the 
	add and get methods. You may not use any built in Set-type Java classes.
	
TO DO	In addition to implementing add and get methods, PersonSet must make sure that no duplicate Persons are added. 
	If you want to use the ArrayList’s built-in contains method to make this easier, you will need to add an equals 
	method to Person. See below for more details.
	
	If you want to use the ArrayList's contains method to see if a Person is already in the set, then you 
need to make sure that Person overrides the default equals method. To do so, fill in the following comment
outline and also refer to this resource for more information:
https://www.geeksforgeeks.org/overriding-equals-method-in-java/
//Equals method outline
@Override
public boolean equals(Object o)
{
	//if Object o is null then return false

	//if Object o == this then return true

	//if Object o is not an instance of Person then return false

//Declare a new variable of type Person (perhaps named p) 
//	and assign it to Object o cast as type Person

//if Person p has the same name, height, and weight as 
//	this then return true
//else return false
}
*/

import java.util.ArrayList;

public class PersonSet implements PersonList {
	
	//create Person ArrayList
	ArrayList<Person> personList = new ArrayList<Person>();
	
	//add method takes Person as input and returns void
	@Override
	public void add(Person person) {
		
		//check for duplicate entry
		if(!duplicate(person, personList)) {
			
			//add person to personList
			personList.add(person);
		}
	}
	
	//get method takes an int as input and returns Person at that index
	@Override
	public Person get(int index) {
		return personList.get(index);
	}
	
	//WILL THIS WORK OR MUST I LOOK AT EACH VARIABLE INDIVIDUALLY????
	//method checks for duplicate in personList 
	public boolean duplicate(Person person, ArrayList<Person> personList) {
		for(int i=0; i<personList.size();  i++) {
			if(person.equals(personList.get(i))) {
				return true; //is a duplicate
			}
		}
		return false; //not duplicate
	}
}
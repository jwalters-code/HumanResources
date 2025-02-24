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

import java.util.ArrayList;

public class PersonSet implements PersonList {
	
	//create Person ArrayList
	ArrayList<Person> personSet = new ArrayList<Person>();
	
	//add method takes Person as input and returns void
	@Override
	public void add(Person person) {
		
		//check for duplicate entry
		if(!duplicate(person, personSet)) {
			
			//add person to personSet
			personSet.add(person);
		}
	}
	
	//get method takes an int as input and returns Person at that index
	@Override
	public Person get(int index) {
		return personSet.get(index);
	}
	
	//method checks for duplicate in personList 
	//sources:
	//https://www.geeksforgeeks.org/convert-string-to-double-in-java/
	//https://prepinsta.com/java/arraylist-tostring-method/
	public boolean duplicate(Person person, ArrayList<Person> personSet) {
		if(personSet == null) {
			return false; //empty array
		} else {
			for(int i=0; i<personSet.size();  i++) {
				String tempStr = personSet.get(i).toString();
				String[] tempArr = tempStr.split(" ");
				double heightDoub = Double.parseDouble(tempArr[1]);
				double weightDoub = Double.parseDouble(tempArr[2]);
				if(tempArr[0].equals(person.getName()) 
					&& heightDoub == person.getHeight() 
					&& weightDoub == person.getWeight()) {
					return true; //is a duplicate
				}
			}
		}
		return false; //not duplicate
	}
}
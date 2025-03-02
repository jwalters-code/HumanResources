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
DONE	Write a class named, PersonImperialSet. This class should extend PersonSet and override the add method to 
convert the height measurement from centimeters to inches and the weight from kilograms to pounds. (Look up the
 conversions online.)
 */
 
 /*
 DONE You must use super.add(p) as the final step in PersonImperialSet.add after the conversion has been completed. (Assuming that 
p is a variable referring to a Person object to be added to the set.)
*/

public class PersonImperialSet extends PersonSet {
	
	@Override
	public void add(Person person) {
		
		//check for duplicate entry
		if(!duplicate(person, personSet)) {//DO I NEED THIS OR WOULD IT BE COVERED BY SUPER>ADD?????????????
			
			/* create new person object, convert height cm to inches & weight kg to pounds
			 * source: https://www.wikihow.com/Convert-Centimeters-to-Inches
			 * source: https://www.wikihow.com/Convert-Kilograms-to-Pounds */
			Person imperialPerson = new Person(person.getName(), person.getHeight() * 0.394, person.getWeight() * 2.2);
			
			//add imperialPerson to imperialPersonSet
			super.add(imperialPerson);
		}
	}
}
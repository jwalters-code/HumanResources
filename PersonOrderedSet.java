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

	//method adds Person objects to an aplabetical array list
	@Override
	public void add(Person person) { 
		
		//add person to personSet
		super.add(person);
		
		//sort into alphabetical order
		//create temp variables
		String name1;
		String name2;
		
		String tempName;
		double tempHeight;
		double tempWeight;
		
		//bubble sort
		for(int j=0; j<personSet.size()-1; j++) {
			for(int i=j+1; i<personSet.size(); i++) {
				name1 = personSet.get(j).getName();
				name2 = personSet.get(i).getName();
				if(name1.compareToIgnoreCase(name2) > 0) {
					
					//set info from index j to temp variables
					tempName = personSet.get(j).getName();
					tempHeight = personSet.get(j).getHeight();
					tempWeight = personSet.get(j).getWeight();
					
					//set index i info to index j
					personSet.get(j).setName(personSet.get(i).getName());
					personSet.get(j).setHeight(personSet.get(i).getHeight());
					personSet.get(j).setWeight(personSet.get(i).getWeight());
				
					//set temp info to index i
					personSet.get(i).setName(tempName);
					personSet.get(i).setHeight(tempHeight);
					personSet.get(i).setWeight(tempWeight);
				}
			}
		}
	}
	
	//toString method returns formatted array data with column headers
	@Override
	public String toString() {
		String orderedString = String.format("%-8s %-15s %15s\n", "Name", "Height (cm)", "Weight (kg)");
		orderedString = orderedString + super.toString();
		return orderedString;
	}
}



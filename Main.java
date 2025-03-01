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
Instructions for Part 2
You need to write two new classes for part 2: PersonImperialSet and PersonOrderedSet.
*/

/* 
TODO	Modify Main to 

		TODO instantiate a PersonOrderedSet and a PersonImperialSet, instead of the PersonSet.
		
		TODO Read in the data from the file, use it to populate both set objects with Persons, and then write out the data 
		into two separate output files (one ordered and one imperial).
*/

/*		
TODO 	I recommend adding methods to the classes to get the data in a text format for writing to file. You should think 
about which class is most appropriate for this method (or methods) to be implemented in order to reduce code duplication.
*/

/*
TODO	Output the formatted data with header to two separate files named: hr_imperial_set_output.txt and hr_ordered_set_output.txt
*/

/*
TODO	Lastly, output the ordered data and the imperial data to the screen/console, nicely formatted in rows and labeled 
columns (this nice formatting should already be in use if you wrote your toString methods well).
*/

/*
TODO Objects are passed by reference, not by value. If you add the same Person to PersonOrderedSet and PersonImperialSet you will 
see that the units get changed from metric to imperial in both. This is NOT what you want. One solution to this problem is to 
instantiate two new Person objects and pass the same name, height, weight info to each, and then pass one to the imperial set 
and the other to the ordered set. Another solution is to overload the Person constructor so that you can pass a Person type 
variable to the constructor and the constructor will take care of copying the data. Both solutions require two separate 
instantiations of Person in main.
*/

/*
Q1: Car and Engine are related
by which, Inheritance or Composition?
Composition

Q2: Color and Red are related
by which, Inheritance or Composition?
Inheritance

Q3: Shirt and Clothing are related
by which, Inheritance or Composition?
Inheritance

Q4: Furniture and Desk are related
by which, Inheritance or Composition?
Inheritance

Q5: CellPhone and Battery are related
by which, Inheritance or Composition?
Composition
*/

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		//instantiate a test Person object
		Person testPerson = new Person("Fabio", 191, 63);
		
		/*
		//test code, check if duplicates are excluded
		Person testPerson2 = new Person("Fabio", 191, 63);
		Person testPerson3 = new Person("notFabio", 191, 63);
		/*
		
		/*
		//test code, print testPerson
		System.out.println(testPerson);
		*/
		
		//instantiate a test PersonSet object
		PersonSet testPersonSet = new PersonSet();
		
		/*
		//test code, add test persons and print
		testPersonSet.add(testPerson);
		testPersonSet.add(testPerson2); //duplicate, shouldn't add
		testPersonSet.add(testPerson3);
		
		System.out.println(testPersonSet.get(0));
		System.out.println(testPersonSet.get(1));
		*/
		
		System.out.println(); //blank line for readability
		
		try {
			
			//read in from file
			File hrData = new File(args[0]);
			Scanner fileReader = new Scanner(hrData);
			
			//strip first line, headers
			fileReader.nextLine();
			
			while(fileReader.hasNext()) {
				//teacher provided code
				//copy to variables
				String name = fileReader.next();
				double height = fileReader.nextDouble();
				double weight = fileReader.nextDouble();
				
				//print
				System.out.println(name + " " + height + " " + weight);
			}
			
		}
		catch(IOException|ArrayIndexOutOfBoundsException e) {
			System.out.println("Enter a valid file");
			System.exit(1);
		}
	
		/*try
		{	
			FileWriter fileWriterOrder = new FileWriter("outputfile.txt");
			fileWriterOrder.write("testing");
			fileWriterOrder.close();
		}
		catch(IOException e)
		{
			e.printStackTrace();
			System.out.println(e);
			System.exit(1);
		}*/
	}
}

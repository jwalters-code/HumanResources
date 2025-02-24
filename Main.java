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

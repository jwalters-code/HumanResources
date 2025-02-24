/*
Jade Walters
CSCI 2251
Assignment: Human Resources
Purpose: 
Sources:
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

/* For part 1 you need to create three classes: Person, PersonList, and PersonSet. 
A mostly-blank Main.java has been provided, but you'll need to fill it in AND you 
must answer the five questions at the top of the document.

TO DO 5.	In the main method in Main:
	A.	Instantiate a single Person object as a test. You can make up the data passed to the constructor.
	B.	Instantiate a PersonSet object as a test.
	C.	Read data in from the file hr.txt and display it on the command prompt.
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
		
		//print to test
		//System.out.println(testPerson);
		
		//TO DO instantiate a test PersonSet object
		PersonSet testPersonSet = new PersonSet();
		
		//print to test
		//testPersonSet.add(testPerson);
		//System.out.println(testPersonSet.get(0));
		
		System.out.println();
		
		/* TO DO
		// Don't overcomplicate the data
		// reading. After skipping the
		// first row, you can use the 
		// following to read a row of
		// character info, assuming your
		// Scanner is named "fileReader"
		String name = fileReader.next();
		double height = fileReader.nextDouble();
		double weight = fileReader.nextDouble();
		*/
		
		
		
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

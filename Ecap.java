package KidsKodingVideos;
import java.util.*;
import java.io.*;
@SuppressWarnings("unused")

/* Encapsulation: An OOP concept that utilizes an object that gets an sets an instance variable 
 * which is "sugarcoated" or encapsulated (private access restricted) 
 * 
 * Getter (Accessor): Reads a value of an instance variable
 * Setter (Mutuator): Retrieves a value of an instance variable 
*/

/* Encapsulation Demonstration: Courtney is 14 years old. Her sister Mia is 18 years old. 
 * Utilize encapsulation to print Courtney and Mia's age 
*/

class EcapV2 { 
	private int age; //instance variable is encapsulated (private access restricted)
	public int getAge() { //getter
		return age;
	}
	public void setAge(int newAge) { //setter
		this.age = newAge;
	}
}

public class Ecap {
	public static void main(String... args) { //main method
		EcapV2 e = new EcapV2(); //Object creation to get and set instance variable
		e.setAge(14); //set Courtney's age to 14
		System.out.println(e.getAge()); //print Courtney's age
		e.setAge(18); //set Mia's age to 18
		System.out.println(e.getAge()); //print Mia's age
	}
}


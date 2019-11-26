package greetings;

import org.example.bots.*;
import org.example.greetings.*;

/**
 * A very simple greeting example in Java.
 */
public class GentleBot extends Bot implements Greetings<Person> {
	
	public GentleBot(String name) {
	    super(name);
	}
	
	@Override
	public String greet(Person person) {
	    return "Hello " + person.name + ", this is " + name + "!";
	}
	
	public static void main(String[] args) {
		GentleBot bob = new GentleBot("Bob");
		String greeting = bob.greet("Alice");

		System.out.println(greeting);
	}

}
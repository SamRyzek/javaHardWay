import java.util.Scanner;

public class RudeQuestions
{
	public static void main( String[] args )
	{
		String name, hanswer;
		int age;
		double weight, income, height;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Hello. What is your name?" );
		name = keyboard.next();
		
		System.out.print( "Hi, " + name + " How old are you?" );
		age = keyboard.nextInt();
		
		System.out.println( "So you're " + age + ", eh? That's very old." );
		System.out.print( "How much do you weigh, " + name + "? ");
		weight = keyboard.nextDouble();
		
		System.out.print( weight + "! Better keep that quiet!!" );
		System.out.print( " Finally, what's your income, " + name + "? " );
		income = keyboard.nextDouble();
		
		System.out.print( "Hopefully that is " + income + " per hour." );
		System.out.println( " and not per year!" );
		System.out.print( "Well, thanks for answering my rude questions, " );
		System.out.println( name + ".");
		//an integer will not blow the program up because an integer is a subset of the double numbers being looked for.
		//any number when the program is expecting a string does not blow the program up. My guess would be because integers and doubles can be considered 
		//types of strings
		//Entering a string for question 2 causes errors because the program is expecting an integer. additionally, entering a double when the 
		//program is expecting an integer causes an errors
		//Entering a string (a lot) for question 3 causes an error. However, entering an integer does not cause an error.
		//Entering a string (not enough) for question 4 causes in error. However, entering an integer does not cause an error.
		
		System.out.print( "How tall are you, " + name + "? ");
		height = keyboard.nextDouble();
		System.out.println( "At " + height + ", would you consider that tall or short?" );
		hanswer = keyboard.next();
		System.out.println( "I agree, you are " + hanswer + "." );
		
	}
}
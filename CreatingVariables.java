public class CreatingVariables
{
	public static void main( String[] args )
	{
		int x, y, age, z;
		double seconds, e, checking, savings;
		String firstName, lastName, title, wifeName, daughterName;
		
		x = 10;
		y = 400;
		age = 39;
		z = 45;
		
		seconds = 4.71;
		e = 2.71828182845904523536;
		checking = 1.89;
		savings = 1000000.39;
		
		
		firstName = "Samuel";
		lastName = "Ryzek";
		title = "Mr.";
		wifeName = "Amber";
		daughterName = "Aliya";
		
		System.out.println( "The variable x contains " + x );
		System.out.println( "The value " + y + " is stored in the variable y." );
		System.out.println( "Variables x = " + x + ", y = " + y + ", and z = " + z + "." );
		System.out.println( "The experiment took " + seconds + " seconds." );
		System.out.println( "A favorite irrational # is Euler's number: " + e );
		System.out.println( "Hopefully you have more than $" + checking + "!" );
		System.out.println( "If you only have $" + checking + ", hopefully your savings looks like $" + savings );
		System.out.println( "My name is " + title + " " + firstName + " " + lastName );
		System.out.println( "The names of the people in my family are " + firstName + " " + lastName + ", " + wifeName + " " + lastName + ", and " + daughterName + " " + lastName );
	}
}
		
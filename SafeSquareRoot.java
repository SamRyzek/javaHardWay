import java.util.Scanner;

public class SafeSquareRoot
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		double x, y;
		String ready;
		
		System.out.print( "Are you ready?" );
		ready = keyboard.next();
		
		while ( ! ready.equals("Yes") )
		{
			System.out.println( "Ok, let me know when you are ready! " );
			System.out.print( "Are you ready? " );
			ready = keyboard.next();
		}
		
		System.out.print( "Give me a number, and I'll find the square root. ");
		System.out.print( "(No negative numbers, please.)" );
		x = keyboard.nextDouble();
		
		while ( x < 0 )
		{
			System.out.println( "I won't take a square root of a negative." );
			System.out.print( "\nNew number: " );
			x = keyboard.nextDouble();
		}
		
		y = Math.sqrt(x);
		
		System.out.println( "The square root of " + x + " is " + y );
	}
}
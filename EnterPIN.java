import java.util.Scanner;

public class EnterPIN
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String password = "something", tpassword;
		int pin, entry;
		
		
		pin = 12345;
		
		
		System.out.println("WELCOME TO THE BANK OF JAVA." );
		System.out.print("ENTER YOUR PASSWORD: ");
		tpassword = keyboard.next();
		
		while ( ! tpassword.equals("something") )
		{
		System.out.println( "\nINCORRECT PIN. TRY AGAIN." );
		System.out.print( "ENTER YOUR PASSWORD: ");
		tpassword = keyboard.next();
		}
		System.out.println( "\nPASSWORD ACCEPTED" );
		System.out.print("ENTER YOUR PIN: " );
		entry = keyboard.nextInt();
		
		while (entry != pin)
		{
			System.out.println( "\nINCORRECT PIN. TRY AGAIN." );
			System.out.print( "ENTER YOUR PIN: ");
			entry = keyboard.nextInt();
		}
		
		System.out.println( "\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $1501.25" );
	}
}
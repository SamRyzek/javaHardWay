public class ThereAndBackAgain
{
	public static void main ( String[] args )
	{
		System.out.println( "Here." );
		erebor(); // removing () causes compiler error -- not a statement
		System.out.println( "Back first time. " );
		//erebor(); //I was correct, the There is left out between Back first time and Back second time
		System.out.println( "Back second time. " );
	}
	
	public static void erebor() 
	{
		System.out.println( "There." );
	}
}
public class EscapeSequencesComments
{
	public static void main( String[] args)
	{
		//This excersise demonstrates escape sequences & comments (like these)!
		System.out.println( "Learn\tJava\n     the\nHard\tWay\n\n" );
		System.out.println( "\tLearn Java the \"Hard\" Way!\n" );
		//System.out.frimp( "Learn Java the Hard Way" );
		System.out.print( "Hello\n" ); //This line prints Hello.
		System.out.print( "Jello\by\n" ); //This line prints Jelly.
		/* The quick brown fox jumped over a lazy dog.
		   Quick wafting zehpyrs vex bold Jim. */
		System.out /* testing */ .println( "Hard to believe, eh?" );
		System.out.println( "Suprised? /* abcde */ Or what did you expect?" );
		System.out.println( "\\ // -=- \\ //" );
		System.out.println( "\\\\ \\\\\\ \\\\\\\\" ); //it takes 2 to make 1
		System.out.println( "I hope you understand \"escape sequences\" now.\n" );
		// and comments. :)
		// Adding "//" in the middle of println does not compile: System.out.print//ln( "\\ // -=- \\ //" );
	}
}
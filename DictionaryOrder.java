import java.util.Scanner;

public class DictionaryOrder
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		
		System.out.print( "Make up the name of a programming language!" );
		name = keyboard.nextLine();
		
		if ( name.compareToIgnoreCase("c++")  < 0 )
		//if ( name.compareTo ("c++") < 0 )
			System.out.println( name + " comes BEFORE c++" );
		if ( name.compareToIgnoreCase("c++") == 0 )
		//if ( name.compareTo ("c++") == 0 )
			System.out.println( "c++ isnt a made-up language!");
		if ( name.compareToIgnoreCase("c++")  > 0 )
		//if ( name.compareTo ("c++") > 0 )
			System.out.println( name + " comes AFTER c++" );
		
		if ( name.compareToIgnoreCase("go")  < 0 )
		//if ( name.compareTo ("go") < 0 )
			System.out.println( name + " comes BEFORE go" );
		if ( name.compareToIgnoreCase("go")  == 0 )
		//if ( name.compareTo ("go") == 0 )
			System.out.println( "go isnt a made-up language!");
		if ( name.compareToIgnoreCase("go")  > 0 )
		//if ( name.compareTo ("go") > 0 )
			System.out.println( name + " comes AFTER go" );
		
		if ( name.compareToIgnoreCase("java")  < 0 )
		//if ( name.compareTo ("java") < 0 )
			System.out.println( name + " comes BEFORE java" );
		if ( name.compareToIgnoreCase("java")  == 0 )
		//if ( name.compareTo ("java") == 0 )
			System.out.println( "java isnt a made-up language!");
		if ( name.compareToIgnoreCase("java")  > 0 )
		//if ( name.compareTo ("java") > 0 )
			System.out.println( name + " comes AFTER java" );
		
		if ( name.compareToIgnoreCase("lisp")  < 0 )
		//if ( name.compareTo ("lisp") < 0 )
			System.out.println( name + " comes BEFORE lisp" );
		if ( name.compareToIgnoreCase("lisp")  == 0 )
		//if ( name.compareTo ("lisp") == 0 )
			System.out.println( "c++ isnt a made-up language!");
		if ( name.compareToIgnoreCase("lisp")  > 0 )
		//if ( name.compareTo ("lisp") > 0 )
			System.out.println( name + " comes AFTER lisp" );
		
		if ( name.compareToIgnoreCase("python")  < 0 )
		//if ( name.compareTo ("python") < 0 )
			System.out.println( name + " comes BEFORE python" );
		if ( name.compareToIgnoreCase("python")  == 0 )
		//if ( name.compareTo ("python") == 0 )
			System.out.println( "python isnt a made-up language!");
		if ( name.compareToIgnoreCase("python")  > 0 )
		//if ( name.compareTo ("python") > 0 )
			System.out.println( name + " comes AFTER python" );
		
		if ( name.compareToIgnoreCase("ruby")  < 0 )
		//if ( name.compareTo ("ruby") < 0 )
			System.out.println( name + " comes BEFORE ruby" );
		if ( name.compareToIgnoreCase("ruby")  == 0 )
		//if ( name.compareTo ("ruby") == 0 )
			System.out.println( "ruby isnt a made-up language!");
		if ( name.compareToIgnoreCase("ruby")  > 0 )
		//if ( name.compareTo ("ruby") > 0 )
			System.out.println( name + " comes AFTER ruby" );
		
		if ( name.compareToIgnoreCase("visual basic")  < 0 )
		//if ( name.compareTo ("visual basic") < 0 )
			System.out.println( name + " comes BEFORE visual basic" );
		if ( name.compareToIgnoreCase("visual basic")  == 0 )
		//if ( name.compareTo ("visual basic") == 0 )
			System.out.println( "visual basic isnt a made-up language!");
		if ( name.compareToIgnoreCase("visual basic")  > 0 )
		//if ( name.compareTo ("visual basic") > 0 )
			System.out.println( name + " comes AFTER visual basic" );
	}
}
		
		
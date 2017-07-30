public class HeronsFormula
{
	public static void main( String[] args)
	{
		double a, g;
		String tws = "A triangle with sides.";
		
		a = triangleArea(3, 3, 3);
		System.out.println("A trianle with sides 3, 3, 3, has area " + a );
		
		a = triangleArea(3, 4, 5);
		System.out.println("A trianle with sides 3, 4, 5, has area " + a );
		g = triangleArea(7, 8, 9);
		System.out.println(tws + "7, 8, 9, has area " + g );
		
		System.out.println(tws + "5, 12, 13, has area " + triangleArea(5,12,13));
		System.out.println(tws + "10, 9, 11, has area " + triangleArea(10,9,11));
		System.out.println(tws + "8, 15, 17, has area " + triangleArea(8,15,17));
		System.out.println(tws + "9, 9, 9, has area " + triangleArea(9,9,9)); // code added as part of study drill 3
	}
		//This function computes the area of a triangle with sides a,b,c.
		
		public static double triangleArea(int a, int b, int c)
		{
			double s, A;
			
			s = (a+b+c) / 2.0;
			A = Math.sqrt(s*(s-a)*(s-b)*(s-c) );
			
			return A;
		}
}
//  1) In comparison between the example above and the without functions, the shorter example is the one using functions. 
//  2) Correcting the bug in the example with a function only takes 1 entry. To correct the example without formulas takes 6 entries.
//  3) The adding of one more test on the with function example took one line of code to add. While the example that didd't use functions would have required
//	   an additional 6 lines of code. 
import java.util.Scanner;

public class BMICategories
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		//double bmi;
		
		System.out.print( "Enter your BMI: " );
		//bmi = keyboard.nextDouble();
		
		double in, lbs, bmi, kg, m, ft, inchest;
		
		System.out.println( "Enter your height in feet, then inches.");
		System.out.print( "Enter your height in feet: ");
		ft = keyboard.nextDouble();
		System.out.print( "Your height in inches: ");
		in = keyboard.nextDouble();
		inchest = (ft*12) + in;
		m = inchest*.0254;
		
		System.out.print( "Your weight in lbs: ");
		lbs = keyboard.nextDouble();
		kg = (lbs * 453.59237)/1000;
		
		bmi = kg/(m*m);
		System.out.println( "Your BMI is " + bmi );
		System.out.print( "BMI category: " );
		if ( bmi < 15.0)
		{
			System.out.println( "very severely underweight." );
		}
		else if ( bmi <= 16.0 )
		{
			System.out.println( "severly underweight." );
		}
		else if ( bmi < 18.5 )
		{
			System.out.println( "underwight." );
		}
		//else
		//removing else statement causes readout to be confused stating BMI category: severely underweight.
		                                                                //normal weight
		else if ( bmi < 25.0 )
				
		{
			System.out.println( "normal weight." );
		}
		else if ( bmi < 30.0 )
		{
			System.out.println( "overweight." );
		}
		else if ( bmi < 35.0 )
		{
			System.out.println( "moderately obese." );
		}
		else if ( bmi < 40.0 )
		{
			System.out.println( "severely obese." );
		}
		else
		{
			System.out.println( "very severely/\"morbidly\" obese" );
		}
	}
}
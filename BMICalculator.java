import java.util.Scanner;

public class BMICalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		//double m, kg, bmi;
		
		//System.out.print( "Your height in m: ");
		//m = keyboard.nextDouble();
		
		//System.out.print( "Your weight in kg: ");
		//kg = keyboard.nextDouble();
		
		//bmi = kg/(m*m);
		
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
	}
}
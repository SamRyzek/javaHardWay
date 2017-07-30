import java.util.Scanner;

public class Triangle
{
  public static void main (String[] args)
  {
    Scanner keyboard = new Scanner(System.in);
    int a, b, c;


    System.out.println("Please enter side A: ");
    a = keyboard.nextInt();
    System.out.println("Please enter side B: ");
    b = keyboard.nextInt();
    System.out.println("Please enter side C: ");
    c = keyboard.nextInt();

    if(a == b && b == c)
    {
      System.out.println("You have selected an equilateral triangle.");
    }

    else if (a == b || b == c || c == a)
    {
      System.out.println("You have selected an isoscelese triangle.");
    }
    else if ((a*a) + (b*b) != (c*c))
    {
      System.out.println("You have selected a triangle.");
    }
    else
    {
      System.out.println("You have selected a right triangle.");
    }

    System.out.println("Thanks for playing the triangle game!!");

  }
}

package measurewithJunit;

import java.util.Scanner;

public class measure {
	private static Double p;
	private static double length = 5.0;
	private static Double width= 5.0;
	private static Double area = 10.0;
	private static Double Asqr;

	
	public static double rectangle(Double l, Double w) {
		p = ((l* 2) + (w * 2));
		return p;
	}
	
	public static  double square(double a) {
		Asqr = Math.pow(a, 2);
		return Asqr;
	}
	
	public static void main(String[] args) {
/*	
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter length of rectangle: ");
	    double length = scanner.nextDouble();
	    System.out.print("Enter width of rectangle: ");
	    double width = scanner.nextDouble();
	    System.out.print("Enter area of Tritangle: ");
	    double area = scanner.nextDouble();

	    double result = rectangle(length,width);
	    double result2 = square(area);
	    System.out.print("Perameter is rectangle is: "+result);
	    System.out.print("Area of  triangle is: "+ result2);
*/		
	}
}
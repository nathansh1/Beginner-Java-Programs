/*started- 8/7/2022 5:17pm
* finished: 8/8/2022 2:46pm
* working with static variables and methods
*/

import java.util.Scanner;
import java.io.*;
import static java.lang.Math.*; 
import static java.lang.System.out;

public class DistToLine{
	public static void main(String[] args){
	
		Scanner scr = new Scanner(System.in);
		
		out.print("Enter the A value for the line: ");
			DistanceToLine.A = scr.nextDouble();
		out.print("Enter the B value for the line: ");
			DistanceToLine.B = scr.nextDouble();
		out.print("Enter the C value for the line: ");
			DistanceToLine.C = scr.nextDouble();
		
		double x,y;
		
		out.print("Enter the x coordinate for the point: ");
			x = scr.nextDouble();
		out.print("Enter the y coordinate for the point: ");
			y = scr.nextDouble();
		
		out.println("\nDistance from the point to the line is: " + DistanceToLine.GetDist(x,y));
		
	
	}
}

class DistanceToLine{
	
	public static double A;
	public static double B;
	public static double C;
	
	public static double GetDist(double a, double b){
		
		double Dist = (abs(A*a + B*b + C))/(sqrt(pow(A,2)+pow(B,2)));
		return Dist;
		
	}
	
}
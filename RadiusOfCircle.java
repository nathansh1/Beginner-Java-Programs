/* 7/19/2022
* Scanner and input practice
*/

import java.util.Scanner;
import java.io.*;

public class RadiusOfCircle{
	public static void main(String[] args){
	
		Scanner scr = new Scanner(System.in);
		System.out.print("Area of your circle: ");
		double area = scr.nextDouble();
		
		double r = Math.sqrt(area/Math.PI);
		
		System.out.println("Radius of your circle is " + r);
	
	}
}
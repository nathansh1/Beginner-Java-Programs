/*7/19/2022
*basic switch statement
*/

import java.util.Scanner;
import java.io.*;

public class WeightOnOtherPlanets{
	public static void main(String args[]){
	
	Scanner scr = new Scanner(System.in);
	
	System.out.print("\n\tlbs or kg?\t");
		String unit = scr.next();
		
	if(unit.equals("lbs")){
	
		System.out.print("\n\tEnter your weight:\t");
			int weight = scr.nextInt();
		System.out.print("\tPick a planet:\n\t1. Voltar\n\t2. Krypton\n\t3. Fertos\n\t4. Servontos\n\n\t");
			int planet = scr.nextInt();
		
		switch(planet){
			case 1:
				double vWeight = weight*0.091;
				System.out.println("\n\tIf you weigh " + weight + "lbs on Earth, you'd weigh " + vWeight + "lbs on Voltar!\n");
				break;
			case 2:
				double kWeight = weight*0.72;
				System.out.println("\n\tIf you weigh " + weight + "lbs on Earth, you'd weigh " + kWeight + "lbs on Krypton!\n");
				break;
			case 3:
				double fWeight = weight*0.865;
				System.out.println("\n\tIf you weigh " + weight + "lbs on Earth, you'd weigh " + fWeight + "lbs on Fertos!\n");
				break;
			case 4:
				double sWeight = weight*4.612;
				System.out.println("\n\tIf you weigh " + weight + "lbs on Earth, you'd weigh " + sWeight + "lbs on Servontos!\n");
				break;
		}
	}
	else if(unit.equals("kg")){
	
		System.out.print("\n\tEnter your weight:\t");
			int weight = scr.nextInt();
		System.out.print("\tPick a planet:\n\t1. Voltar\n\t2. Krypton\n\t3. Fertos\n\t4. Servontos\n\n\t");
			int planet = scr.nextInt();
		
		switch(planet){
			case 1:
				double vWeight = weight*0.091;
				System.out.println("\n\tIf you weigh " + weight + "kg on Earth, you'd weigh " + vWeight + "kg on Voltar!\n");
				break;
			case 2:
				double kWeight = weight*0.72;
				System.out.println("\n\tIf you weigh " + weight + "kg on Earth, you'd weigh " + kWeight + "kg on Krypton!\n");
				break;
			case 3:
				double fWeight = weight*0.865;
				System.out.println("\n\tIf you weigh " + weight + "kg on Earth, you'd weigh " + fWeight + "kg on Fertos!\n");
				break;
			case 4:
				double sWeight = weight*4.612;
				System.out.println("\n\tIf you weigh " + weight + "kg on Earth, you'd weigh " + sWeight + "kg on Servontos!\n");
				break;
		}	
	}
	else
		System.out.print("\n\t invalid weight unit");
		
	
	}
}

/*7/21/2022
*more OOP
*/

public class GasMileage{
	public static void main(String args[]){
	
	Automobile myBmw = new Automobile(24);
	
	myBmw.fillUp(20);
	
	myBmw.takeTrip(100);
	
	double fuel_left = myBmw.reportFuel();
	
	System.out.println(fuel_left);
	
	}
}

class Automobile{

	double mpg;
	double gallons;
	
	public Automobile(int mpg){
	
		this.mpg = mpg;
		gallons = 0;
	
	}
	
	public void fillUp(double gallons){
	
		this.gallons+=gallons;
		
	}
	
	public void takeTrip(double miles){
	
		gallons -= miles/mpg;
	
	}
	
	public double reportFuel(){
	
		return gallons;
	
	}

}
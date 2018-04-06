//Jake Wagner
//This program calculates PI iteratively using Kashi's Method.
//
//IMPORTS:
import java.lang.Math;

public class KashiPI {

	public static void main(String[] args) {
		//variables
		int precision = 20; //number of iterations for accuracy, mess around with this for fun 
		double Cn = Math.pow(3, 0.5);
		double An;
		
		//calculate C_n
		for(int i = 0; i < precision; ++i) {
			Cn = Math.pow(2.0 + Cn, 0.5); 
		}
		
		//calculate a_n
		An = Math.pow(4.0 - Math.pow(Cn, 2), 0.5);
		
		//show PI
		System.out.println("Pi via Kashi's Method ~ " + (An * (.5 * 3.0 * Math.pow(2, precision + 1))));
		
	}

}

		

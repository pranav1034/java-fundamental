import java.util.Scanner;

public class KilometerToMiles{
	public static void main(String [] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Input the distance in km: ");
	double km=sc.nextDouble();
	double miles = km * 0.621371;
	System.out.print("The distance in miles is: "+ miles);
	 
	}
}

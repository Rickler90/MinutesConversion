import java.util.Scanner;
import java.text.DecimalFormat;	
class MinutesConversion{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#,###,##0.000");
		System.out.print("Enter a number in minute : ");
		int min = input.nextInt();
		double hours = min/60;
		double day = hours/24;

		System.out.println(min+" minutes equal "+hours+" hours and equals "+df.format(day)+"days");
		
	}
}
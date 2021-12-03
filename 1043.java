import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		if((a + b) > c && (b + c) > a && (c + a) > b){
		    double perimeter = a + b + c;
		    System.out.printf("Perimetro = %.1f\n", perimeter);
		}
		else {
		    double area = 0.5 * (a + b) * c;
		    System.out.printf("Area = %.1f\n", area);
		}
	}
}

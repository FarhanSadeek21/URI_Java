import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double temp = (b * b) - (4 * a * c);
		if(temp < 0 || a == 0){
		    System.out.println("Impossivel calcular");
		}
		else {
		    temp = Math.sqrt(temp);
		    double result1 = ((-1 * b) + temp) / (2 * a);
		    double result2 = ((-1 * b) - temp) / (2 * a);
		    System.out.printf("R1 = %.5f\n", result1);
		    System.out.printf("R2 = %.5f\n", result2);
		}
	}
}

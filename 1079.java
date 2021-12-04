import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int testCase = input.nextInt();
		for (int i = 1; i <= testCase; i += 1){
		    double one = input.nextDouble();
		    double two = input.nextDouble();
		    double three = input.nextDouble();
		    double average = (one * 2 + two * 3 + three * 5) / (2 + 3 + 5.0);
		    System.out.printf("%.1f\n", average);
		}
	}
}

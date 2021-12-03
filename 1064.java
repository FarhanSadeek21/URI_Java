import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
		double total = 0;
		int count = 0;
		for (int i = 1; i <= 6; i++){
		    double number = input.nextDouble();
		    if(number >= 0){
		        count += 1;
		        total += number;
		    }
		}
		double average = total / (double) count;
		System.out.printf("%d valores positivos\n", count);
		System.out.printf("%.1f\n", average);
	}
}

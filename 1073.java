import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int limit = input.nextInt();
		if (limit % 2 != 0)
		{
		    limit -= 1;
		}
		for (int i = 2; i <= limit; i += 2){
		    System.out.printf("%d^2 = %d\n", i, i * i);
		} 
	}
}

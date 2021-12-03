import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int testCase = input.nextInt();
		int in = 0, out = 0;
		for (int i = 1; i <= testCase; i += 1){
		    int number = input.nextInt();
		    if(number >= 10 && number <= 20){
		        in += 1;
		    }
		    else {
		        out += 1;
		    }
		}
		System.out.printf("%d in\n", in);
		System.out.printf("%d out\n", out);
	}
}

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int end = input.nextInt();
		int start = input.nextInt();
		int total = 0;
		for (int i = start + 1; i < end; i += 1){
		    if(i % 2 != 0){
		        total += i;
		    }
		}
		System.out.println(total);
	}
}

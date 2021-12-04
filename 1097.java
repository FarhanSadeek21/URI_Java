import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int start = 7;
		for (int i = 1; i <= 9; i += 2){
		    for (int j = start; j >= start - 2; j -= 1){
		        System.out.printf("I=%d J=%d\n", i, j);
		    } 
		    start += 2;
		} 
	}
}

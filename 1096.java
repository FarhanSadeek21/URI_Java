import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		for (int i = 1; i <= 9; i += 2){
		    for (int j = 7; j >= 5; j -= 1){
		        System.out.printf("I=%d J=%d\n", i, j);
		    } 
		} 
	}
}

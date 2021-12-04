import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int i = 1;
		for (int j = 60; j >= 0; j -= 5){
		    System.out.printf("I=%d J=%d\n", i, j);
		    i += 3;
		}
	}
}

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int start = input.nextInt();
		int end = input.nextInt();
		if(start >= end){
		    end += 24;
		}
		System.out.printf("O JOGO DUROU %d HORA(S)\n", end - start);
	}
}

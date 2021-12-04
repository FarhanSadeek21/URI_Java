import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int number = input.nextInt();
		for (int i = 1; i <= 10000; i += 1){
		    if(i % number == 2){
		        System.out.println(i);
		    }
		} 
	}
}

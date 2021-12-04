import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int [] numArray = new int [101];
		int max = numArray[1];
		int index = 1;
		for (int i = 1; i <= 100; i += 1){
		    int number = input.nextInt();
		    if(max < number){
		        max = number;
		        index = i;
		    }
		}
		System.out.println(max);
		System.out.println(index);
	}
}

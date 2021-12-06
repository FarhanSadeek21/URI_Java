import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
		int [] array = new int [20];
		for (int i = 0; i < 20; i += 1){
		    array[i] = input.nextInt();
		}
		for (int i = 0; i < 20; i += 1){
		    int j = 19 - i;
		    System.out.printf("N[%d] = %d\n", i, array[j]);
		}
    }
}

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    int count = 0;
	    for (int i = 1; i <= 5; i++){
	        int number = input.nextInt();
	        if(number % 2 == 0){
	            count += 1;
	        }
	    }
	    System.out.printf("%d valores pares\n", count);
    }
}

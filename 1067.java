import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    int limit = input.nextInt();
	    if (limit % 2 == 0){
	        limit -= 1;
	    }
	    for (int i = 1; i <= limit; i += 2){
	        System.out.println(i);
	    } 
    }
}

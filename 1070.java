import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    int start = input.nextInt();
	    int end;
	    if(start % 2 == 0){
	        start += 1;
	    }
	    for (int i = start; i <= start + 10; i += 2){
	        if(i % 2 != 0)
                System.out.println(i);
	    } 
    }
}

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int testCase = input.nextInt();
		for (int i = 1; i <= testCase; i += 1){
		    int number = input.nextInt();
		    if(number == 0){
		        System.out.println("NULL");
		    }
		    else if(number % 2 != 0){
		        if(number > 0){
		            System.out.println("ODD POSITIVE");
		        }
		        else {
		            System.out.println("ODD NEGATIVE");
		        }
		    }
		    else if(number % 2 == 0){
		        if(number > 0){
		            System.out.println("EVEN POSITIVE");
		        }
		        else {
		            System.out.println("EVEN NEGATIVE");
		        }
		    }
		}  
	}
}

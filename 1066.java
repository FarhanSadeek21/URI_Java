import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    int even = 0, odd = 0, positive = 0, negative = 0;
	    for (int i = 1; i <= 5; i++){
	        int number = input.nextInt();
	        if(number % 2 == 0)
	        {
	            even += 1;
	        }
	        if(number % 2 != 0){
	            odd += 1;
	        }
	        if(number > 0){
	            positive += 1;
	        }
	        if(number < 0){
	            negative += 1;
	        }
	    }
	    System.out.printf("%d valor(es) par(es)\n", even);
	    System.out.printf("%d valor(es) impar(es)\n", odd);
	    System.out.printf("%d valor(es) positivo(s)\n", positive);
	    System.out.printf("%d valor(es) negativo(s)\n", negative);
    }
}

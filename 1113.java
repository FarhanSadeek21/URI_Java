import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
		while(true){
		    int i = input.nextInt();
		    int j = input.nextInt();
		    if(i > j){
		        System.out.println("Decrescente");
		    }
		    else if(i < j){
		        System.out.println("Crescente");
            }
            else {
                break;
            }
	    }
    }
}

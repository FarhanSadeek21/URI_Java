import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    int ball = input.nextInt();
	    int branch = input.nextInt();
	    ball *= 2;
	    if(ball >= branch){
	        System.out.println("Amelia tem todas bolinhas!");
	    }
	    else {
	        int more = branch - ball;
	        more /= 2;
	        System.out.printf("Faltam %d bolinha(s)\n", more);
	    }
	}
}

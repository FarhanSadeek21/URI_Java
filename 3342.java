import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    int box = input.nextInt();
	    box = box * box;
	    int black, white;
	    if(box % 2 == 0){
	        black = box / 2;
            white = black;	    
	    }
	    else {
	        black = box / 2;
	        white = black + 1;
	    }
	    System.out.printf("%d casas brancas e %d casas pretas\n", white, black);
	}
}

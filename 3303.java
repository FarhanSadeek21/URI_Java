import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    String word = input.nextLine();
	    if(word.length() < 10){
	        System.out.println("palavrinha");
	    }
	    else {
	        System.out.println("palavrao");
	    }
	}
}

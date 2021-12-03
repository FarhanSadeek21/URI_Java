import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner input = new Scanner (System.in);
	    String number = input.nextLine();
	    if(number.contains("13")){
	        System.out.printf("%s es de Mala Suerte\n", number);
	    }
	    else {
	        System.out.printf("%s NO es de Mala Suerte\n", number);
	    }
	    /*
	    Alternative way to solve the same problem
	    
	    if(number.indexOf("13") >= 0){
	        System.out.printf("%s es de Mala Suerte", number);
	    }
	    else {
	        System.out.printf("%s NO es de Mala Suerte", number);
	    }
	    */
	}
}

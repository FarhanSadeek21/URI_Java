import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int month = input.nextInt();
		String [] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		System.out.println(months[month]);
	}
}

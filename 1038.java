import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int code = input.nextInt();
		int quantity = input.nextInt();
		double [] priceList = {4, 4.5, 5, 2, 1.5};
		double totalPrice = priceList[code - 1] * quantity;
		System.out.printf("Total: R$ %.2f\n", totalPrice);
	}
}

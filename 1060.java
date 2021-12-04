import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int count = 0;
        for (int i = 1; i <= 6; i += 1){
            double number = input.nextDouble();
            if(number > 0){
                count += 1;
            }
        }
        System.out.printf("%d valores positivos\n", count);
	}
}

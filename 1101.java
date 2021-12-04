import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sum = 0;
        while (true) {
            int a = input.nextInt();
            int b = input.nextInt();
            int max = Math.max(a, b);
            int min = Math.min(a, b);
            if(min <= 0){
                break;
            }
            for (int i = min; i <= max; i += 1){
                sum += i;
                System.out.printf("%d ", i);
            }
            System.out.printf("Sum=%d\n", sum);
            sum = 0;
        }     
	}
}

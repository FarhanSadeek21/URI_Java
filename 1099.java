import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int sum = 0;
        int testCase = input.nextInt();
        for (int i = 1; i <= testCase; i += 1){
            int a = input.nextInt();
            int b = input.nextInt();
            int min = Math.min(a, b);
            int max = Math.max(a, b);
            for(int j = min + 1; j < max; j += 1){
                if(j % 2 != 0){
                    sum += j;
                }
            }
            System.out.println(sum);
            sum = 0;
        } 
	}
}

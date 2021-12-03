import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		int [] array = {a, b, c};
		int [] arrayCopy = new int[array.length];
		arrayCopy = array;
		Arrays.sort(array);
		for (int i = 0; i < array.length; i++){
		    System.out.println(array[i]);
		}
		System.out.println();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

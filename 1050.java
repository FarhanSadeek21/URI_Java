import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int phone = input.nextInt();
		if(phone == 61) System.out.println("Brasilia");
		else if(phone == 71) System.out.println("Salvador");
		else if(phone == 11) System.out.println("Sao Paulo");
		else if(phone == 21) System.out.println("Rio de Janeiro");
		else if(phone == 32) System.out.println("Juiz de Fora");
		else if(phone == 19) System.out.println("Campinas");
		else if(phone == 27) System.out.println("Vitoria");
		else if(phone == 31) System.out.println("Belo Horizonte");
		else System.out.println("DDD nao cadastrado");
	}
}

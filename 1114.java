import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int password = 2002;
        while (true){
            int userInput = input.nextInt();
            if(userInput == password){
                System.out.println("Acesso Permitido");
                break;
            }
            else {
                System.out.println("Senha Invalida");
            }
        }
	}
}

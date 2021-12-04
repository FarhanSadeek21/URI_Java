import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double init = input.nextDouble();
        if(init <= 400){
            double fin = init * 1.15;
            double increase = fin - init;
            System.out.printf("Novo salario: %.2f\n", fin);
            System.out.printf("Reajuste ganho: %.2f\n", increase);
            System.out.println("Em percentual: 15 %");
        }
        else if(init <= 800){
            double fin = init * 1.12;
            double increase = fin - init;
            System.out.printf("Novo salario: %.2f\n", fin);
            System.out.printf("Reajuste ganho: %.2f\n", increase);
            System.out.println("Em percentual: 12 %");
        }
        else if(init <= 1200){
            double fin = init * 1.1;
            double increase = fin - init;
            System.out.printf("Novo salario: %.2f\n", fin);
            System.out.printf("Reajuste ganho: %.2f\n", increase);
            System.out.println("Em percentual: 10 %");
        }
        else if(init <= 2000){
            double fin = init * 1.07;
            double increase = fin - init;
            System.out.printf("Novo salario: %.2f\n", fin);
            System.out.printf("Reajuste ganho: %.2f\n", increase);
            System.out.println("Em percentual: 7 %");
        }
        else {
            double fin = init * 1.04;
            double increase = fin - init;
            System.out.printf("Novo salario: %.2f\n", fin);
            System.out.printf("Reajuste ganho: %.2f\n", increase);
            System.out.println("Em percentual: 4 %");
        }
	}
}

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Exercício 1
        System.out.println("Por favor informe seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Agora informe sua idade:");
        int idade = scanner.nextInt();

        System.out.println("\nNome: " + nome + "\nIdade: " + idade + "\n");

        //Exercício 2
        System.out.println("Somador de números\nDigite o primeiro número a ser somado:");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Agora digite o segundo número:");
        int segundoNumero = scanner.nextInt();

        int resultado = primeiroNumero + segundoNumero;
        System.out.println("Resultado: " + resultado + "\n");

        //Exercício 3
        Locale localeBrasil = new Locale("pt", "BR");
        System.out.println("Por favor informe seu salário:");
        double salario = scanner.nextDouble();
        System.out.printf(localeBrasil, "Salário: R$ %.2f", salario);

    }
}

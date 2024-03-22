
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tarefa 1 - Compara se A+B é menor que C
        System.out.print("Digite o valor de A: ");
        int a = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int b = scanner.nextInt();
        System.out.print("Digite o valor de C: ");
        int c = scanner.nextInt();

        if (a + b < c) {
            System.out.println("Tarefa 1: A + B é menor que C");
        } else {
            System.out.println("Tarefa 1: A + B não é menor que C");
        }

        // Tarefa 2 - Se sexo==F e for casada, solicita tempo de casada e imprime na tela
        System.out.print("Digite o nome: ");
        String nome = scanner.next();
        System.out.print("Digite o sexo (M/F): ");
        char sexo = scanner.next().charAt(0);
        System.out.print("Digite o estado civil: ");
        String estadoCivil = scanner.next();

        if (sexo == 'F' || sexo == 'f'  && estadoCivil.equalsIgnoreCase("CASADA")) {
            System.out.print("Digite o tempo de casada (anos): ");
            int tempoCasada = scanner.nextInt();
            System.out.println("Tarefa 2: A Sra. " + nome + " é casada a " + tempoCasada + " anos");
        }

        // Tarefa 3 - Informa se numero é par ou impar
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Tarefa 3: O número é par");
        } else {
            System.out.println("Tarefa 3: O número é ímpar");
        }

        // Tarefa 4 - Se A = B soma se A != B multiplica
        System.out.print("Digite o valor de A: ");
        int a4 = scanner.nextInt();
        System.out.print("Digite o valor de B: ");
        int b4 = scanner.nextInt();

        int c4;
        if (a4 == b4) {
            c4 = a4 + b4;
        } else {
            c4 = a4 * b4;
        }

        System.out.println("Tarefa 4: Resultado: " + c4);

        // Tarefa 5 Se numero > 0 calcula o dobro se numero < 0 calcula o triplo
        System.out.print("Digite um número: ");
        int numero5 = scanner.nextInt();

        if (numero5 > 0) {
            System.out.println("Tarefa 5: O dobro do número é: " + (2 * numero5));
        } else {
            System.out.println("Tarefa 5: O triplo do número é: " + (3 * numero5));
        }

        // Tarefa 6 Se numero for par soma 5, se for impar soma 8
        System.out.print("Digite um número: ");
        int numero6 = scanner.nextInt();

        int resultado6;
        if (numero6 % 2 == 0) {
            resultado6 = numero6 + 5;
        } else {
            resultado6 = numero6 + 8;
        }

        System.out.println("Tarefa 6: Resultado da operação: " + resultado6);

        // Tarefa 7 - Lê 3 numeros e os imprime em ordem decrescente
        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num2 > num3) {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        System.out.println("Tarefa 7: Números em ordem decrescente: " + num3 + ", " + num2 + ", " + num1);
    }
}

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Tarefa 1: Números Pares de 0 a 100
        System.out.println("Tarefa 1: Números pares de 0 a 100");
        for (int i = 0; i <= 100; i += 2) {
            System.out.println(i);
        }
        System.out.println();

        //Tarefa 2: Adivinhação de Número Aleatório
        System.out.println("Tarefa 2: Adivinhação de Número Aleatório");
        adivinhacaoNumeroAleatorio();
        System.out.println();

        // Tarefa 3: Tabuada de um Número Específico
        System.out.println("Tarefa 3: Tabuada de um Número Específico");
        tabuadaDeUmNumero();
        System.out.println();

        // Tarefa 4: Contagem de Pessoas com Idade Maior que 18
        System.out.println("Tarefa 4: Contagem de Pessoas com Idade Maior que 18");
        contagemPessoasIdadeMaiorQue18();
        System.out.println();

        // Tarefa 5: Números Pares até um Número Específico
        System.out.println("Tarefa 5: Números Pares até um Número Específico");
        numerosParesAteNumeroEspecifico();
    }

    private static void adivinhacaoNumeroAleatorio() {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        //System.out.println(numeroAleatorio);
        int numeroUsuario;
        do {
            System.out.print("Digite um número: ");
            numeroUsuario = scanner.nextInt();

            if (numeroUsuario > numeroAleatorio) {
                System.out.println("Numero digitado é MAIOR");
            } else if (numeroUsuario < numeroAleatorio) {
                System.out.println("Numero digitado é MENOR");
            } else {
                System.out.println("Parabéns! Você acertou!");
            }
        } while (numeroUsuario != numeroAleatorio);
    }

    private static void tabuadaDeUmNumero() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 10: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    private static void contagemPessoasIdadeMaiorQue18() {
        Scanner scanner = new Scanner(System.in);

        int totalPessoasMaiores18 = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();

            if (idade >= 18) {
                totalPessoasMaiores18++;
            }
        }

        System.out.println("Total de pessoas com idade maior que 18: " + totalPessoasMaiores18);
    }

    private static void numerosParesAteNumeroEspecifico() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Números pares até " + numero + ":");
        for (int i = 0; i <= numero; i += 2) {
            System.out.println(i);
        }
    }
}

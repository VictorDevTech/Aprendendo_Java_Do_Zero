import java.util.Scanner;

public class SistemaSimplesDeBanco {

    public static void main(String[] args) {

        double saldo = 0;
        double saque = 0;
        double deposito = 0;
        int opcao = 0;

        Scanner teclado = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println("\n======= BANCO DO MOGZADA =======");
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.println("[3] Saldo");
            System.out.println("[4] Sair");
            System.out.print("Escolha uma das opções acima: ");

            int escolha = teclado.nextInt();
            opcao = escolha;

            if (escolha == 1) {
                System.out.print("Digite o valor que deseja depositar: R$");
                deposito = teclado.nextDouble();

                if (deposito <= 0) {
                    System.out.println("Valor de depósito inválido!");
                } else {
                    saldo += deposito;
                    System.out.format("Depósito realizado com sucesso! Saldo atual: R$ %.2f\n", saldo);
                }

            } else if (escolha == 2) {
                System.out.print("Digite o valor que deseja sacar: R$");
                saque = teclado.nextDouble();

                if (saque <= 0) {
                    System.out.println("O valor de saque é inválido!");
                } else if (saque > saldo) {
                    System.out.println("Saque maior do que o saldo!");
                } else {
                    saldo -= saque;
                    System.out.println("Saque realizado com sucesso!");
                    System.out.format("Saldo atual: R$ %.2f\n", saldo);
                }

            } else if (escolha == 3) {
                System.out.format("O saldo da sua conta atual: R$ %.2f\n", saldo);

            } else if (escolha == 4) {
                System.out.println("O aplicativo será fechado!");

            } else {
                System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}
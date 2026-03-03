// Importa a classe Scanner, responsável por ler dados digitados pelo usuário
import java.util.Scanner;

public class SistemaSimplesDeBanco {

    public static void main(String[] args) {

        // Variável que guarda o saldo atual da conta
        double saldo = 0.0;

        // Variável que armazenará o valor digitado para saque
        double saque = 0.0;

        // Variável que armazenará o valor digitado para depósito
        double deposito = 0.0;

        // Variável que controla a opção escolhida no menu
        int opcao = 0;

        // Cria o objeto Scanner para ler dados do teclado
        Scanner teclado = new Scanner(System.in);

        // Estrutura de repetição:
        // Enquanto a opção for diferente de 4 (Sair), o sistema continuará executando
        while (opcao != 4) {

            // Exibe o menu principal
            System.out.println("\n======= BANCO DO MOGZADA =======");
            System.out.println("[1] Depositar");
            System.out.println("[2] Sacar");
            System.out.println("[3] Saldo");
            System.out.println("[4] Sair");
            System.out.print("Escolha uma das opções acima: ");

            // Lê a opção escolhida pelo usuário
            int escolha = teclado.nextInt();

            // Atualiza a variável de controle do laço
            opcao = escolha;

            // Se a opção escolhida for 1 (Depósito)
            if (escolha == 1) {

                // Solicita o valor do depósito
                System.out.print("Digite o valor que deseja depositar: R$");

                // Lê o valor digitado
                deposito = teclado.nextDouble();

                // Verifica se o valor é válido (maior que zero)
                if (deposito <= 0) {

                    // Caso o valor seja inválido
                    System.out.println("Valor de depósito inválido!");

                } else {

                    // Soma o valor depositado ao saldo
                    saldo += deposito;

                    // Mostra o saldo atualizado
                    System.out.format("Depósito realizado com sucesso! Saldo atual: R$ %.2f\n", saldo);
                }

                // Se a opção escolhida for 2 (Saque)
            } else if (escolha == 2) {

                // Solicita o valor do saque
                System.out.print("Digite o valor que deseja sacar: R$");

                // Lê o valor digitado
                saque = teclado.nextDouble();

                // Verifica se o valor é válido
                if (saque <= 0) {

                    System.out.println("O valor de saque é inválido!");

                    // Verifica se há saldo suficiente
                } else if (saque > saldo) {

                    System.out.println("Saque maior do que o saldo!");

                } else {

                    // Subtrai o valor do saldo
                    saldo -= saque;

                    System.out.println("Saque realizado com sucesso!");

                    // Mostra o saldo atualizado
                    System.out.format("Saldo atual: R$ %.2f\n", saldo);
                }

                // Se a opção escolhida for 3 (Consultar saldo)
            } else if (escolha == 3) {

                // Exibe o saldo atual da conta
                System.out.format("O saldo da sua conta atual é de: R$ %.2f\n", saldo);

                // Se a opção escolhida for 4 (Sair do sistema)
            } else if (escolha == 4) {

                System.out.println("O aplicativo será fechado!");

                // Caso o usuário digite qualquer número diferente das opções válidas
            } else {

                System.out.println("Opção inválida, tente novamente!");
            }
        }
    }
}
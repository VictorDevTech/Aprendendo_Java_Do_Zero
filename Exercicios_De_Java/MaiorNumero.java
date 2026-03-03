// Importa a classe Scanner para permitir a leitura de dados pelo teclado
import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args){

        // Cria um objeto Scanner para capturar dados digitados pelo usuário
        Scanner teclado = new Scanner(System.in);

        // Solicita o primeiro número
        System.out.print("Digite o primeiro número: ");

        // Lê o valor digitado e armazena na variável primeiroNumero
        float primeiroNumero = teclado.nextFloat();

        // Solicita o segundo número
        System.out.print("Digite o segundo número: ");

        // Lê o valor digitado e armazena na variável segundoNumero
        float segundoNumero = teclado.nextFloat();

        // Solicita o terceiro número
        System.out.print("Digite o terceiro número: ");

        // Lê o valor digitado e armazena na variável terceiroNumero
        float terceiroNumero = teclado.nextFloat();

        // Declara a variável que armazenará o maior número
        float maiorNumero;

        // Verifica se o primeiro número é maior que o segundo E maior que o terceiro
        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {

            // Se for, ele é o maior
            maiorNumero = primeiroNumero;

            // Caso contrário, verifica se o segundo número é maior que o terceiro
        } else if (segundoNumero > terceiroNumero) {

            // Se for, ele é o maior
            maiorNumero = segundoNumero;

        } else {

            // Se nenhuma das condições anteriores for verdadeira,
            // o terceiro número é o maior
            maiorNumero = terceiroNumero;
        }

        // Exibe o maior número encontrado
        System.out.println("O maior número é o: " + maiorNumero);

    }
}
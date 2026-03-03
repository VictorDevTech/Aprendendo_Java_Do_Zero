// Importa a classe Scanner, que permite ler dados digitados pelo usuário
import java.util.Scanner;

public class numeroPositivoOuNegativoOuZero {

    public static void main(String[] args){

        // Cria um objeto Scanner para capturar dados do teclado
        Scanner teclado = new Scanner(System.in);

        // Solicita que o usuário digite um número inteiro
        System.out.print("Digite um número inteiro: ");

        // Lê o número digitado e armazena na variável numero
        int numero = teclado.nextInt();

        // Verifica se o número é maior que zero
        if (numero > 0){

            // Se for maior que zero, é positivo
            System.out.println("Número Positivo");

            // Estrutura de repetição que vai de 1 até 10
            // Usada para mostrar a tabuada do número digitado
            for (int i = 1; i <= 10; i++){

                // Calcula o resultado da multiplicação
                int resultado = numero * i;

                // Exibe a operação e o resultado formatado
                System.out.printf("%d x %d = %d\n", numero, i , resultado);
            }

            // Verifica se o número é menor que zero
        } else if (numero < 0){

            // Se for menor que zero, é negativo
            System.out.println("Número Negativo");

            // Variável para armazenar a soma
            int soma = 0;

            // Estrutura de repetição que começa em 1
            // e vai diminuindo até chegar ao número negativo digitado
            for (int i = 1; i >= numero; i--) {

                // Soma o valor atual de i à variável soma
                soma += i;
            }

            // Exibe o resultado final da soma
            System.out.println("Soma total: " + soma);

        } else {

            // Caso o número seja exatamente zero
            System.out.println("Número Zero");
        }

    }
}
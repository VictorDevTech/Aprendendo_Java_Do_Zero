import java.util.Scanner;

public class MaiorNumero {

    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        float primeiroNumero = teclado.nextFloat();

        System.out.print("Digite o segundo número: ");
        float segundoNumero = teclado.nextFloat();

        System.out.print("Digite o terceiro número: ");
        float terceiroNumero = teclado.nextFloat();

        float maiorNumero;

        if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
            maiorNumero = primeiroNumero;

        } else if (segundoNumero > terceiroNumero) {
            maiorNumero = segundoNumero;

        } else {
            maiorNumero = terceiroNumero;
        }

        System.out.println("O maior número é o: " + maiorNumero);


    }
}

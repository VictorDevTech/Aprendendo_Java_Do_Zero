import java.util.Scanner;

public class Media_Das_Notas_Dos_Aluno {

    public static void main(String[] args){

        // Cria um objeto Scanner para ler dados digitados pelo usuário no teclado
        Scanner teclado = new Scanner(System.in);

        // Solicita que o usuário digite o nome do aluno
        System.out.print("Digite o nome do aluno: ");

        // Lê o nome completo digitado (incluindo espaços) e armazena na variável nomeAluno
        String nomeAluno = teclado.nextLine();

        // Solicita a primeira nota
        System.out.print("Digite a primeira nota: ");

        // Lê a primeira nota digitada e armazena na variável primeiraNota
        float primeiraNota = teclado.nextFloat();

        // Solicita a segunda nota
        System.out.print("Digite a segunda nota: ");

        // Lê a segunda nota digitada e armazena na variável segundaNota
        float segundaNota = teclado.nextFloat();

        // Solicita a terceira nota
        System.out.print("Digite a terceira nota: ");

        // Lê a terceira nota digitada e armazena na variável terceiraNota
        float terceiraNota = teclado.nextFloat();

        // Solicita a quarta nota
        System.out.print("Digite a quarta nota: ");

        // Lê a quarta nota digitada e armazena na variável quartaNota
        float quartaNota = teclado.nextFloat();

        // Calcula a média das quatro notas
        // Soma todas as notas e divide por 4
        double media = (primeiraNota + segundaNota + terceiraNota + quartaNota) / 4;

        // Verifica se a média é maior ou igual a 60
        if (media >= 60){

            // Se for maior ou igual a 60, o aluno está aprovado
            // %.2f formata a média com duas casas decimais
            System.out.format("O aluno %s foi APROVADO com média %.2f", nomeAluno, media);

        } else {

            // Caso contrário, o aluno está reprovado
            System.out.format("O aluno %s foi REPROVADO com média %.2f", nomeAluno, media);
        }

    }
}

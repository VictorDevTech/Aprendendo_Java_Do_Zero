import javax.swing.*;

public class CalcuroDaMediaDasNotas {

    public static void main(String[] args) {

        int opcao = 0;

        while (opcao == 0) {

            String nomeAluno;

            double nota1Bimestre, nota2Bimestre, nota3Bimestre, nota4Bimestre;
            double totalNotas, mediaNotas;

            nomeAluno = JOptionPane.showInputDialog(null, "Digite o nome do aluno: ");

            nota1Bimestre = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Digite a nota do 1° Bimestre: "));
            nota2Bimestre = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Digite a nota do 2° Bimestre: "));
            nota3Bimestre = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Digite a nota do 3° Bimestre: "));
            nota4Bimestre = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Digite a nota do 4° Bimestre: "));

            totalNotas = nota1Bimestre + nota2Bimestre + nota3Bimestre + nota4Bimestre;

            mediaNotas = totalNotas / 4;

            if (totalNotas >= 60) {

                JOptionPane.showMessageDialog(null,
                        "Resultado Final\n" +
                                "-------------------------\n" +
                                "Aluno: " + nomeAluno +
                                "\nTotal das Notas: " + totalNotas +
                                "\nMédia das Notas: " + mediaNotas +
                                "\n\nSituação: APROVADO!");
            } else {

                JOptionPane.showMessageDialog(null,
                        "Resultado Final\n" +
                                "-------------------------\n" +
                                "Aluno: " + nomeAluno +
                                "\nTotal das Notas: " + totalNotas +
                                "\nMédia das Notas: " + mediaNotas +
                                "\n\nSituação: REPROVADO!");
            }

            opcao = JOptionPane.showConfirmDialog(null,
                    "Deseja colocar dados de outro aluno?",
                        "Continuar", JOptionPane.YES_NO_OPTION);
        }
    }
}
import javax.swing.JOptionPane;

public class TransformaIdadeEmDias {

    public static void main(String[] args){
        
        String nome;

        int anoDeNascimento;

        nome = JOptionPane.showInputDialog(null, "Digite seu nome: ");

        anoDeNascimento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano do seu nascimento: "));

        int ano = 2026;

        int idade = ano - anoDeNascimento;

        int idadeEmDIas = idade * 365;

        if (idade >= 18){

            JOptionPane.showMessageDialog(null, "Nome: " + nome +
                    "\nTem " + idade + " Anos" +
                    "\nIdade em dias: " + idadeEmDIas + " Dias");

        } else {
            JOptionPane.showMessageDialog(null, "Nome: " + nome +
                    "\nTem " + idade + " Anos" +
                    "\nIdade em dias: " + idadeEmDIas + " Dias");
        }
    }
}

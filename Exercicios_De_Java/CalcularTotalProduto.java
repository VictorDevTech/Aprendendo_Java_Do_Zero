import javax.swing.*;

public class CalcularTotalProduto {

    public static void main(String[] args){

        String nomeProduto;

        double valorProduto, totalProduto;

        int quantidadeProduto;

        // Entrada
        // Para digitar este linha automaticamente digita shoi e ctrl + espaço
        nomeProduto = JOptionPane.showInputDialog(null,"\nDigite o nome do produto: ");

        valorProduto = Double.parseDouble(
                JOptionPane.showInputDialog(null,"\nDigite o valor do produto: R$"));

        quantidadeProduto = Integer.parseInt(
                JOptionPane.showInputDialog(null,"\nDigite a quantidade de produto: "));

        totalProduto = valorProduto * quantidadeProduto;


        JOptionPane.showMessageDialog(null,
                "Nome do produto: "+ nomeProduto +
                "\nValor do produto R$"+ valorProduto +
                "\nQuantidade de produto: "+ quantidadeProduto +
                "\nValor total dos produtos R$" + totalProduto);
    }
}

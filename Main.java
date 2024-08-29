// Main.java
public class Main {
    public static void main(String[] args) {
        Item itemProduto = new Item("produto", 100.0);
        Item itemServico = new Item("serviço", 100.0);

        System.out.println("Operação Comercial para produto:");
        OperacaoComercial operacaoProduto = new OperacaoComercial(itemProduto);
        operacaoProduto.calcularTotal();

        System.out.println("\nOperação Comercial para Serviço:");
        OperacaoComercial operacaoServico = new OperacaoComercial(itemServico);
        operacaoServico.calcularTotal();
    }
}


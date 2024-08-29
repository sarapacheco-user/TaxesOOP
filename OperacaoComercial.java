// OperacaoComercial.java
public class OperacaoComercial {
    private Item item;
    private ISS iss = new ISS();
    private ICMS icms = new ICMS();
    private IPI ipi = new IPI();

    public OperacaoComercial(Item item) {
        this.item = item;
    }

    public void calcularTotal() {
        double custoItem = item.getCusto();
        double valorISS = 0;
        double valorIPI = 0;

        if (item.getTipo().equals("serviço")) {
            valorISS = iss.calcular(custoItem);
        } else if (item.getTipo().equals("produto")) {
            valorIPI = ipi.calcular(custoItem);
        }

        double valorICMS = icms.calcular(custoItem);
        double valorTotal = custoItem + valorISS + valorIPI + valorICMS;

        System.out.println("Custo do Item: R$ " + custoItem);
        System.out.println("ISS: R$ " + valorISS);
        System.out.println("IPI: R$ " + valorIPI);
        System.out.println("ICMS: R$ " + valorICMS);
        System.out.println("Valor Total: R$ " + valorTotal);
    }
}

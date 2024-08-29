// Item.java
public class Item {
    private String tipo; // "produto" ou "serviço"
    private double custo;

    public Item(String tipo, double custo) {
        this.tipo = tipo;
        this.custo = custo;
    }

    public String getTipo() {
        return tipo;
    }

    public double getCusto() {
        return custo;
    }
}

// Imposto.java
// Imposto.java
public class Imposto {
    private double aliquota;

    public Imposto(double aliquota) {
        this.aliquota = aliquota;
    }

    public double calcular(double valor) {
        return valor * aliquota / 100;
    }
}

// ICMS.java
public class ICMS {
    private final double aliquota = 13.2;

    public double calcular(double valor) {
        return valor * aliquota / 100;
    }
}


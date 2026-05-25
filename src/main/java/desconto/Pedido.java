package desconto;

public class Pedido {
    private double valorTotalBruto;

    public Pedido(double valorTotalBruto) {
        this.valorTotalBruto = valorTotalBruto;
    }

    public double getValorTotalBruto() {
        return valorTotalBruto;
    }
}
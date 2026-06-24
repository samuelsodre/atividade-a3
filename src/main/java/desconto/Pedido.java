package desconto;

public class Pedido {
    private final double valorTotalBruto;

    public Pedido(double valorTotalBruto) {
        if (valorTotalBruto < 0) {
            throw new IllegalArgumentException("Valor do pedido não pode ser negativo");
        }
        this.valorTotalBruto = valorTotalBruto;
    }

    public double getValorTotalBruto() {
        return valorTotalBruto;
    }

    @Override
    public String toString() {
        return String.format("Pedido{valor=%.2f}", valorTotalBruto);
    }
}
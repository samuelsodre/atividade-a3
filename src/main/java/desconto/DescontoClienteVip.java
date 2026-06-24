package desconto;

public class DescontoClienteVip implements CalculadoraDesconto {
    private static final double PERCENTUAL_DESCONTO = 0.15;

    @Override
    public double calcular(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("Pedido não pode ser nulo");
        }
        return pedido.getValorTotalBruto() * PERCENTUAL_DESCONTO;
    }
}
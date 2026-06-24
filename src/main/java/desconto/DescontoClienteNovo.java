package desconto;

public class DescontoClienteNovo implements CalculadoraDesconto {
    private static final double PERCENTUAL_DESCONTO = 0.05;

    @Override
    public double calcular(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("Pedido não pode ser nulo");
        }
        return pedido.getValorTotalBruto() * PERCENTUAL_DESCONTO;
    }
}
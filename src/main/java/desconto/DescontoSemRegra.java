package desconto;

public class DescontoSemRegra implements CalculadoraDesconto {
    private static final double PERCENTUAL_DESCONTO = 0.0;

    @Override
    public double calcular(Pedido pedido) {
        if (pedido == null) {
            throw new IllegalArgumentException("Pedido não pode ser nulo");
        }
        return PERCENTUAL_DESCONTO;
    }
}
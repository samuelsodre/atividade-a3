package desconto;

public class DescontoSemRegra implements CalculadoraDesconto {
    @Override
    public double calcular(Pedido pedido) {
        return 0.0;
    }
}
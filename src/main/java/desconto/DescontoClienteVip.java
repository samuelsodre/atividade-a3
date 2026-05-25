package desconto;

public class DescontoClienteVip implements CalculadoraDesconto {
    @Override
    public double calcular(Pedido pedido) {

        return pedido.getValorTotalBruto() * 0.15;
    }
}
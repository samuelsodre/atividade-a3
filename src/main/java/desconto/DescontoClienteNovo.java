package desconto;

public class DescontoClienteNovo implements CalculadoraDesconto {
    @Override
    public double calcular(Pedido pedido) {

        return pedido.getValorTotalBruto() * 0.05;
    }
}
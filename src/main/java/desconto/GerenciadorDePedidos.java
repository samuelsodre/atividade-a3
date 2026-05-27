package desconto;

public class GerenciadorDePedidos {

    public double fecharPedido(Pedido pedido, CalculadoraDesconto estrategiaDesconto) {
        double desconto = estrategiaDesconto.calcular(pedido);
        double valorFinal = pedido.getValorTotalBruto() - desconto;


        return Math.max(0.0, valorFinal);
    }
}

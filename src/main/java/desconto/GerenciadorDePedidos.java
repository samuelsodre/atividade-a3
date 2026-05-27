package desconto;

public class GerenciadorDePedidos {

    public double fecharPedido(Pedido pedido, CalculadoraDesconto estrategiaDesconto) {
        double desconto = estrategiaDesconto.calcular(pedido);
        double valorFinal = pedido.getValorTotalBruto() - desconto;

        // Garante que o valor final não seja negativo por erro de cálculo
        return Math.max(0.0, valorFinal);
    }
}

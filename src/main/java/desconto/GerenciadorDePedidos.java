package desconto;

public class GerenciadorDePedidos {

    public double fecharPedido(Pedido pedido, CalculadoraDesconto estrategiaDesconto) {
        if (pedido == null) {
            throw new IllegalArgumentException("Pedido não pode ser nulo");
        }
        if (estrategiaDesconto == null) {
            throw new IllegalArgumentException("Estratégia de desconto não pode ser nula");
        }

        double desconto = estrategiaDesconto.calcular(pedido);
        double valorFinal = pedido.getValorTotalBruto() - desconto;

        return Math.max(0.0, valorFinal);
    }
}

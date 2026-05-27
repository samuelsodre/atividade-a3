import desconto.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class GerenciadorDePedidosTest {

    @Test
    public void deveAplicarQuinzePorCentoParaClienteVip() {
        GerenciadorDePedidos gerenciador = new GerenciadorDePedidos();
        Pedido pedido = new Pedido(100.0); // Valor bruto: R$ 100
        CalculadoraDesconto descontoVip = new DescontoClienteVip();

        double valorFinal = gerenciador.fecharPedido(pedido, descontoVip);

        // 100.0 - 15% = 85.0
        assertEquals(85.0, valorFinal, 0.001);
    }

    @Test
    public void deveAplicarCincoPorCentoParaClienteNovo() {
        GerenciadorDePedidos gerenciador = new GerenciadorDePedidos();
        Pedido pedido = new Pedido(100.0);
        CalculadoraDesconto descontoNovo = new DescontoClienteNovo();

        double valorFinal = gerenciador.fecharPedido(pedido, descontoNovo);

        // 100.0 - 5% = 95.0
        assertEquals(95.0, valorFinal, 0.001);
    }

    @Test
    public void naoDeveAplicarDescontoParaClienteComum() {
        GerenciadorDePedidos gerenciador = new GerenciadorDePedidos();
        Pedido pedido = new Pedido(100.0);
        CalculadoraDesconto semDesconto = new DescontoSemRegra();

        double valorFinal = gerenciador.fecharPedido(pedido, semDesconto);

        // Valor cheio: 100.0
        assertEquals(100.0, valorFinal, 0.001);
    }
}
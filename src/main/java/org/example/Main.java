package org.example;

import desconto.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Desconto de Pedidos ===");
        System.out.println();

        GerenciadorDePedidos gerenciador = new GerenciadorDePedidos();

        System.out.println("1. Cliente Novo (5% de desconto):");
        Pedido pedido1 = new Pedido(100.0);
        double valorFinal1 = gerenciador.fecharPedido(pedido1, new DescontoClienteNovo());
        exibirResultado(pedido1, "Cliente Novo", valorFinal1);

        System.out.println("\n2. Cliente VIP (15% de desconto):");
        Pedido pedido2 = new Pedido(250.0);
        double valorFinal2 = gerenciador.fecharPedido(pedido2, new DescontoClienteVip());
        exibirResultado(pedido2, "Cliente VIP", valorFinal2);

        System.out.println("\n3. Cliente Regular (0% de desconto):");
        Pedido pedido3 = new Pedido(150.0);
        double valorFinal3 = gerenciador.fecharPedido(pedido3, new DescontoSemRegra());
        exibirResultado(pedido3, "Cliente Regular", valorFinal3);

        System.out.println("\n4. Pedido Grande - Cliente VIP (15% de desconto):");
        Pedido pedido4 = new Pedido(1000.0);
        double valorFinal4 = gerenciador.fecharPedido(pedido4, new DescontoClienteVip());
        exibirResultado(pedido4, "Cliente VIP", valorFinal4);
    }

    private static void exibirResultado(Pedido pedido, String tipoCliente, double valorFinal) {
        double valorBruto = pedido.getValorTotalBruto();
        double desconto = valorBruto - valorFinal;
        double percentualDesconto = (desconto / valorBruto) * 100;

        System.out.printf("   Tipo de Cliente: %s%n", tipoCliente);
        System.out.printf("   Valor Bruto: R$ %.2f%n", valorBruto);
        System.out.printf("   Desconto: R$ %.2f (%.1f%%)%n", desconto, percentualDesconto);
        System.out.printf("   Valor Final: R$ %.2f%n", valorFinal);
    }
}}
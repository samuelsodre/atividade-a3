# 📑 Documentação do Projeto: Motor de Descontos e-Commerce
# 1- Definição do Problema
Contexto e Problema Identificado: Pequenos comércios eletrônicos e lojas locais que começam a se digitalizar costumam realizar o cálculo de descontos de forma totalmente manual ou com regras rígidas no código. Quando a gerência decide criar uma nova política de fidelidade (ex: desconto para novos clientes, cupons sazonais ou clientes VIP), o processo exige a alteração de lógicas complexas e repetitivas (if/else) espalhadas pelo sistema, gerando erros de cálculo e lentidão para lançar promoções.

Usuários Envolvidos: Gestor da loja (que define as regras) e o Sistema de Checkout (que processa a venda).

Dificuldades Atuais: Falta de flexibilidade para aplicar novas promoções e alto risco de quebrar o sistema a cada nova regra de desconto implementada.

Como a solução proposta melhora o processo: A solução isola o cálculo de cada tipo de desconto em componentes independentes. Isso permite que a loja crie ou altere regras de desconto instantaneamente, sem risco de afetar as regras que já estão funcionando.

# 2- Levantamento e Análise de Requisitos (Abordagem Ágil)
Atores:
Sistema de Checkout: Responsável por processar a compra e solicitar o valor final.

Gestor da Loja: Responsável por definir qual perfil de desconto deve ser aplicado à venda.

Backlog de Funcionalidades (User Stories):
História de Usuário 01 (US01) - Aplicação de Desconto por Perfil
Como sistema de checkout,

Eu quero aplicar um desconto automático no valor total do pedido baseado no perfil do cliente,

Para que o valor final cobrado esteja correto de acordo com a política de fidelidade da empresa.

Critérios de Aceitação:

Se o cliente for perfil VIP, deve ser aplicado um desconto de 15% sobre o valor bruto do pedido.

Se o cliente for perfil Novo, deve ser aplicado um desconto de 5% sobre o valor bruto do pedido.
Se o cliente for um perfil Comum (sem desconto ativo), o sistema deve retornar o valor bruto, sem alterações.

O cálculo não deve permitir que o valor do desconto seja negativo.

# Instruções de Execução e Instalação
Este documento descreve os pré-requisitos, a estrutura de arquivos e os procedimentos passo a passo para configurar, compilar e executar a aplicação back-end desenvolvida em Java, além de rodar os testes unitários obrigatórios.

# 1. Pré-requisitos do Sistema
Antes de iniciar a execução, certifique-se de possuir as seguintes ferramentas instaladas em sua máquina:

Java Development Kit (JDK): Versão 11 ou superior instalada e configurada nas variáveis de ambiente (JAVA_HOME).

Ambiente de Desenvolvimento (IDE): IntelliJ IDEA (recomendado), Eclipse ou Visual Studio Code.

Gerenciador de Dependências (Opcional): Para este guia rápido, o projeto pode ser executado de forma nativa ou via IDE sem dependências externas complexas além do JUnit.

# 2. Estrutura do Diretório do Projeto
Para garantir que o compilador e o motor de testes localizem os arquivos corretamente, a estrutura do código-fonte dentro do diretório src deve seguir exatamente esta organização de pacotes:

meu-projeto-descontos/
└── src/
    └── desconto/
        ├── Pedido.java
        ├── CalculadoraDesconto.java
        ├── DescontoClienteVip.java
        ├── DescontoClienteNovo.java
        ├── DescontoSemRegra.java
        ├── GerenciadorDePedidos.java
        └── GerenciadorDePedidosTest.java


# 3. Execução via IDE (IntelliJ IDEA / Eclipse)
A forma mais rápida e prática de rodar a aplicação e validar os critérios do enunciado é utilizando uma IDE de mercado:

Abra a sua IDE de preferência e selecione a opção Open ou Import Project.

Navegue até a pasta raiz do projeto onde os arquivos descritos acima foram salvos.

Aguarde a IDE indexar os arquivos e validar a estrutura do pacote package desconto;.

Caso a IDE aponte falta das anotações de teste, clique sobre a palavra-chave @Test com o botão direito e selecione a opção "Add JUnit5 (ou JUnit4) to classpath" para resolver a dependência automaticamente.

# 4. Como Executar os Testes Unitários
Como a solução proposta foca estritamente no motor de regras de negócio de maneira isolada (Back-end enxuto), a validação de funcionamento se dá através da execução da suite de testes contida em GerenciadorDePedidosTest.java.

Executando na IDE:
Abra o arquivo GerenciadorDePedidosTest.java.

Clique no ícone de seta verde (Run) localizado ao lado esquerdo da assinatura da classe ou use o atalho padrão da IDE (ex: Ctrl + Shift + F10 no IntelliJ).

O painel Run / Test Results será aberto na parte inferior mostrando que os 3 testes passaram com sucesso (check verde).

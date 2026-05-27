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

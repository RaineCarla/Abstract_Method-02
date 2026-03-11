Abstract Factory - Sistema de E-commerce

Projeto desenvolvido para estudo de Padrões de Projeto, com foco na implementação do padrão Abstract Factory em Java.

📌 Objetivo:
Simular o núcleo de um sistema de loja virtual (e-commerce) que precisa trabalhar com diferentes fornecedores de serviços externos.
Em sistemas reais, ao trocar um fornecedor normalmente trocamos um conjunto completo de serviços, como:

-Pagamento (gateway de pagamento)
-Frete / envio (transportadora)
-Emissão de nota fiscal
Cada fornecedor possui regras e implementações diferentes.

O padrão Abstract Factory permite criar famílias de objetos relacionados sem que o sistema principal precise conhecer as classes concretas.

🧠 Padrão Utilizado:

Abstract Factory (Padrão Criacional)
Esse padrão permite criar objetos relacionados sem depender diretamente das classes concretas, promovendo:
-baixo acoplamento
-facilidade de manutenção
-facilidade para adicionar novos fornecedores

🏗 Estrutura do Projeto:
O projeto foi dividido em pacotes para organizar melhor as responsabilidades.

Fabrica
 ├─ FornecedorFactory
 ├─ FornecedorNacionalFactory
 └─ FornecedorInternacionalFactory

Interfaces
 ├─ Pagamento
 ├─ Frete
 └─ NotaFiscal

Nacional
 ├─ PagamentoNacional
 ├─ FreteNacional
 └─ NotaFiscalNacional

Internacional
 ├─ PagamentoInternacional
 ├─ FreteInternacional
 └─ NotaFiscalInternacional

Service
 └─ CheckoutService

Main
 └─ Classe de execução do sistema
 
⚙️ Funcionamento:

O sistema permite escolher um fornecedor de serviços e automaticamente utilizar a família de objetos correspondente.

Fornecedor Nacional
PagamentoNacional
FreteNacional
NotaFiscalNacional
Fornecedor Internacional
PagamentoInternacional
FreteInternacional
NotaFiscalInternacional

Exemplo de Saída:
Fornecedor Nacional
== FORNECEDOR NACIONAL ==
== CHECKOUT pedido PED-10 ==
Frete calculado: 21.0
Total: 120.0
[NACIONAL] Pagamento aprovado
NF gerada: NF-NAC-PED-10
Compra finalizada!

Fornecedor Internacional
== FORNECEDOR INTERNACIONAL ==
== CHECKOUT pedido PED-10 ==
Frete calculado: 55.0
Total: 154.0
[INTERNACIONAL] Pagamento aprovado com taxa
NF gerada: NF-INT-PED-10
Compra finalizada!


🚀 Tecnologias Utilizadas:
Java
Programação Orientada a Objetos
Design Patterns

🎓 Contexto Acadêmico:

Este projeto foi desenvolvido como atividade prática da disciplina de Padrões de Projeto, com o objetivo de aplicar na prática o padrão Abstract Factory.

👩‍💻 Autor:

Projeto desenvolvido por Carla para fins de estudo e aprendizado em Programação Orientada a Objetos.

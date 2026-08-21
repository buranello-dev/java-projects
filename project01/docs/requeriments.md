# Planejamento:

## Levantando os requisitos

Sistema de Controle financeiro (Gastos mensais).

Objetivo: desenvolver um sistema que faca o controle de gastos no mes, entrada (dinheiro que cada conta recebe), saida (despesa que cada conta gasta) e saldo atual, o responsavel da conta precisa saber o quanto ENTROU de dinheiro, o quanto ele GASTOU de dinheiro e quanto SOBROU de saldo disponivel para ele (se o saldo der negativo ele gastou mais do que entrou);

> Usuarios do sistema:

    - Ainda nao vejo necessidade, mas seria quem abre a conta no sistema e quem quer fazer o controle, ou seja, cliente.

> Problemas identificados?

    - Todas as contas estao em uma mesma tabela de entrada, gastos e etc;
    - Controle manual desgastante, leva muito tempo para fazer todas as operacoes da forma que esta;
    - Dificuldade para acompanhar o quanto estou gastando em cada conta;
    - Informacoes misturadas em cartoes, despesas fixas e etcs;
    - Muita dor de cabeca e risco de fazer as contas erradas;

> O que o software precisa fazer?

    - Requisitos Funcionais;
    - Requistos NAO Funcionais;


## Requisitos Funcionais:

<!-- Feats (funcionalidades)--->

- RF01 - O sistema precisa registrar saidas:

    - O sistema precisa registrar todos os gastos do usuario;

    > RF01 - Registrar Saida (FEAT):

        em algum momento sera necessario informar a conta, para que fique armazenado na conta correta.
        o usuario precisa informar o valor da compra (saida) para que seja armazenado e somado com todas as outras;
        a funcao precisa aumentar o valor da saida/gasto;
    
    > Regras de Negocio:

        RN01 - (...)

- RF02 - O sistema precisa registrar entrada:

    - O sistema precisa registrar todas as entradas (dinheiro) ao saldo do usuario;

    > RF02 - Registrar Entrada (FEAT):

        em algum momento sera necessario informar a conta, para que fique armazenado na conta correta.
        o usuario precisa informar o valor da entrada;
        a funcao precisa aumentar o valor do saldo da conta;
        a funcao deve somar o total de dinheiro que entrou na conta;
    
    > Regras de Negocio:

        RN01 - (...)


- RF03 - O sistema precisa Calcular Despesas:

    > RF03 - Calcular Despesas:

    > Regras de Negocio:

        RN01 - (...)

- RF04 - O sistema precisa Calcular Entradas:

    > RF04 - Calcular Entradas:

    > Regras de Negocio:

        RN01 - (...)

- RF05 - O sistema precisa Calcular Saldo:

    - O sistema precisa calcular o saldo do usuario;

    > RF05 - Calcular Saldo (FEAT):

        o usuario deve informar a conta.saldo;
        o usuario deve informar o totalEntrada;
        o usuario deve informar o totalSaida;
        o metodo deve calcular entrada menos saida e mostrar o saldo;
    
    > Regras de Negocio:

        RN01 - (...)

- RF06 - O sistema precisa mostrar saldo:
    
    - O sistema deve mostrar o saldo disponivel que o usuario tem;

    > RF06 - Mostrar Saldo:

        1. a funcao deve mostrar o saldo da conta;

    > Regras de Negocio:

        RN01 - (...)

## Requisitos NAO Funcionais:

    <!-- - Ainda nao vejo necessidade de colocar; -->

## Duvidas para o cliente/usuarios:

    <!-- Pode ser duvidas que preciso levar ate o cliente, mas no momento vou deixar para as minhas proprias duvidas quando elas surgirem, pois o sistema e uma ideia pensada por mim. -->

## Casos de usuo:

    <!-- Nao vejo a necessidade ainda. -->

# Modegem do Dominio:

Aqui precisamos entender exatamente quais informacoes esse sistema vai manipular. Preciso entender como um controle financeiro funciona.

- Pesquisa (search):

## Modelando os dominios de um controle financeiro (dominios/entidades):

## Quais informacoes descreve cada entidade/dominio (atributos):

> Classes Java:

- Conta:
    numero;
    usuario;
    saldo;
    lacamento;

    calcularSaldo()
    exibirSaldo()

- Usuario:
    identificacao;
    numero;

    criarUsuario()

- Lancamento:
    totalEntradas;
    totalSaida;

    registrarEntrada();
    registrarSaida();

## Como as entidades se conectam (descobrindo o relacionamentos):

<!-- Relacionamento das entidades. -->

## Arquitetura do Projeto:

<!-- Ainda nao sera levantado. -->





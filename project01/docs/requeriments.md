# Planejamento:

## Levantando os requisitos

**Sistema de Controle financeiro (Gastos mensais).**

> - Objetivo: Desenvolver um sistema que faca o controle de gastos no mes, entrada (dinheiro que cada conta recebe), saida (despesa que cada conta gasta) e saldo atual, o responsavel da conta precisa saber o quanto ENTROU de dinheiro, o quanto ele GASTOU de dinheiro e quanto SOBROU de saldo disponivel para ele (se o saldo der negativo ele gastou mais do que entrou);

### Usuarios do sistema:

> Ainda nao vejo necessidade, mas seria quem abre a conta no sistema e quem quer fazer o controle, ou seja, cliente. 

### Problemas identificados:

> - Todas as contas estao em uma mesma tabela de entrada, gastos e etc;
>
> - Controle manual desgastante, leva muito tempo para fazer todas as operacoes da forma que esta;
>
> - Dificuldade para acompanhar o quanto estou gastando em cada conta;
>
> - Informacoes misturadas em cartoes, despesas fixas e etcs;
>
> - Muita dor de cabeca e risco de fazer as contas erradas;

### O que o software precisa fazer:

    - Requisitos Funcionais;
    - Requistos NAO Funcionais;


### Requisitos Funcionais:


> - RF01: O sistema precisa registrar todos os gastos do usuario;
>
> - RF02: O sistema precisa registrar entrada;
>
> - RF03: O sistema precisa registrar todas as entradas (dinheiro) ao saldo do usuario;
>
> - RF03 - O sistema precisa Calcular Despesas:
>
> - RF04 - O sistema precisa Calcular Entradas:
>
> - RF05 - O sistema precisa Calcular Saldo:
>
> - RF06 - O sistema precisa mostrar saldo:
    

### Requisitos NAO Funcionais:

    <!-- - Ainda nao vejo necessidade de colocar; -->

### Regras de Negócio:

    <!-- Em desenvolvimento. -->

### Duvidas para o cliente/usuarios:

    <!-- Pode ser duvidas que preciso levar ate o cliente, mas no momento vou deixar para as minhas proprias duvidas quando elas surgirem, pois o sistema e uma ideia pensada por mim. -->

### Casos de usuo:

    <!-- Nao vejo a necessidade ainda. -->

---

# Modegem do Dominio:

Aqui precisamos entender exatamente quais informacoes esse sistema vai manipular. Preciso entender como um controle financeiro funciona.

### Pesquisa (search):

    > Em andamento...

### Modelando os dominios de um controle financeiro (dominios/entidades):

    > Em andamento...

### Quais informacoes descreve cada entidade/dominio (atributos):

    > Em andamento...

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

### Como as entidades se conectam (descobrindo o relacionamentos):

<!-- Relacionamento das entidades. -->

    > Em andamento...

---

# Arquitetura do Projeto:

<!-- Ainda nao sera levantado. -->

    > Não iniciado.





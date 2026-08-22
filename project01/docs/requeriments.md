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

   O controle financeiro funciona mapeando, registrando e categorizando todas as entradas e saídas de dinheiro em um período. 
   Ele transforma dados de gastos e ganhos em uma visão clara para evitar desperdícios, planejar o futuro e alcançar metas.

   - Como montar um controle financeiro:

        > Anotar ganhos: Registre toda fonte de renda (salário, vendas ou extras).
        > Separar despesas: Divida os gastos em fixos (aluguel, contas) e variáveis (lazer, compras).
        > Acompanhar com frequência: Atualize os dados diariamente ou semanalmente.
        > Analisar os resultados: Veja o que sobra ou falta no fim do mês para ajustar as regras.


### Modelando os dominios de um controle financeiro (dominios/entidades):

    CONTROLE FINANCEIRO
        - CONTA
        - DESPESAS
        - LANÇAMENTO
        - USUARIOS

### Quais informacoes descreve cada entidade/dominio (atributos):

    CONTA 
        possui(atributos):
        - numero;
        - usuario;
        - saldo;
        - despesas;

        tem(metodos):
        - lancamento;

    DESPESASA
        possui(atributos)
        - fixas;
        - variaveis;
    
    LANCAMENTO
        possui(atributos)
        - totalEntrada
        - totalSaida

        tem(métodos):
        - conta;

    USUARIO:
        possui(atributos)
        - nome;
        - identificacao;


### Como as entidades se conectam (descobrindo o relacionamentos):

<!-- Relacionamento das entidades. -->

    [CONTA] > possui > [USUARIO]

    [CONTA] > possui [DESPESAS]

    [LANCAMENTO] > tem [CONTA]

    [CONTA] > TEM [LACAMENTO]

---

# Arquitetura do Projeto:

<!-- Ainda nao sera levantado. -->

    > Não iniciado.





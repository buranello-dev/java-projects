package controle_de_gastos.domain;

import java.util.ArrayList;
import java.util.List;

// Superclasse / Base (Mãe) - Agora não pode ser instanciada diretamente.
public abstract class Transacao {

    // As variaveis fica na classe mae para que todas as filhas herdem.
    private double valor;
    private String data; // novo atributo
    private String categoria; // novo atributo

    public Transacao(double valor, String data, String categoria) {
        this.valor = valor;
        this.data = data;
        this.categoria = categoria;
    }

    // Metodos getters comuns - para as classes filhas acessarem o valor privado
    public double getValor() { return this.valor; }
    public String getData() { return data; }
    public String getCategoria() { return categoria; }

    // Metodo abstrato: Não tem corpo { }. Obriga as classes filhas a criarem suas próprias versões
    // Metodo abstrato que sera sobrescrito (Polimorfismo do Extrato)
    public abstract void exibirExtrato();

    // Metodo abstrato que sera sobrescrito (Polimorfismo do Saldo)
    // Receita vai somar (+), Despesa vai subtrair (-)
    public abstract double getValorImpacto();

}

// Subclasse Despesa (filha 1)
class Despesa extends Transacao {

    // Alimentação, Aluguel, Lazer, Etc...

    public Despesa(double valor, String data, String categoria) {
        super(valor, data, categoria); // Passa o valor para o construtor da classe mãe
    }

    @Override
    public void exibirExtrato() {
        // Usa o getValor() herdado para mostrar o valor especifico da despesa(-)
        System.out.println("[-] DESPESA registrada. Valor retirado: R$ " + getValor());
    }

    @Override
    public double getValorImpacto() {
        return -getValor(); // Retorna negativo para diminuir o saldo
    }
}

// Subclasse Receita (filha 2)
class Receita extends Transacao {

    // Salário, Investimento, Presente, Extra, etc...

    public Receita(double valor, String data, String categoria) {
        super(valor, data, categoria); // Passa o valor para o construtor da classe mãe
    }

    @Override
    public void exibirExtrato() {
        // Usa o getValor() herdado para mostrar o valor especifico da receita(+)
        System.out.println("[+] RECEITA registrada. Valor adicionado: R$ " + getValor());
    }

    @Override
    public double getValorImpacto() {
        return getValor(); // Retorna positivo para somar ao saldo.
    }
}

// Classe ContaTest que gerencia a lista de transações
class ContaTest {

    private String titular;
    private List<Transacao> transacoes; // Lista genérica que aceita Receitas e Despesas;

    public ContaTest(String titular) {
        this.titular = titular;
        this.transacoes = new ArrayList<>(); // Instancia a lista.
    }

    public void adicionarTransacao(Transacao transacao) {
        this.transacoes.add(transacao);
    }

    // Calcula o saldo final usando POLIMOSFIRMOS
    public double calcularSaldo() {
        double saldo = 0;
        for (Transacao t : transacoes) {
            // O Java vai decide sozinho se vai somar ou subtrari baseado no objeto real.
            saldo += t.getValorImpacto();
        }
        return saldo;
    }

    public void impimirExtratoCompleto() {
        System.out.println("=== EXTRATO DA CONTA DE: " + titular + " ===");
        for (Transacao t : transacoes) {
            t.exibirExtrato(); // Polimorfismo na exibicao
        }
        System.out.println("-------------------------------------------");
        System.out.println("SALDO ATUAL: R$ " + calcularSaldo());
        System.out.println("===========================================\n");
    }

}

class Main {
    // Classe principal para testar (Polimorfismo / Heranca )
    public static void main(String[] args) {

        // LINHA ABAIXO DARIA ERRO DE COMPILACAO (CLASS ABSTRATA):
        // Transacao t= new Transacao(100); // Erro: Transacao é uma classe abstrata!

        // A referência é do tipo Transacao, mas o objeto é específico (Despesa ou Receita)
        Transacao debito = new Despesa(150.0, "08/09/2026", "Internet");
        Transacao credito = new Receita(2500.0, "08/09/2026", "Salário");

        // O mesmo metodo sendo chamado, mas com comportamentos diferentes
        debito.exibirExtrato();
        credito.exibirExtrato();
        System.out.println();

        // Execução do sistema (teste)
        ContaTest minhaConta = new ContaTest("Heloisa Buranello");

        // Adicionando transações com os novos atributos (valor, data e categoria)
        minhaConta.adicionarTransacao(new Receita(5000.00, "01/09/2026", "Salário"));
        minhaConta.adicionarTransacao(new Despesa(120.00, "02/09/2026", "Internet"));
        minhaConta.adicionarTransacao(new Despesa(250.50, "03/09/2026", "Supermercado"));
        minhaConta.adicionarTransacao(new Receita(150.00, "01/09/2026", "Freelance"));

        // Imprime a lista e calcula o saldo polimorficamente
        minhaConta.impimirExtratoCompleto();


    }
}
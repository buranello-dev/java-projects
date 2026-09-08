package controle_de_gastos.domain;

import java.util.Date;

public class Transacao {

    private int id;
    private double valor;
    private Date data;
    private String descricao;

    public Transacao(double valor){
        this.valor = valor;
    }

    // Metodo getter para as classes filhas acessarem o valor privado
    public double getValor() {
        return this.valor;
    }

    // Metodo que sera sobrescrito
    public void exibirExtrato() {
        System.out.println("Transação genérica no valor de: R$ " + valor);
    }

}

class Despesa extends Transacao {

    private String categoriaDeSaida; // Alimentacao, Aluguel, Lazer, Etc...

    public Despesa(double valor, String categoriaDeSaida) {
        super(valor); // Passa o valor para o construtor da classe mãe
        this.categoriaDeSaida = categoriaDeSaida;
    }

    @Override
    public void exibirExtrato() {
        // Usa o getValor() herdado para mostrar o valor especifico da despesa(-)
        System.out.println("[-] DESPESA registrada. Valor retirado: R$ " + getValor());
    }
}

class Receita extends Transacao {

    private String categoriaDeEntrada; // Salário, Investimento, Presente, Extra, etc...

    public Receita(double valor, String categoriaDeEntrada) {
        super(valor); // Passa o valor para o construtor da classe mãe
        this.categoriaDeEntrada = categoriaDeEntrada;
    }

    @Override
    public void exibirExtrato() {
        // Usa o getValor() herdado para mostrar o valor especifico da receita(+)
        System.out.println("[+] RECEITA registrada. Valor adicionado: R$ " + getValor());
    }
}

class Main {
    // Classe principal para testar (Polimorfismo / Heranca)
    public static void main(String[] args) {

        // A referência é do tipo Transacao, mas o objeto é específico (Despesa ou Receita)
        Transacao debito = new Despesa(150.0, "Internet");
        Transacao credito = new Receita(2500.0, "Salário");

        // O mesmo metodo sendo chamado, mas com comportamentos diferentes
        debito.exibirExtrato();
        credito.exibirExtrato();

    }
}
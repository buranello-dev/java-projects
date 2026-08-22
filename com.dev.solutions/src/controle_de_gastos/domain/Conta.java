package controle_de_gastos.domain;

public class Conta {

    private Usuario usuario;
    private int numero;
    private double saldo;
    private Despesa despesa;

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void calcularSaldo(Lancamento lancamento) {
        this.saldo = lancamento.getTotalEntradas() - lancamento.getTotalSaidas();
    }
}

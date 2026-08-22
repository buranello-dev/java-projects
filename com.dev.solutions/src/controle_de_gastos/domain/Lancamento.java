package controle_de_gastos.domain;

public class Lancamento {

    private double totalEntradas;
    private double totalSaidas;

    public void registrarDespesa(double valorDespesa) {
        this.totalSaidas = this.totalSaidas + valorDespesa;
    }

    public void registrarRenda(double valorRenda) {
        this.totalEntradas = this.totalEntradas + valorRenda;
    }

}

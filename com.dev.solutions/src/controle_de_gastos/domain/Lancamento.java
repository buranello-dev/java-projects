package controle_de_gastos.domain;

public class Lancamento {

    private double totalEntradas;
    private double totalSaidas;

    public void registrarDespesa(double valorDespesa) {
        this.totalSaidas = totalSaidas + valorDespesa;
    }


}

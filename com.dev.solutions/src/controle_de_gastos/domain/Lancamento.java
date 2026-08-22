package controle_de_gastos.domain;

import java.util.Scanner;

public class Lancamento {

    private double totalEntradas;
    private double totalSaidas;

    public void registrarDespesa(double valorDespesa) {
        this.totalSaidas = this.totalSaidas + valorDespesa;
    }

    public void registrarRenda(double valorRenda) {
        this.totalEntradas = this.totalEntradas + valorRenda;
    }

    public double getTotalEntradas() {
        return totalEntradas;
    }

    public double getTotalSaidas() {
        return totalSaidas;
    }

}

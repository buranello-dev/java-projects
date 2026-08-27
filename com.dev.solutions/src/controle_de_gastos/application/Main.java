package controle_de_gastos.application;

import controle_de_gastos.domain.Conta;
import controle_de_gastos.domain.Usuario;

public class Main {
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Tiago", 123456);
        Conta minhaConta = new Conta(usuario, 1010, 1000.0);
        minhaConta.registrarEntrada(500.0);
        minhaConta.registrarSaida(200.0);
        minhaConta.calcularSaldo();

        System.out.println("Saldo Disponível = " + minhaConta.getSaldo());
    }
}

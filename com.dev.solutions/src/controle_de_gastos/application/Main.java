package controle_de_gastos.application;

import controle_de_gastos.domain.Conta;
import controle_de_gastos.domain.Lancamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // CRIADO APENAS PARA TESTAR OS METODOS

        Lancamento lancamento = new Lancamento();

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o valor da despesa: ");
        double valorDespesa = entrada.nextDouble();
        lancamento.registrarDespesa(valorDespesa);

        System.out.print("Digite o valor da renda: ");
        double valorRenda = entrada.nextDouble();
        lancamento.registrarRenda(valorRenda);

        Conta minhaConta = new Conta();
        minhaConta.calcularSaldo(lancamento);
        System.out.println();

        if (minhaConta.getSaldo() < 0) {
            System.out.println("ATENÇÃO: Seu saldo está NEGATIVO!");
        }

        System.out.println("Saldo Disponível: " + minhaConta.getSaldo());

        entrada.close();

    }
}

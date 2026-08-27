package controle_de_gastos.domain;

public class Conta {

    private Usuario usuario;
    private long numero;
    private double saldo;
    private double entrada;
    private double saida;

    public Conta(Usuario usuario, long numero, double saldoInicial) {
        if (saldoInicial < 0 ) {
            System.out.println("Saldo NÃO pode ser menor que ZERO!");
        } else {
            this.usuario = usuario;
            this.numero = numero;
            this.saldo = saldoInicial;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public long getNumero() {
        return numero;
    }

    public void registrarEntrada(double valorDeEntrada) {
        if (valorDeEntrada > 0) {
            System.out.println("Entrada registrada com sucesso: +R$" + valorDeEntrada);
            entrada = valorDeEntrada;
        } else {
            System.out.println("Valor de entrada inválido.");
        }
    }

    public void registrarSaida(double valorGasto) {
        if (valorGasto > 0) {
            System.out.println("Saída registrada com sucesso: -R$" + valorGasto);
            saida = valorGasto;
        } else {
            System.out.println("Valor de saída inválido.");
        }
    }

    public void calcularSaldo() {
        saldo = (saldo + entrada) - saida;
    }
}

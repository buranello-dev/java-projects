package controle_de_gastos.domain;

import java.util.List;

public class Conta {

    private Usuario usuario;
    private long numero;
    private double saldo;
    private double entrada;
    private double saida;

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public long getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getEntrada() {
        return entrada;
    }

    public double getSaida() {
        return saida;
    }

    public void registrarEntrada(double valorDeEntrada) {
        if (valorDeEntrada > 0) {
            System.out.printf("Entrada registrada com sucesso: +R$ %.2f%n", valorDeEntrada);
            entrada = valorDeEntrada;
        } else {
            System.out.println("Valor de entrada NÃO pode ser menor que ZERO.");
        }
    }

    public void registrarSaida(double valorGasto) {
        if (valorGasto > 0) {
            System.out.printf("Saída registrada com sucesso: -R$ %.2f%n", valorGasto);
            saida = valorGasto;
        } else {
            System.out.println("Valor de saída NÃO pode ser menor que ZERO.");
        }
    }

    public void calcularSaldo() {
        saldo = (saldo + entrada) - saida;
    }
}

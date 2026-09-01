package controle_de_gastos.domain;

import java.util.Scanner;

public class Factory {

    public static Usuario criarUsuario(Scanner entrada) {

        Usuario usuario = new Usuario();

        System.out.print("Digite seu nome completo: ");
        usuario.setNome(entrada.nextLine());

        System.out.print("Digite seu número de identidade: ");
        usuario.setIdentificacao(entrada.nextInt());

        return usuario;

    }

    public static Conta abrirConta(Scanner entrada, Usuario usuario) {

        Conta novaConta = new Conta();
        novaConta.setUsuario(usuario);

        System.out.print("Digite o número da conta: ");
        novaConta.setNumero(entrada.nextInt());

        System.out.print("Digite o saldo inicial da conta: ");
        novaConta.setSaldo(entrada.nextDouble());

        return novaConta;
    }

}

package controle_de_gastos.application;

import controle_de_gastos.domain.Conta;
import controle_de_gastos.domain.Factory;
import controle_de_gastos.domain.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // 1. APRESENTAÇÃO INICIAL DO SISTEMA
        System.out.println("**************************************************");
        System.out.println("*          SISTEMA DE CONTROLE FINANCEIRO        *");
        System.out.println("*            Seu dinheiro sob controle           *");
        System.out.println("**************************************************");
        System.out.println("\nBem-vindo ao assistente de extrato bancário.");
        System.out.println("Pressione ENTER para começar a digitar os dados...");
        entrada.nextLine(); // Aguarda o usuario apertar Enter para continuar
        System.out.println("--------------------------------------------------\n");

        // 2. ENTRADA DE DADOS
        System.out.println("CRIANDO ACESSO");
        Usuario usuario = Factory.criarUsuario(entrada);
        Conta minhaConta = Factory.abrirConta(entrada, usuario);
        System.out.println();

        // 3. PROCESSAMENTO
        boolean apresetarMenu = true;

        while (apresetarMenu == true) {

            System.out.println("AÇÕES DISPONÍVEIS PARA REALIZAR");
            System.out.println(" [1] - Registrar Entrada ");
            System.out.println(" [2] - Registrar Saída   ");
            System.out.println(" [3] - Calcular Saldo    ");
            System.out.print(" Digite a opção: ");
            int opcaoSelecionada = entrada.nextInt();
            System.out.println();

            if ((opcaoSelecionada != 1) && (opcaoSelecionada != 2) && (opcaoSelecionada != 3)) {
                System.out.println("A opção selecionada não está disponível!");
            }

            switch (opcaoSelecionada) {

                case 1:
                    System.out.println("REGISTRANDO: ENTRADA");
                    System.out.print("Digite o valor: R$");
                    double valorEntrada = entrada.nextDouble();
                    minhaConta.registrarEntrada(valorEntrada);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("REGISTRANDO: SAÍDA");
                    System.out.print("Digite o valor: R$");
                    double valorSaida = entrada.nextDouble();
                    minhaConta.registrarSaida(valorSaida);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("SALDO CALCULADO!");
                    minhaConta.calcularSaldo();
                    System.out.println();
                    break;
            }

            System.out.print("Digite [TRUE] para continuar ou [FALSE] para sair: ");
            apresetarMenu = entrada.nextBoolean();
            System.out.println();
        }

        entrada.close();

        // 4. APRESENTACAO DO EXTRATO.
        System.out.println("=============================");
        System.out.println("    EXTRATO BANCÁRIO     ");
        System.out.println("=============================");
        System.out.println("Titular: " + minhaConta.getUsuario().getNome());
        System.out.println("Conta: " + minhaConta.getNumero());
        System.out.println("-----------------------------");
        System.out.printf("Total de Entradas: R$ %.2f%n", minhaConta.getEntrada());
        System.out.printf("Total de Saídas: R$ %.2f%n", minhaConta.getSaida());
        System.out.println("-----------------------------");
        System.out.printf("SALDO ATUAL = R$ %.2f%n", minhaConta.getSaldo());
        System.out.println("=============================");

    }
}

package controle_de_estoque.application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("**************************************");
        System.out.println("*     SISTEMA DE CONTROLE ESTOQUE    *");
        System.out.println("*     Seu estoque sob seu controle   *");
        System.out.println("**************************************");
        System.out.println();

        System.out.println("========== MENU PRINCIPAL ============");
        System.out.println("[1] - Cadastrar produto");
        System.out.println("[2] - Listar produtos");
        System.out.println("[3] - Adicionar estoque");
        System.out.println("[4] - Retirar produto estoque");
        System.out.println("[5] - Ver produtos com estoque baixo");
        System.out.println("[6] - Sair");
        System.out.println("======================================");
        System.out.print("Digite uma das opções acima: ");
        int opcaoSelecionada = entrada.nextInt();
        entrada.nextLine();
        System.out.println();

        String[] produtos = new String[5];

        switch (opcaoSelecionada) {

            case 1:
                System.out.println("-----------------------------");
                System.out.println("*    CADASTRANDO PRODUTO    *");
                System.out.println("-----------------------------");

                for (int i = 0; i < produtos.length; i++) {
                    System.out.print("Digite o nome dos produtos: ");
                    produtos[i] = entrada.nextLine();

                }

                System.out.print("Digite a quantidade mínima desejada: ");
                int quantidadeMinima = entrada.nextInt();
                System.out.print("Digite a quantidade inicial dos produtos: ");
                int quantidadeInicial = entrada.nextInt();
                break;

            case 2:
                System.out.println("-----------------------------");
                System.out.println("*     LISTANDO PRODUTOS     *");
                System.out.println("-----------------------------");

                // Verifica se o array não foi criada OU se a primeira posição está vazia.
                if (produtos == null || produtos[0] == null) {
                    System.out.println("Não existem produtos cadastrados! Favor, realizar o cadastro de novos produtos.");
                } else {
                    for (int i = 0; i < produtos.length; i++) {
                        System.out.println(produtos[i]);
                    }
                }

            default:
                // TODO...
        }

        entrada.close();

    }
}

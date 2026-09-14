package controle_de_biblioteca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Classe principal pata testar o sistema.

        // Requisito Funcional 1 - Entrada de dados (1)
        String nomeUsuario = "Heloisa Buranello";
        int idade = 18;
        boolean usuarioAtivo = true;

        // Utilizando operador ternário
        String statusUsuario = usuarioAtivo ? "Ativo" : "Inativo";
        System.out.println(statusUsuario);

        // Requisito Funcional 1 - Entrada de Dados (2)
        boolean livroEstaDisponivel = true;

        String[] nomeDosLivros = {
                "Java para iniciantes",
                "Clean Code",
                "Java Efetivo",
                "Programador Pragmático",
                "Código Limpo",
                "Use a Cabeça! Java"
        };

        // Utilizando operador ternário
        String status = livroEstaDisponivel ? "Disponível" : "Indisponível";
        System.out.println(status);

        // Entrada de dados (3)
        int quantidadeDiasEmAtraso = 0;
        double valorMultaPorDia = 0.0;

        // Processamento dos dados
        valorMultaPorDia += 2.50;
        valorMultaPorDia += 2.50;
        // Resultado - Multa: R$ 5,00

        // Processamento dos dados
        quantidadeDiasEmAtraso++;
        quantidadeDiasEmAtraso++;
        quantidadeDiasEmAtraso++;
        // Resultado - Dias Atrasado: 3

        ++quantidadeDiasEmAtraso;
        --quantidadeDiasEmAtraso;
        // Resultado quantidade de dias em atraso: ( 4 ) debugar e verificar.
        // Resultado quantidade de dias em atraso: ( 3 ) debugar e verificar.

        // RF02 - Calcular a multa.
        double totalMulta = quantidadeDiasEmAtraso * valorMultaPorDia;

        // Requisito funcional 3, Com regra de negócio
        if (usuarioAtivo) {
            // RN1
            System.out.println("O usuário está ATIVO, então PODE pegar livros.");
        } else {
            System.out.println("O usuário está INATIVO, então NÃO pode pegar livros.");
        }

        // Requisito funcional 3, Com regra de negócio
        if (idade >= 18 && usuarioAtivo) {
            // RN2
            System.out.println("Usuário pode realizar empréstimos.");
        } else {
            System.out.println("Usuário não pode realizar empréstimos.");
        }

        // Requisito funcional 3, Com regra de negócio
        if (livroEstaDisponivel) {
            // RN3
            System.out.println("O Livro está disponível para empréstimo.");
        } else {
            System.out.println("O Livro NÃO está disponível para empréstimo.");
        }

        // Requisito funcional 4, Entrada de dados
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
            System.out.println(" === BEM VINDO AO MENU ===");
            System.out.println(" [1] - Listar Livros ");
            System.out.println(" [2] - Consultar Livro ");
            System.out.println(" [3] - Emprestar Livro ");
            System.out.println(" [4] - Devolver Livro ");
            System.out.println(" [5] - Consultar Multa ");
            System.out.println(" [6] - Sair ");

            opcao = entrada.nextInt();

            switch (opcao) {
                case 1:
                    for (String listarLivros : nomeDosLivros ) {
                        System.out.println(listarLivros);
                    }
                    break;

                case 2:
                    System.out.println("Consultando livros...");
                    break;

                case 3:
                    System.out.println("Realizando empréstimo...");
                    break;

                case 4:
                    System.out.println("Realizando devoluação...");
                    break;

                case 5:
                    System.out.println("Consultando valor multa...");
                    break;

                case 6:
                    System.out.println("Saindo...");
                    break;

                default:
                    // RN4
                    System.out.println("Opção inválida. Digite uma opção entre 1 e 5");

            }

        } while (opcao != 6);

        entrada.close();

    }
}

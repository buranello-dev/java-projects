package controle_de_gastos.domain;

import java.util.Scanner;

public class Usuario {

    private String nome;
    private int identificacao;

    public Usuario() {
    }

    public Usuario(String nome, int identificacao) {
        this.nome = nome;
        this.identificacao = identificacao;
    }

    public String getNome() {
        return nome;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public static Usuario criarUsuario(Scanner entrada) {

            Usuario usuario = new Usuario();

            System.out.print("Digite o nome completo: ");
            usuario.nome = entrada.nextLine();

            System.out.print("Digite o identificador: ");
            usuario.identificacao = entrada.nextInt();

            return usuario;
    }

}

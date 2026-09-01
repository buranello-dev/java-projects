package controle_de_gastos.domain;

import java.util.Scanner;

public class Usuario {

    private String nome;
    private int identificacao;

    public String getNome() {
        return nome;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

}

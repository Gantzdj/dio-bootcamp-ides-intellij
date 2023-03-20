package br.com.model;

import java.util.Objects;

public class Gato {
    private String nome;
    private String cor;
    private Integer idade;

    public Gato() {}

    public Gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getnome() {
        return nome;
    }

    public void setnome(String nome) {
        this.nome = nome;
    }

    public String getcor() {
        return cor;
    }

    public void setcor(String cor) {
        this.cor = cor;
    }

    public Integer getidade() {
        return idade;
    }

    public void setidade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(nome, gato.nome) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cor, idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}


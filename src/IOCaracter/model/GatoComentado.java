package IOCaracter.model;

import java.io.Serializable;

public class GatoComentado implements Serializable {

    String nome;
    Integer idade;
    String cor;

    public GatoComentado(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    public GatoComentado(){}

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "GatoComentado{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }
}

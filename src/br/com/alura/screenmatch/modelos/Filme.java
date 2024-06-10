package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculo.Classificavel;

/*
A classe especifica o conteúdo de um objeto
quais caracteristicas o filme possui ?
todas as variaveis que forem feitas, todos os filmes irão possuir
*/
public class Filme extends Titulo implements Classificavel {
    // Usa implements para usar uma interface
    /*
A classe Filme extende da classe Titulo, o filme tem tudo que titulo tem mais o diretor
o filme irá saber fazer tudo que titulo faz
     */
    private String diretor;

    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}

package br.com.alura.screenmatch.principal;

import java.util.ArrayList;
import java.util.Objects;

import br.com.alura.screenmatch.calculo.CalculadorDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        // System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        // System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        // System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(50);
        // System.out.println("Duração para Maratonar "+ lost.getNome() + ": " + lost.getDuracaoEmMinutos() + " minutos");

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadorDeTempo calculadora = new CalculadorDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        // System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoGuilherme = new Filme("Dogville", 2003);
        filmeDoGuilherme.setDuracaoEmMinutos(200);
        filmeDoGuilherme.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoGuilherme);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add((meuFilme));
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

        Object obj = filmeDoGuilherme;
    }
}

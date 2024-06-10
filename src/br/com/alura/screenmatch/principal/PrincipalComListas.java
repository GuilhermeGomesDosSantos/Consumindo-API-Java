package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        var filmeDoGuilherme = new Filme("Dogville", 2003);
        filmeDoGuilherme.avalia(10);

        Serie lost = new Serie("Lost", 2000);

        Filme fi = filmeDoGuilherme;

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoGuilherme);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(lost);

        for (Titulo item : lista) { // para cada item da minha lista tipo Titulo
            System.out.println(item.getNome());

            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Guilherme");
        buscaPorArtista.add("GDS");
        System.out.println(buscaPorArtista);
        Collections.sort(buscaPorArtista);

        System.out.println("Depois da Ordenação:");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de titulos ordenada:");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
}
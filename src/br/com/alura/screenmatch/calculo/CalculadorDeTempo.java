package br.com.alura.screenmatch.calculo;

import br.com.alura.screenmatch.modelos.Titulo;

import java.io.File;

public class CalculadorDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    /*
    public void inclui (Filme f) {
        this.tempoTotal += f.getDuracaoEmMinutos();
    }
     */

    public void inclui (Titulo titulo) {
        System.out.println("Adicionando duração em minutos de " + titulo);
//        System.out.println("Adicionando duração em minutos de " + titulo.getNome());
        /*
Tudo que é filho de Titulo irá aparecer
Polimorfismo, é poder chamar de varias formas
         */
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}

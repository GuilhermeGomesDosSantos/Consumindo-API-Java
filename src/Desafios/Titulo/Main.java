/*
Defina uma classe chamada Titulo com os atributos necessários.
Em seguida, crie um programa que instancia um objeto Titulo,
serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
*/

package Desafios.Titulo;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

    Titulo title = new Titulo("Titulo A", 2024);

        Gson gson = new Gson();
        String json = gson.toJson(title);

        System.out.println(json);
    }
}

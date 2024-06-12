/*
Modifique o programa do Exercício anterior para permitir a conversão de um
JSON mesmo se alguns campos estiverem ausentes ou se houver campos adicionais não representados no objeto Pessoa.
Consulte a documentação da biblioteca Gson para flexibilizar a conversão.
*/

package Desafios.Pessoa;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main_2 {
    public static void main(String[] args) {

        String jsonPessoa = "{\"nome\":\"Guilherme\",\"cidade\":\"SP\"}";
        Gson gson = new GsonBuilder().setLenient().create();

        Pessoa people = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + people);
    }
}

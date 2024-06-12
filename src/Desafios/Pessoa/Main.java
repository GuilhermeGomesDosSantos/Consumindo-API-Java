package Desafios.Pessoa;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

        String jsonPessoa = "{\"nome\":\"Guilherme\",\"idade\":21,\"cidade\":\"SP\"}";
        Gson gson = new Gson();

        Pessoa people = gson.fromJson(jsonPessoa, Pessoa.class);

        System.out.println("Objeto Pessoa: " + people);
    }
}

/*
Modifique o programa anterior para que o JSON gerado seja formatado de maneira mais elegante.
Utilize o método setPrettyPrinting para alcançar esse resultado.
*/

package Desafios.Titulo_2;

import Desafios.Titulo.Titulo;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {

    Titulo title = new Titulo("Titulo A", 2024);

        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        String json = gson.toJson(title);

        System.out.println(json);
    }
}

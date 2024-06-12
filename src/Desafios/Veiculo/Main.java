/*
Defina uma classe chamada Veiculo com os atributos necessários.
Em seguida, crie um programa que instancia um objeto Veiculo,
serializa esse objeto para JSON usando a biblioteca Gson e imprime o resultado.
 */

package Desafios.Veiculo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo("BMW", "Sport", 2024,895443.43);

        Gson gson = new Gson();

        String veiculoJson = gson.toJson(veiculo);

        System.out.println("Objeto veiculo serializado para JSON:");
        System.out.println(veiculoJson);
    }
}

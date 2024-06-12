/*
Desenvolva um programa em Java que permite aos usuários consultar informações sobre um usuário do GitHub
(utilize a API pública do GitHub para obter os dados).
Crie uma classe de exceção personalizada,
ErroConsultaGitHubException, que estende RuntimeException.
Lance essa exceção quando o nome de usuário não for encontrado.
No bloco catch, trate de forma específica essa exceção, exibindo uma mensagem amigável.
 */

package Desafios.GitHub;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o nome do Usuário do Github:");
        var user = leitura.nextLine();

        var endereco = "https://api.github.com/users/" + user;

        try {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .header("Accept", "application/vnd.github.v3+json")
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() == 404) {
            throw new ErroConsultaGitHubException("ERRO '404' - Usuário não encontrado no Github");
        }

        System.out.println(response.body());
        } catch (IOException | InterruptedException e) {
            System.out.println("Ocorreu um erro durante a consulta à API do Github");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }
}

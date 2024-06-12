/*
Crie um programa em Java que escreva a seguinte mensagem em
um arquivo chamado "arquivo.txt": "Conteúdo a ser gravado no arquivo.
"Utilize as classes do pacote java.io.
 */

package Desafios.ArquivoTXT;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        String data = "Conteúdo a ser gravado no arquivo";


        try (FileWriter file = new FileWriter("arquivo.txt")) {
            file.write(data);
            System.out.println("Dados gravados com Sucesso!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

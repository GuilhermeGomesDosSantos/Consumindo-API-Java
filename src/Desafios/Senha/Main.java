package Desafios.Senha;

import java.util.Scanner;

public class Main {

    private static void validaSenha(String senha) {
        if(senha.length() < 8) {
            throw new SenhaInvalidaException("A senha precisa ter pelo menos 8 caracteres");
        }
    }
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Informe uma Senha:");
        String senha = leitura.nextLine();

        try {
            validaSenha(senha);
            System.out.println("Senha válida");

        } catch (SenhaInvalidaException e) {
            System.out.println("ERRO: " + e.getMessage());
        }
    }
}

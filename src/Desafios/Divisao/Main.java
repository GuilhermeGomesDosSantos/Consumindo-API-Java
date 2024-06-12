/*
Crie um programa simples que solicita dois números ao usuário e realiza a divisão do primeiro pelo segundo.
Utilize o bloco try/catch para tratar a exceção que pode ocorrer caso o usuário informe 0 como divisor.
 */

package Desafios.Divisao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe um número:");
        int num_1 = leitura.nextInt();

        System.out.println("Informe um divisor para o Número: '" + num_1 + "'");
        int divisor = leitura.nextInt();

        try {
            int result = num_1 / divisor;
            System.out.println("O Resultado do Número '" + num_1 + "' dividido por '" + divisor + "' é: " + result );
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitida");
        }

    }
}

package DesafioControleFluxo;
// Declara que a classe pertence ao pacote 'edu.ExcecoesJava'.

import java.util.InputMismatchException;
// Exceção lançada quando há incompatibilidade de entrada (ex: digitar texto em campo numérico).

import java.util.Locale;
// Corrigido para 'Locale' (a classe precisa da primeira letra maiúscula).

import java.util.Scanner;
// Classe utilizada para capturar entrada do usuario.

public class ExcecoesTryCatch {
    public static void main(String[] args) {
        try {
            // Criando objeto Scanner com Locale.US para padrão americano (ponto como separador decimal).
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            // Solicitando dados do usuario
            System.out.println("Digite seu nome:");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome:");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura (ex: 1.75):");
            double altura = scanner.nextDouble();

            // Imprimindo os dados obtidos
            System.out.println("\nOlá, me chamo " + nome.toUpperCase() + " " + sobrenome + ".");
            System.out.println("Tenho " + idade + " anos.");
            System.out.println("Minha altura é " + altura + "m.");

            scanner.close(); // Fechando o Scanner
        }
        catch (InputMismatchException e) {
            // Captura exceções de entrada incompatível
            System.err.println("Erro: Certifique-se de digitar valores numéricos para idade e altura.");
        }
        catch (Exception e) {
            // Captura qualquer outra exceção inesperada
            System.err.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
        finally {
            // Executa independentemente de ocorrer exceção ou não
            System.out.println("Programa encerrado.");
        }
    }
}
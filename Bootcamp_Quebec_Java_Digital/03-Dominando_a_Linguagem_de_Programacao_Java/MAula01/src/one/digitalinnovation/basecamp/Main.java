package one.digitalinnovation.basecamp;

/*
 * Exercício da Aula 1 de Métodos: Classe Main
 */

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("<<< Calculadora >>>");
        System.out.println();
        Calculadora.soma(500, 200);
        Calculadora.subtracao(200, 100.5);
        Calculadora.multiplicacao(-1000.5, 60);
        Calculadora.divisao(6000, 10.5);

        // Mensagem
        System.out.println();
        System.out.println("<<< Mensagem >>>");
        System.out.println();
        Mensagem.obterMensagem(7);
        Mensagem.obterMensagem(16);
        Mensagem.obterMensagem(20);
        Mensagem.obterMensagem(25);

        // Empréstimo
        System.out.println();
        System.out.println("<<< Empréstimo >>>");
        System.out.println();
        Emprestimo.calcular(1000, 2, 0.3);
        Emprestimo.calcular(1000, 3, 0.45);
        Emprestimo.calcular(1000, 5, 0.8);
        Emprestimo.calcular(13000, 8, 1.45);
        Emprestimo.calcular(5000, 12, 1.23);

    }
}
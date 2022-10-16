package one.digitalinnovation.basecamp;

/*
 * Exercício da Aula 1 de Métodos: Classe Empréstimo
 */

import static java.lang.Math.pow;

public class Emprestimo {

    public static void calcular(double valor, int parcelas, double taxa) {

        // Fórmula dos Juros Compostos: M = C * (1 + i) ^ t
        double taxaCorrigida = 1 + taxa / 100; // taxaCorrigida = (1 + i)
        double potencia = pow(taxaCorrigida, parcelas); // potencia = (1 + i) ^ t
        double valorFinal = valor * potencia; // M = C * potencia
        System.out.printf("Valor inicial do empréstimo: %.2f %n", valor);
        System.out.println("Número de parcelas: " + parcelas);
        System.out.printf("Valor da taxa de juros: %.2f %n", taxa);
        System.out.printf("Valor final do empréstimo: %.2f %n", valorFinal);
        System.out.println();
    }
}
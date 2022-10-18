package one.digitalinnovation.basecamp;

/*
 * Exercício da Aula 2 de Métodos: Classe Quadrilátero para calcular a área de quadriláteros notáveis
 * utilizando o conceito de sobrecarga em métodos.
 */

public class Quadrilatero {

    public static void area(double lado) {
        System.out.println("Área do quadrado de lado " + lado + " = " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do retângulo de lados " + lado1 + " e " + lado2 + " = " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do trapézio de base maior " + baseMaior + ", base menor " +
                baseMenor + " e altura " + altura + " = " + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Área do losango de diagonais " + diagonal1 + " e " + diagonal2 +
                " = " + (diagonal1 * diagonal2)/2);
    }
}

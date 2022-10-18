package one.digitalinnovation.basecamp;

/*
 * Exercício da Aula 2 de Métodos: Classe Main
 */

public class Main {

    public static void main(String[] args) {

        // Quadrilátero
        System.out.println("Cálculo das áreas de quadriláteros:");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,7d);
        Quadrilatero.area(10,8,7);
        Quadrilatero.area(5f,8f);
    }
}
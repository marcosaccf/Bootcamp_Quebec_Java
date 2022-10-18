package one.digitalinnovation.basecamp;

/*
 * Exercício da Aula 3 de Métodos: Classe Main.
 */

public class Main {

    public static void main(String[] args) {

        // Retornos
        System.out.println("Exercício retornos");

        double areaQuadrado = Quadrilatero.area(5);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(8,10);
        System.out.println("Área do retângulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(10,8,5);
        System.out.println("Área do trapézio:" + areaTrapezio);
    }
}
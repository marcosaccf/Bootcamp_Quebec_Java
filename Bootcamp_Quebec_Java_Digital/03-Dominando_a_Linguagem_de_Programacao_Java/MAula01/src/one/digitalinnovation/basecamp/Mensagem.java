package one.digitalinnovation.basecamp;

/*
 * Exercício da Aula 1 de Métodos: Classe Mensagem
 */

public class Mensagem {

    public static void obterMensagem(int hora) {

        System.out.print("Hora atual: " + hora + " - ");
        if (hora >= 0  && hora < 5 ) {
            mensagemBoaNoite();
            return;
        }
        if (hora > 4  && hora < 13) {
            mensagemBomDia();
            return;
        }
        else if (hora > 12 && hora < 18) {
            mensagemBoaTarde();
            return;
        }
        else if (hora > 17 && hora < 24 ) {
            mensagemBoaNoite();
            return;
        }
        System.out.println("Não é uma hora válida!");
        }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Boa tarde!");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Boa noite!");
    }
}

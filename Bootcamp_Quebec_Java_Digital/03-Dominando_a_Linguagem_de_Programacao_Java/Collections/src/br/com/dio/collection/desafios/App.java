package br.com.dio.collection.desafios;
// Abaixo segue um exemplo de código que você pode ou não utilizar:

import java.util.Scanner;

public class App {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int t = leitor.nextInt();

// TODO: Implemente uma condição onde possamos preencher o vetor de N.
// Lembre-se a sequência de valores é de 0 até T-1:
//        int[] N = new int [1000];
        int count = 0;

        for(int i = 0; i < 1000 ; i += t ){
            for(int j = 0; j < t; j++){
                if (count < 1000) {
                    System.out.println("N[" + count + "] = " + j);
                    count++;
                }
            }
        }
    }
}
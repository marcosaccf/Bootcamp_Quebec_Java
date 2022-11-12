package br.com.dio.collection.desafios;

public class teste {
        public static void main(String[] args){

// TODO: Crie um Array de números inteiros:
            int[] arrayInteiros = {2, 3, 5, 7, 11, 13, 18, 34};

// TODO: Implemente um laço de repetição que verifique APENAS seus números Pares:
            for (int i : arrayInteiros)
                if (i % 2 == 0) {
                    System.out.println(i);
                }
        }
    }

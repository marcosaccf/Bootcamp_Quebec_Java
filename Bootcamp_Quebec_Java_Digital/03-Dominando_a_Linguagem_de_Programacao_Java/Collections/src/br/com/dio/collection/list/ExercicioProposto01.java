package br.com.dio.collection.list;

import java.util.*;

/* Faça um programa que receba a temperatura média dos 6 primeiros meses do ano e
armazene-as em uma lista. Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média e em que mês elas ocorreram
(mostrar o mês por extenso: 1 - Janeiro, 2 - Fevereiro etc.)
 */

/*public class ExercicioProposto01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        // Adicionando as temperaturas nalista:
        int count = 0;
        while (true) {
            if (count == 6) break;

            System.out.print("Digite a temperatura: ");
            double temp = scan.nextDouble();
            temperaturas.add(temp);
            count++;
        }
        System.out.println("-----------------");

        //exibindo todas as temperaturas:
        System.out.println("Todas as temperaturas: ");
        temperaturas.forEach(t -> System.out.print(t + " "));

        //calculando e exibindo amédia das temperaturas:
        double media = temperaturas.stream()
                .mapToDouble(Double::doubleValue)
                .average()
                .orElse(0d);
        System.out.printf("\nMédia das temperaturas: %.1f\n", media);

        //exibindo as temperaturas acima da média:
        System.out.print("Temperaturas acima da média: ");
        temperaturas.stream()
                .filter(t -> t > media)
                .forEach(t -> System.out.printf("%.1f ", t));

        // exibindo o mês das temperaturas acima da média por extenso:
        System.out.println("\n\nMeses das temperaturas acima da média:\n");
        Iterator<Double> iterator = temperaturas.iterator();

        count = 0;
        while (iterator.hasNext()) {
            Double temp = iterator.next();
            if (temp > media) {
                switch (count) {
                    case (0):
                        System.out.printf("1 - janeiro: %.1f\n ", temp);
                        break;
                    case (1):
                        System.out.printf("2 - fevereiro: %.1f\n ", temp);
                        break;
                    case (2):
                        System.out.printf("3 - março: %.1f\n ", temp);
                        break;
                    case (3):
                        System.out.printf("4 - abril: %.1f\n ", temp);
                        break;
                    case (4):
                        System.out.printf("5 - maio: %.1f\n ", temp);
                        break;
                    case (5):
                        System.out.printf("6 - junho: %.1f\n ", temp);
                        break;
                    default:
                        System.out.println("Não houve temperatura acima da média.");
                }
            }
            count++;
        }
    }
}*/

public class ExercicioProposto01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Double> temperaturasSemestral = new ArrayList<Double>();

        double soma = 0.0;
        for (int i = 1; i <= 6; i++) {
            System.out.print("Qual a temperatura do mês " + i + ": ");
            double temp = scan.nextDouble();
            temperaturasSemestral.add(temp);
            soma += temp;
        }

        double mediaTemperaturasSemestral = soma / temperaturasSemestral.size();

        System.out.println("----------");
        System.out.println("Temperaturas Semestral: " + temperaturasSemestral);
        System.out.printf("Média semestral das temperaturas: %.1f°C\n", mediaTemperaturasSemestral);
        System.out.println("----------");
        System.out.println("Meses das temperaturas acima da média: ");

        for (Double temp : temperaturasSemestral) {
            if (temp > mediaTemperaturasSemestral) {
                int index = temperaturasSemestral.indexOf(temp);
                switch (index) {
                    case 0:
                        System.out.println((index + 1) + " - JANEIRO: " + temp + " °C");
                        break;
                    case 1:
                        System.out.println((index + 1) + " - FEVEREIRO: " + temp + " °C");
                        break;
                    case 2:
                        System.out.println((index + 1) + " - MARÇO: " + temp + " °C");
                        break;
                    case 3:
                        System.out.println((index + 1) + " - ABRIL: " + temp + " °C");
                        break;
                    case 4:
                        System.out.println((index + 1) + " - MAIO: " + temp + " °C");
                        break;
                    case 5:
                        System.out.println((index + 1) + " - JUNHO: " + temp + " °C");
                        break;
                    default:
                        break;
                }
            }
        }
    }
}
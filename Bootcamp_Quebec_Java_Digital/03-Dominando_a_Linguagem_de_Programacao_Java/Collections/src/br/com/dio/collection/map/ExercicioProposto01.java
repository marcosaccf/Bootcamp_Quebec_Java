package br.com.dio.collection.map;

/* Dada a população estimada de alguns estados do NE brasileiro, faça:
    Estado = PE - População = 9.616.621
    Estado = AL - População = 3.351.543
    Estado = CE - População = 9.187.103
    Estado = RN - População = 3.534.265
 */

import java.util.*;

public class ExercicioProposto01 {
    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione os estados e suas populações: ");
        Map<String, Integer> populacaoEstadosNE = new HashMap<>() {{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstadosNE.toString());

        System.out.println("Substitua a população do estado do RN por 3534165: ");
        populacaoEstadosNE.put("RN", 3534165);
        System.out.println(populacaoEstadosNE);
        System.out.println("Confira se o estado PB está no dicionário, caso não adicione PB = 4039277: " +
                populacaoEstadosNE.containsKey("PB"));
        populacaoEstadosNE.put("PB", 4039277);
        System.out.println(populacaoEstadosNE);
        System.out.println("Exiba a população de PE: " + populacaoEstadosNE.get("PE"));
        System.out.println("Exiba todos os estados e suas populaçãos na ordem em que foram informados: ");
        Map<String, Integer> populacaoEstadosNE1 = new LinkedHashMap<>(){{
            put("PE", 9616621);
            put("AL", 3351543);
            put("CE", 9187103);
            put("RN", 3534265);
        }};
        System.out.println(populacaoEstadosNE1);
        System.out.println("Exiba todos os estados e suas populações na ordem alfabética: ");
        Map<String, Integer> populacaoEstadosNE2 = new TreeMap<>(populacaoEstadosNE);
        System.out.println(populacaoEstadosNE2);

        Integer menorPopulacao = Collections.min(populacaoEstadosNE.values());
        String estadoMenosPopuloso = "";
        Integer maiorPopulacao = Collections.max(populacaoEstadosNE.values());
        String estadoMaisPopuloso = "";

        Set<Map.Entry<String, Integer>> entries = populacaoEstadosNE.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            if (entry.getValue().equals(menorPopulacao)) {
                estadoMenosPopuloso = entry.getKey();
                System.out.println("Estado menos populoso: " + estadoMenosPopuloso + " = " + menorPopulacao);
            }
            if (entry.getValue().equals(maiorPopulacao)) {
                estadoMaisPopuloso = entry.getKey();
                System.out.println("Estado mais populoso: " + estadoMaisPopuloso + " = " + maiorPopulacao);
            }
        }

        int soma = 0;
        for (Map.Entry<String, Integer> entry : populacaoEstadosNE.entrySet())
           soma += entry.getValue();
        System.out.println("Exiba a soma da população desses estados: " + soma);

        System.out.println("Exiba a média da população deste dicionário de estados: " + (soma / populacaoEstadosNE.size()));

        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Integer> iterator = populacaoEstadosNE.values().iterator();
        while (iterator.hasNext())
            if (iterator.next() <= 4000000) iterator.remove();
        System.out.println(populacaoEstadosNE);

        System.out.println("Apague o dicionario de estados com suas respectivas populações estimadas: ");
        populacaoEstadosNE.clear();
        System.out.println(populacaoEstadosNE);

        System.out.println("Confira se a lista está vazia: " + populacaoEstadosNE.isEmpty());
    }
}
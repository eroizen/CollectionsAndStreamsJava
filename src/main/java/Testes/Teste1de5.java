package Testes;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Teste1de5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String testePonto = br.readLine();
        StringTokenizer st = new StringTokenizer(testePonto);
        List<StringTokenizer> linhas = new ArrayList<>();

        while(!testePonto.contentEquals(".")){
            linhas.add(new StringTokenizer(testePonto));
            testePonto = br.readLine();
        }
        for(StringTokenizer linha:linhas) {
            Map<String, Integer> frequencias = new LinkedHashMap<>();
            List<String> listaDePalavras = new ArrayList<>();
            while (linha.hasMoreTokens()) {
                String palavra = String.valueOf(linha.nextToken(" "));
                if (palavra.endsWith(".")) {
                    listaDePalavras.add(palavra.substring(0, palavra.length() - 1));
                    listaDePalavras.add(".");
                } else listaDePalavras.add(palavra);
            }
            //CALCULO DE FREQUENCIA DE PALAVRAS E ECONOMIA TOTAL DE LETRAS
            for (Object obj : listaDePalavras) {
                int size = obj.toString().length();
                if (size > 2) {                                                         //Exclusão de palavras inferiores a 2 caracteres
                    int frequency = Collections.frequency(listaDePalavras, obj);
                    frequencias.put(String.valueOf(obj), frequency);
                }
            }
            for (Map.Entry<String, Integer> entry : frequencias.entrySet()) {
                int x = (entry.getKey().length() - 2) * entry.getValue();
                frequencias.put(entry.getKey(), x);
            }
            //Seleção de palavras para abreviar
            char[] caracteres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            List<String> abreviar = new LinkedList<>();
            for (char l : caracteres) {
                String inicial = String.valueOf(l);
                ArrayList<String> listaPorInicial = (ArrayList<String>) frequencias.keySet().stream()
                        .filter(chave -> chave.startsWith(inicial))
                        .collect(Collectors.toList());

                if (!listaPorInicial.isEmpty()) {
                    int economia = 0;
                    String palavraAAbreviar = null;
                    for (String i : listaPorInicial) {
                        int economiaItem = frequencias.get(i);
                        if (economiaItem >= economia) {
                            economia = economiaItem;
                            palavraAAbreviar = i;
                        }
                    }
                    abreviar.add(palavraAAbreviar);
                }
            }
            //Substituição na frase e contagem de frequencia
            StringBuilder frase = new StringBuilder();
//            int contador = 0;
            for (String palavra : listaDePalavras) {
                if (abreviar.contains(palavra)) {
                    frase.append(" ").append(palavra.charAt(0)).append(".");
//                    contador += 1;
                } else {
                    frase.append(" ").append(palavra);
                }
            }
            frase = new StringBuilder(frase.substring(1));

            //Execução da Saída
            System.out.println(frase);
            System.out.println(abreviar.size());

            for (String a : abreviar) {
                System.out.println((a.charAt(0)) + ". = " + a);
            }
        }
    }
}
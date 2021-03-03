package Testes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Teste4de5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\eroiz\\java\\CollectionsAndStreamsJava\\src\\main\\java\\Testes\\arquivo.txt"));
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        StringTokenizer st = new StringTokenizer(br.readLine());
        String palavraErrada;

        while((palavraErrada= br.readLine())!=null){
            int apontador = palavraErrada.length()/2;
            for (int i = 0; i <=apontador ; i++) {
                if(palavraErrada.substring(0,apontador)
                        .endsWith(palavraErrada.substring(apontador,palavraErrada.length()))) {
                    System.out.println(palavraErrada.substring(0, apontador));
                    break;
                } else if(apontador==palavraErrada.length()) {
                    System.out.println(palavraErrada);
                break;
                }
                apontador+=1;
            }
        }
    }
}
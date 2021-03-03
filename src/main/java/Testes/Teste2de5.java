package Testes;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Collectors;


class Teste2de5 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
        String frase= "3\nabc\ndae\nabc0de\n2\nabc\ndef\n3\nteste\nse\npasse\n0";
        StringTokenizer st = new StringTokenizer(frase);
        List<String> palavrasConjunto = new ArrayList<>();
        String contador= st.nextToken();
        while(!contador.matches("[0]")&&st.hasMoreElements()){
            int verificaPrefixo=0;
            palavrasConjunto.clear();
            if (Integer.parseInt(contador) > 0) {
                for(int i=0; i<(Integer.parseInt(contador)); i++){
                    palavrasConjunto.add(st.nextToken());//br.readLine());
                }
                for(String palavras:palavrasConjunto){
                    if(palavrasConjunto.stream().filter(x->x.startsWith(palavras)).count()>1){
                        verificaPrefixo+=1;
                    }
                }
                if (verificaPrefixo==0){
                    System.out.println("Conjunto Bom");
                }else System.out.println("Conjunto Ruim");
            }
            contador=st.nextToken(); //br.readLine();
        }
    }
}
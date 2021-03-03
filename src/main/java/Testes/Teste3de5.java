package Testes;
import java.io.*;

public class Teste3de5 {
    static BufferedReader in;

    static {
        try {
            in = new BufferedReader(new FileReader("C:\\Users\\eroiz\\java\\CollectionsAndStreamsJava\\src\\main\\java\\Testes\\arquivo.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
      //  System.out.println(in.readLine());
        String a, b, max, min; //declare suas variaveis aqui
        while (( a= in.readLine()) != null) { // complete seu código
                b= in.readLine();
            if (a.length()>=b.length()) {
                max=a;
                min=b;
            } else {
                max=b;
                min=a;
            }
            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - maxS;
                for (int i =0; i <=diff ;i++ ) { //complete o laco de repeticao
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }

}
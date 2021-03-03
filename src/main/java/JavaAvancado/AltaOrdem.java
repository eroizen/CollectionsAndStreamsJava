package JavaAvancado;

public class AltaOrdem {
    public static void main(String[] args) {
        Calculo soma= (a,b) -> a+b;
        Calculo subtr= (a,b) -> a-b;
        Calculo mult= (a,b) -> a*b;
        Calculo divis= (a,b) -> a/b;

        System.out.println(executarOperacao(soma,3,2));
        System.out.println(executarOperacao(subtr,5,3));
        System.out.println(executarOperacao(mult,5,8));
        System.out.println(executarOperacao(divis,9,3));

    }
    public static int executarOperacao(Calculo calculo, int a, int b){return calculo.calcular(a,b);}
}
@FunctionalInterface
interface Calculo{
    int calcular (int a, int b);
}
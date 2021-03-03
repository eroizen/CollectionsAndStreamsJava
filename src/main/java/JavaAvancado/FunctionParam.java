package JavaAvancado;

import java.util.function.Function;

public class FunctionParam {
    public static void main(String[] args) {
        Function<String,Integer> testeFuncao = Integer::valueOf;

        System.out.println(testeFuncao.apply("50"));
    }
}

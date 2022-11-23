import java.util.Arrays;
import java.util.stream.LongStream;

public class ejercicio31 {
    public static void main(String[] args) {

        /*Obtener el numero mayor en un arreglo con programación funcional lambda y api stream*/

        int[] arreglo = new int[100];

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = i+1;
        }

        double total = Arrays.stream(arreglo)
                .filter(e -> e % 10 != 0)
                .mapToDouble(e -> (double) e / 2)
                .reduce(0, (ac, e) -> ac + e);

        System.out.println(total); // 2250.0
    }
}
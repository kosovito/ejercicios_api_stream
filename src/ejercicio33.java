import java.util.Arrays;

public class ejercicio33 {
    public static void main(String[] args) {

        //Aplanar un array bidimensional y eliminar repetidos
        String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"}, {"javascript"}, {}};

        Arrays.stream(lenguajes)
                .flatMap(arr -> Arrays.stream(arr))
                .distinct()
                .forEach(System.out::println);
    }
}

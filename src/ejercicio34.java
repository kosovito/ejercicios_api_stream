import java.util.ArrayList;
import java.util.List;


public class ejercicio34 {
    public static void main(String[] args) {

        /*El siguiente requerimiento es para una lista de productos List<Producto> ,
        de 3 a 5 elementos, se pide calcular el importe (precio por cantidad) y sumarlos.

        La clase Producto debe tener el atributo precio del tipo double y cantidad int, entonces utilizando
        stream convertir la lista de productos en el gran total del tipo double.*/
        List<Producto> lista = new ArrayList<>();
        lista.add(new Producto(19.95, 5));
        lista.add(new Producto(9.95, 3));
        lista.add(new Producto(39.95, 2));

        Double granTotal = lista.stream()
                .mapToDouble(u -> (u.getPrecio()*u.getCantidad()))
                .sum();
        System.out.println("granTotal = " + granTotal);
    }
}

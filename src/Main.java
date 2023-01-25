
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    List<String> listado = new ArrayList<String>();

    listado.add("Sonia");
    listado.add("Maria");
    listado.add("Antonio");
    listado.add("Valeria");
    listado.add("Natalia");
    for(String nombre:listado){
        System.out.println(nombre);
        System.out.println();

    }

        Scanner input = new Scanner (System.in);
        List<String> nombres = new ArrayList<String>();
        System.out.println("Ingrese la cantidad de nombres que tendrá su lista: ");
        String N=input.nextLine();
        for(int i=0;i<Integer.parseInt(N);i++){

            System.out.println("Ingrese un nombre: ");
            String nuevoNombre=input.nextLine();
            nombres.add(nuevoNombre);

        }
           for (String nuevoNombre : nombres){
               System.out.println(nuevoNombre);


           }
           }
        }


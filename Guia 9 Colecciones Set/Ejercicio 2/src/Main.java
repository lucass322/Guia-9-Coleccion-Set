
import java.util.Scanner;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {


                Scanner scanner = new Scanner(System.in);
                TreeSet<Integer> numeros = new TreeSet<>();

                System.out.println("Ingrese números enteros (escriba 'fin' para terminar):");

                while (true) {
                    String entrada = scanner.next();
                    if (entrada.equalsIgnoreCase("fin")) {
                        break;
                    }

                    // Como no usamos excepciones, asumimos que la entrada siempre es un número entero válido
                    int numero = Integer.parseInt(entrada);
                    numeros.add(numero);
                }

                System.out.println("Orden ascendente: " + numeros);
                System.out.println("Orden descendente: " + numeros.descendingSet());

                scanner.close();
            }
        }



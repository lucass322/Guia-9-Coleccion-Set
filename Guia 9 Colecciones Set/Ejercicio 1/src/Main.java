
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;

public class Main {
    public static void main(String[] args) {



                // 1. Generar lista original de números aleatorios
                ArrayList<Integer> listaOriginal = new ArrayList<>();
                Random random = new Random();

                for (int i = 0; i < 20; i++) {      // Genera 20 números aleatorios del 0 al 9
                    listaOriginal.add(random.nextInt(10));
                }

                System.out.println("Lista original: " + listaOriginal);

                // 2. Ordenar la lista
                Collections.sort(listaOriginal);
                System.out.println("Lista ordenada: " + listaOriginal);

                // 3. Eliminar duplicados usando HashSet
                HashSet<Integer> conjuntoUnico = new HashSet<>(listaOriginal);
                System.out.println("Sin duplicados (HashSet): " + conjuntoUnico);

                // Si querés mantener el orden, convertir nuevamente a lista y ordenarlo
                ArrayList<Integer> listaSinDuplicados = new ArrayList<>(conjuntoUnico);
                Collections.sort(listaSinDuplicados);
                System.out.println("Sin duplicados (ordenado): " + listaSinDuplicados);
            }
        }

import java.util.ArrayList;
import java.util.Scanner;

public class LaNotaMediaV2 {
    public static void main(String[] args){

        ArrayList<Double> lista = new ArrayList<Double>();

        boolean bool = true;

        while(bool) {

            System.out.println("¿Nota (-1 para terminar)? " );
            Scanner teclado2 = new Scanner(System.in);
            double nota = teclado2.nextDouble();
            if (nota != -1){
                lista.add(nota);
            }else {
                bool = false;
            }

        }
        double media = 0;
        for (int i = 0; i < lista.size(); i++) {

            media += lista.get(i);
        }

        System.out.println("La nota media es " + media/lista.size());

    }
}

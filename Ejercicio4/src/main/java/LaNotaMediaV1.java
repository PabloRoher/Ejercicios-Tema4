import java.util.ArrayList;
import java.util.Scanner;

public class LaNotaMediaV1 {
    public static void main(String[] args){

        ArrayList<Double> lista = new ArrayList<Double>();
        int numero;
        System.out.println("Introduzca el número de notas: " );
        Scanner teclado1 = new Scanner(System.in);
        numero = teclado1.nextInt();

        for (int i = 0; i < numero; i++) {

            System.out.println("Introduzca el número de notas: " );
            Scanner teclado2 = new Scanner(System.in);
            double nota = teclado2.nextDouble();
            lista.add(nota);
        }
        double media = 0;
        for (int i = 0; i < lista.size(); i++) {

            media += lista.get(i);
        }

        System.out.println("La media es " + media/lista.size());

}
}

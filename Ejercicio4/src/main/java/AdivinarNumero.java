import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args){

        int numeroRandom = 0;
        numeroRandom = (int) (Math.random()*100) + 1;
        System.out.println(numeroRandom);
        boolean bool = true;

        while(bool) {

            System.out.println("¿En qué número entre 1 y 100 estoy pensando? " );
            Scanner teclado2 = new Scanner(System.in);
            int numero = teclado2.nextInt();
            if (numero < numeroRandom){
                System.out.println("Mayor");
            } else if (numero > numeroRandom) {
                System.out.println("Menor");
            }else {
                bool = false;
                System.out.println("Bravo, lo ha encontrado");
            }
        }
    }
}

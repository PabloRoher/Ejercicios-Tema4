import java.util.Scanner;

public class AdivinarNumeroV2 {
    public static void main(String[] args){
        int intentos = 0;
        boolean bool = true;
        System.out.println("Elija un número del 1 al 100 " );
        Scanner teclado1 = new Scanner(System.in);
        int numero = teclado1.nextInt();
        int numeroMinimo = 1;
        int numeroMaximo = 100;

        while(bool) {
            int n = (int) (Math.random() * ((numeroMaximo + 1) - (numeroMinimo)) + (numeroMinimo));
            System.out.println("Pruebo con " + n  + ", ¿es mayor, menor o es el número (+/-/=)? " );
            intentos += 1;
            Scanner teclado2 = new Scanner(System.in);
            String tecla = teclado2.nextLine();


            if (tecla.equals("-")){
                numeroMinimo = n;

            } else if (tecla.equals("+")) {
                numeroMaximo = n;

            }else if (tecla.equals("=")) {
                bool = false;
                System.out.println("Fenomenal, lo he encontrado después de " + intentos + " intentos.");
            }
        }
    }
}

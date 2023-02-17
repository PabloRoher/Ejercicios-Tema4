import java.util.Scanner;

public class EscribirMultiplosDe3 {
    public static void main(String[] args) {
        Scanner teclado1 = new Scanner(System.in);
        int numero;
        boolean bool = true;

        while (bool) {
            System.out.print("Escribe un múltiplo de tres: ");
            numero = teclado1.nextInt();
            if (numero % 3 != 0){
                System.out.println("Error " + numero + " no es un múltiplo de 3");
            }else {
                System.out.println("Ok: " + numero +" es un múltiplo de 3");
                bool = false;
            }
        }


    }
}

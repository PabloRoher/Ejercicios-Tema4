import java.util.Scanner;

public class ArteASCII1 {
    public static void main(String[] args){
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("¿Anchura? ");
        int altura = teclado1.nextInt();
        System.out.println("¿Altura?");
        int anchura = teclado1.nextInt();
        System.out.println("¿Carácter?");
        char caracter = teclado1.next().charAt(0);

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < anchura; j++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}

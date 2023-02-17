import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int numIntento = 1;
        String valorIntroducido;
        final int MAX_Intentos = 5;
        boolean bool = true;


        while (bool){

            System.out.println("¿Cuál es la capital de Francia?");
            Scanner teclado1 = new Scanner(System.in);
            valorIntroducido = teclado1.nextLine();

            if ( valorIntroducido.equals("Paris")){
                System.out.println("Bravo");
                bool = false;
            }else if (MAX_Intentos - numIntento == 0){
                System.out.println("Revise sus conocimientos en geografia");
                bool = false;
            }else {
                System.out.println("Solo quedan " + (MAX_Intentos - numIntento) + " intento(s)");
                numIntento += 1;
            }


        }

    }
}

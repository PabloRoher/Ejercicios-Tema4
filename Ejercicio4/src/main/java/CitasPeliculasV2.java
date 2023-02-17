import java.util.Scanner;

public class CitasPeliculasV2 {
    public static void main(String[] args) {

        Scanner teclado1 = new Scanner(System.in);
        int opcion;
        String citas [][] = {
                {"Cuidado, es una auténtica carnicería","Cuidado, es una auténtica carnicería"},
                {"Me llamo Bond, James Bond","My name is Bond, James Bond"},
                {"¿Temes a la muerte?","Do you fear death?"},
                {"No. No lo intentes. Hazlo, o no lo hagas, pero no lo intentes","Que la fuerza te acompañe"}
        };

        do {
            System.out.println( "1 - Una cita de la ciudad del miedo");
            System.out.println("2 - Una cita de James Bond");
            System.out.println("3 - Una cita de Piratas del Caribe : El Cofre del Hombre Muerto");
            System.out.println("4 - Una cita de Star Wars");
            System.out.println("5 - Salir de esta magnífica aplicación");
            opcion = teclado1.nextInt();

            int a = (int) (Math.random() * 2);

            switch (opcion){
                case 1:
                    System.out.println(citas[0][ a]);
                    break;
                case 2:
                    System.out.println(citas[1][a]);
                    break;
                case 3:
                    System.out.println(citas[2][a]);
                    break;
                case 4:
                    System.out.println(citas[3][a]);
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
            }
        }while (opcion != 5);

    }
}

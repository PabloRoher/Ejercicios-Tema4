import java.util.Scanner;

public class CitasPeliculas {
    public static void main(String[] args) {

        Scanner teclado1 = new Scanner(System.in);
        int opcion;

        do {
            System.out.println( "1 - Una cita de la ciudad del miedo");
            System.out.println("2 - Una cita de James Bond");
            System.out.println("3 - Una cita de Piratas del Caribe : El Cofre del Hombre Muerto");
            System.out.println("4 - Una cita de Star Wars");
            System.out.println("5 - Salir de esta magnífica aplicación");
            opcion = teclado1.nextInt();

            switch (opcion){
                case 1:
                    System.out.println("Cuidado, es una auténtica carnicería");
                    break;
                case 2:
                    System.out.println("Me llamo Bond, James Bond");
                    break;
                case 3:
                    System.out.println("¿Temes a la muerte?");
                    break;
                case 4:
                    System.out.println("No. No lo intentes. Hazlo, o no lo hagas, pero no lo intentes");
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
            }
        }while (opcion != 5);

    }
}

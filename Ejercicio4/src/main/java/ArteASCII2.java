import java.util.Scanner;

public class ArteASCII2 {
    public static void main(String[] args){
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("¿Tamaño? ");
        int tamaño = teclado1.nextInt();
        System.out.println("¿Carácter?");
        char caracter = teclado1.next().charAt(0);

        Scanner teclado2 = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("¿forma?");
            System.out.println("1 - rectángulo con relleno");
            System.out.println("2 - rectángulo sin relleno");
            System.out.println("3 - cruz de San Andrés");
            System.out.println("4 - triángulo rectángulo");
            System.out.println("5 - rombo");
            System.out.println("6 - ajedrezado");
            System.out.println("7 - salir");
            opcion = teclado2.nextInt();

            switch (opcion){
                case 1:
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            System.out.print(caracter);
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            if (i == 0 || i == tamaño - 1 || j == 0 || j == tamaño - 1){
                                System.out.print(caracter);
                            }else {
                                System.out.print(" ");
                            }

                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            if (i == j || i + j == tamaño -1){
                                System.out.print(caracter);
                            }else {
                                System.out.print(" ");
                            }

                        }
                        System.out.println();
                    }
                    break;

                case 4:
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            if (j == 0 || i == tamaño - 1 || i == j ){
                                System.out.print(caracter);
                            }else {
                                System.out.print(" ");
                            }

                        }
                        System.out.println();

                    }
                    break;

                case 5:
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i * 2 + 1; j++) {
                            if (j == 0 || j == i * 2) {
                                System.out.print(caracter);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }

                    for (int i = tamaño - 2; i >= 0; i--) {
                        for (int j = 0; j < tamaño - i; j++) {
                            System.out.print(" ");
                        }
                        for (int j = 0; j < i * 2 + 1; j++) {
                            if (j == 0 || j == i * 2) {
                                System.out.print(caracter);
                            } else {
                                System.out.print(" ");
                            }
                        }
                        System.out.println();
                    }
                    break;

                case 6:
                    int a = 0;
                    for (int i = 0; i < tamaño; i++) {
                        for (int j = 0; j < tamaño; j++) {
                            if (a % 2 == 0){
                                System.out.print(caracter);
                                a += 1;
                            }else {
                                System.out.print(" ");
                                a+= 1;
                            }

                        }
                        System.out.println();
                    }
                    break;
            }

        }while (opcion != 7);
    }
}

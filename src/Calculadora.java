import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner Calculadora = new Scanner(System.in);

        boolean salir = true;
        bucle1:while (salir) {

            System.out.println("Bienvenido a la calculadora");

            System.out.println("Seleccione uno de los siguientes operadores \n 1. Suma \n 2. Resta \n 3. Multiplicacion \n 4. divisicion \n 5. Salir del programa"
                    + "\nIngresa un numero correspondiente al listado:");

            int opcion = Calculadora.nextInt();

            if (opcion == 5) {
                salir = true;
                System.out.println("Saliendo del programa.");
                continue;
            }

            if (opcion < 1 || opcion > 4) {
                System.out.println("Opcion no valida. Ingresa un numero correspondiente al listado.");
                continue;
            }

            System.out.print("Introduce el primer número: ");
            double num1 = Calculadora.nextDouble();
            System.out.print("Introduce el segundo número: ");
            double num2 = Calculadora.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case 2:
                    System.out.println("Resultado:" + (num1 - num2));
                    break;

                case 3:
                    System.out.println("Resultado:" + (num1 * num2));
                    break;

                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: División por cero no permitida.");
                    }
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
            Calculadora.nextLine();
            System.out.println("Ingresa enter para continuar de nuevo");
            Calculadora.nextLine();

        }
    }
}

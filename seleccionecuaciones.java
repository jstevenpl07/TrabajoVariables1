import java.util.Scanner;

public class seleccionecuaciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double x = 0;
        double z = 0;

        System.out.println("Seleccione una ecuacion: ");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3. Salir");
        System.out.print("Opcion: ");
        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese un valor para x: ");
                while (!entrada.hasNextDouble()) { // Para verificar que se ingreso un dato numerico para x,
                    System.out.println("Ingrese un valor numerico");

                    entrada.next();
                    System.out.println("Ingrese un valor valido para x: ");
                }
                x = entrada.nextDouble(); // Se acepto y almaceno la variable x

                System.out.println("Ingrese un valor para z: ");
                while (!entrada.hasNextDouble()) { // Para verificar que se ingreso un dato numerico para z
                    System.out.println("Ingrese un valor numerico");

                    entrada.next();
                    System.out.println("Ingrese un valor valido para z: ");
                }
                z = entrada.nextDouble(); // Se acepto y almaceno la vaiable z

                double a = (3 * x) / ((1) + ((3 * x) / (3 * (z * (z)) + 2)))
                        / (1 / ((1 / (1 + z)) + 3 * (x * (x)) + 2 * z + 3));

                System.out.println("El resultado es: " + a);
                break;

            case 2:
                while (true) { // 🔁 CICLO INFINITO

                    System.out.print("Ingrese el valor de x: ");
                    x = entrada.nextDouble();

                    System.out.print("Ingrese el valor de z: ");
                    z = entrada.nextDouble();

                    // ✅ CONDICION 1
                    if (z == 0) {
                        System.out.println("Error: z no puede ser 0");
                        continue;
                    }

                    // ✅ CONDICION 2
                    if (1 + 3 * x == 0) {
                        System.out.println("Error en 1 + 3x");
                        continue;
                    }

                    // ✅ CONDICION 3
                    if (1 + 2 * z == 0) {
                        System.out.println("Error en 1 + 2z");
                        continue;
                    }

                    // ✅ CONDICION 4
                    if (1 + (5.0 / z) == 0) {
                        System.out.println("Error en 1 + (5/z)");
                        continue;
                    }

                    double parteA = ((x * x) + 3 * z + 2) / (2 + (1.0 / (1 + 2 * z)));

                    // ✅ CONDICION 5
                    if (parteA == 0) {
                        System.out.println("Parte A es 0");
                        continue;
                    }

                    double parteB = (1 + 3 * (x * x * x) + 3 * z + 2);

                    // ✅ CONDICION 6
                    if (parteB == 0) {
                        System.out.println("Parte B es 0");
                        continue;
                    }

                    double parteC = (1.0 /
                            ((1.0 / (1 + 3 * x))
                                    +
                                    ((3 * x + 1) / (2 * 3 + (3.0 / (1 + (5.0 / z)))))));

                    // ✅ CONDICION 7
                    if (parteC == 0) {
                        System.out.println("Parte C es 0");
                        continue;
                    }

                    double resultado = parteA + (2.0 / (parteB / parteC));

                    // ✅ CONDICION 8
                    if (resultado < 0) {
                        System.out.println("Resultado negativo");
                    }

                    System.out.println("El resultado es: " + resultado);

                    System.out.println("El programa se repite (ciclo infinito)...");
                }

            case 3:
                System.out.println("Saliendo");
                break;
            default:
                System.out.println("Entrada invalida");
        }

    }

}
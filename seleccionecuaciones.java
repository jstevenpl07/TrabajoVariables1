import java.util.Scanner;

public class seleccionecuaciones {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double x;
        double z;

        System.out.println("Seleccione una ecuacion: ");
        System.out.println("1.");
        System.out.println("2.");
        System.out.println("3. Salir");
        System.out.print("Opcion: ");
        int opcion = entrada.nextInt();

        switch (opcion) {

            case 1:

                System.out.print("Ingrese un valor para x: ");
                x = entrada.nextDouble();

                System.out.print("Ingrese un valor para z: ");
                z = entrada.nextDouble();

                double a = (3 * x) / (1 + ((3 * x) / (3 * (z * z) + 2)))
                        / (1 / ((1 / (1 + z)) + 3 * (x * x) + 2 * z + 3));

                System.out.println("El resultado es: " + a);
                break;

            case 2:

                System.out.print("Ingrese el valor de x: ");
                x = entrada.nextDouble();

                System.out.print("Ingrese el valor de z: ");
                z = entrada.nextDouble();

                if (z == 0) {
                    System.out.println("Error: z no puede ser 0");
                } 
                else if (1 + 3 * x == 0) {
                    System.out.println("Error en 1 + 3x");
                } 
                else if (1 + 2 * z == 0) {
                    System.out.println("Error en 1 + 2z");
                } 
                else if (1 + (5.0 / z) == 0) {
                    System.out.println("Error en 1 + (5/z)");
                } 
                else {

                    double parteA = ((x * x) + 3 * z + 2) / (2 + (1.0 / (1 + 2 * z)));

                    if (parteA == 0) {
                        System.out.println("Parte A es 0");
                    } 
                    else {

                        double parteB = (1 + 3 * (x * x * x) + 3 * z + 2);

                        if (parteB == 0) {
                            System.out.println("Parte B es 0");
                        } 
                        else {

                            double parteC = (1.0 /
                                    ((1.0 / (1 + 3 * x))
                                            +
                                            ((3 * x + 1) / (6 + (3.0 / (1 + (5.0 / z)))))));

                            if (parteC == 0) {
                                System.out.println("Parte C es 0");
                            } 
                            else {

                                double resultado = parteA + (2.0 / (parteB / parteC));

                                if (resultado < 0) {
                                    System.out.println("Resultado negativo");
                                }

                                System.out.println("El resultado es: " + resultado);
                            }
                        }
                    }
                }
                break;

            case 3:
                System.out.println("Saliendo");
                break;

            default:
                System.out.println("Entrada invalida");
        }

        entrada.close();
    }
}


}

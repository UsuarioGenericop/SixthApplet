import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadEstudiantes;
        int opcion;
        double suma = 0, promedio;

        System.out.println("=== CÁLCULO DE PROMEDIO POR MATERIA ===");
        System.out.println("1. Matemáticas");
        System.out.println("2. Español");
        System.out.println("3. Inglés");
        System.out.print("Seleccione la materia (1-3): ");
        opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.print("Ingrese la cantidad de estudiantes: ");
                cantidadEstudiantes = sc.nextInt();

                suma = 0;
                for (int i = 1; i <= cantidadEstudiantes; i++) {
                    System.out.print("Ingrese la nota del estudiante " + i + ": ");
                    double nota = sc.nextDouble();
                    suma += nota;
                }

                promedio = suma / cantidadEstudiantes;
                System.out.println("El promedio del grupo en Matemáticas es: " + promedio);
                break;

            case 2: // Español con ciclo while
                System.out.print("Ingrese la cantidad de estudiantes: ");
                cantidadEstudiantes = sc.nextInt();

                suma = 0;
                int contador = 1;
                while (contador <= cantidadEstudiantes) {
                    System.out.print("Ingrese la nota del estudiante " + contador + ": ");
                    double nota = sc.nextDouble();
                    suma += nota;
                    contador++;
                }

                promedio = suma / cantidadEstudiantes;
                System.out.println("El promedio del grupo en Español es: " + promedio);
                break;

            case 3: // Inglés con ciclo do-while
                System.out.print("Ingrese la cantidad de estudiantes: ");
                cantidadEstudiantes = sc.nextInt();

                suma = 0;
                int i = 1;
                do {
                    System.out.print("Ingrese la nota del estudiante " + i + ": ");
                    double nota = sc.nextDouble();
                    suma += nota;
                    i++;
                } while (i <= cantidadEstudiantes);

                promedio = suma / cantidadEstudiantes;
                System.out.println("El promedio del grupo en Inglés es: " + promedio);
                break;

            default:
                System.out.println("Opción no válida. Intente de nuevo.");
        }

        sc.close();

}}

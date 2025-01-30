// import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.Console;



public class MiPrueba {
    public static void main(String[] args) throws IOException {
        

        // System.out.println("Hola Mundo bello");

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Introduce tu nombre: ");
        // String nombre = scanner.nextLine();

        // System.out.print("Introduce tu edad: ");
        // int edad = scanner.nextInt();

        // System.out.printf("Hola %s, tienes %d años.\n", nombre, edad);

        // scanner.close();



        // Console console = System.console();

        // if (console != null) {
        //     String nombre = console.readLine("Introduce tu nombre: ");
        //     int edad = Integer.parseInt(console.readLine("Introduce tu edad: "));

        //     System.out.println("Hola " + nombre + ", tienes " + edad + " años.");
        // } else {
        //     System.out.println("No se puede obtener la consola.");
        // }

        // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // System.out.print("Introduce tu nombre: ");
        // String nombre = reader.readLine();

        // System.out.print("Introduce tu edad: ");
        // int edad = Integer.parseInt(reader.readLine());

        // System.out.println("Hola " + nombre + ", tienes " + edad + " años.");

        // reader.close();



        for (var contador = 0; contador < 50; contador++) {
            if (contador % 2 == 0) {
                System.out.println(contador + " es un número par!");
            }
            if (contador % 3 == 0) {
                System.out.println(contador + " es múltiplo de 3!");
            }

            System.out.println("mi primer commit");
            System.out.println("Mi se gundo commit");
        }
    }
}

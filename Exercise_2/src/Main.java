import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        Persona[] personas = new Persona[4];

        for (int i = 0; i < personas.length; i++){
            personas[i] = new Persona("sofia", 20,"F", 65, 1.70);
        }

        try {
            System.out.println("Ingrese un numero para mostrar la persona");
            mostrarPersona(personas, input.nextInt());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("ERROR: " + e.getMessage());
        }
    }

    private static void mostrarPersona(Persona[] personas, int n) {
        System.out.println(personas[n].toString());
    }

}

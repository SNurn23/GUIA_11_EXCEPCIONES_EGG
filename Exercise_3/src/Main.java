import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        int n1, n2;

        System.out.println("Ingrese dos numeros");

        try {
            System.out.print("Primer numero: "); n1 = Integer.parseInt(input.next());
            System.out.print("\nSegundo numero: "); n2 = Integer.parseInt(input.next());
            System.out.println("Resultado: " + dividir(n1, n2));
        }catch (NumberFormatException e) {
            System.err.println("Error: Valor ingresado no valido");
        }catch (ArithmeticException e){
            System.err.println("ERROR: No se puede dividir por 0");
        }
    }

    public static double dividir(int n1, int n2) throws ArithmeticException {
        return n1/n2;
    }
}

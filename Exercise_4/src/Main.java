import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        int n;

        try {
            System.out.println("Cuantas veces vas a realizar la operacion de dividir? ");
            n = input.nextInt();

            for (int i = 0; i < n; i++){
                dividir();
            }

        }catch (InputMismatchException e){
            System.err.println("Error: El numero ingresado no debe ser decimal");
        }catch (NumberFormatException e) {
            System.err.println("Error: El valor ingresado no es un numero");
        }catch (ArithmeticException e){
            System.err.println("ERROR: No se puede dividir por 0");
        }
    }


    public static void dividir() throws ArithmeticException, NumberFormatException {
        Scanner input = new Scanner(System.in, StandardCharsets.ISO_8859_1).useDelimiter("\n").useLocale(Locale.US);
        int n1, n2;

        System.out.println("Ingrese dos numeros");

        System.out.print("Primer numero: ");
        n1 = Integer.parseInt(input.next());
        System.out.print("\nSegundo numero: ");
        n2 = Integer.parseInt(input.next());
        System.out.println("Resultado: " + (n1/n2));

    }

}

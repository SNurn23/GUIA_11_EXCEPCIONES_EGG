import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int valor = rand.nextInt(500), intentos = 0, num;
        boolean b = false;

        do{
            try {
                System.out.println("Vamos a jugar! Adivine un valor entre 1 y 500:");
                num = input.nextInt();

                if (num == valor) {
                    System.out.println("Has Acertado!");
                    b = true;
                }else {
                    if(num > valor) {
                        System.out.println("El numero ingresado es mayor al valor a adivinar");
                    }else{
                        System.out.println("El numero ingresado es menor al valor a adivinar");
                    }
                    intentos++;
                }

            } catch (InputMismatchException e) {
                System.err.println("Error: Valor no valido");
                input.next();
                intentos++;
            }
        }while(!b);

        System.out.println("Cantidad de intentos: " + intentos);
    }
}

public class Main {
    public static void main(String[] args) {
        Persona persona = null;

        try {
            System.out.println("Es mayor de edad? " + persona.esMayorDeEdad());
        }catch (Exception e) {
            System.err.println("ERROR: Objeto no cargado");
        }
    }

}

import java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, String  sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String  getSexo() {
        return sexo;
    }

    public void setSexo(String  sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void crearPersona(){
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese su nombre completo: ");
        this.nombre = input.next();
        System.out.println("Ingrese su altura:");
        this.altura = input.nextDouble();
        System.out.println("Ingrese su edad: ");
        this.edad = input.nextInt();
        System.out.println("Ingrese su peso: ");
        this.peso = input.nextDouble();
        do{
            System.out.println("Ingrese su sexo: F (femenino), M (masculino), O (otro)");
            this.sexo = input.next().toUpperCase();

            if(!(this.sexo.equals("M") ||this.sexo.equals("F") || this.sexo.equals("O"))){
                System.out.println("ERROR: valor incorrecto");
            }
        }while(!(this.sexo.equals("M") || this.sexo.equals("F") || this.sexo.equals("O")));
    }

    public int calcularIMC(){
        double imc = (this.peso/Math.pow(this.altura,2));

        if(imc < 20){
            return -1;
        }else if(imc >= 20 && imc <= 25){
            return 0;
        }
        return 1;

    }

    public boolean esMayorDeEdad(){
        return this.edad >=18;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
}

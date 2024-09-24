package ReinoAnimal;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el nombre del lobo");
        String nombre =scanner.next();
        scanner.close();

        Lobo lobo = new Lobo();

        lobo.setEdad(4);
        lobo.setEspecie("canino");
        lobo.setNombre(nombre);

        System.out.println("Nombre: " + lobo.getNombre());
        System.out.println("Edad: " + lobo.getEdad());
        System.out.println("Especie: " + lobo.getEspecie());
        System.out.println("Accion: " + lobo.correr());
        System.out.println("Accion: " + lobo.cazar());
    }
}
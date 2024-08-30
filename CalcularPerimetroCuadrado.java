import java.util.Scanner;

public class CalcularPerimetroCuadrado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la longitud del lado del cuadrado: ");
        float lado = scanner.nextFloat();
        float perimetro = 4 * lado;
        System.out.println("El perímetro del cuadrado es: " + perimetro);
        scanner.close();
    }
}

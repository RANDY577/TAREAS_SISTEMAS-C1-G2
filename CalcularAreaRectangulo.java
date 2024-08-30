import java.util.Scanner;

public class CalcularAreaRectangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la base del rectángulo: ");
        float base = scanner.nextFloat();
        System.out.print("Ingrese la altura del rectángulo: ");
        float altura = scanner.nextFloat();
        float area = base * altura;
        System.out.println("El área del rectángulo es: " + area);
        scanner.close();
    }
}

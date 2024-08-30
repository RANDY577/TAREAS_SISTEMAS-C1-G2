import java.util.Scanner;

public class CalcularAreaCirculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio del círculo: ");
        float radio = scanner.nextFloat();
        float area = (float) Math.PI * radio * radio;
        System.out.println("El área del círculo con radio " + radio + " es: " + area);
        scanner.close();
    }
}

import java.util.Scanner;

public class ConvertirDolaresASoles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float tasaConversion = 3.70f; 
        System.out.print("Ingrese la cantidad en dólares: ");
        float dolares = scanner.nextFloat();
        float soles = dolares * tasaConversion;
        System.out.println(dolares + " dólares es igual a " + soles + " soles.");
        scanner.close();
    }
}

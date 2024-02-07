import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();
       
        System.out.println("\nA soma dos numeros e: " + (numero1 + numero2));

        System.out.println("A subtração dos numeros e: " + (numero1 - numero2));
        System.out.println("A multiplicao dos numeros e: " + (numero1 * numero2));
        System.out.println("A divisao dos numeros e: " + (numero1 / numero2));

        scanner.close();

    }
}
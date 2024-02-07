import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celcius: ");
        float temperatura_celcius = scanner.nextFloat();
        float temperatura_fahrenheit = ((temperatura_celcius*9)+160)/5;
        System.err.println("A temperatura em Fahrenheit e: " + temperatura_fahrenheit);
        

        scanner.close();

    }
}
import java.util.Scanner;

public class VerificacaoParImpar {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o numero: ");
        int numero1 = scanner.nextInt();
        if (numero1 % 2 == 0){
            System.out.println("O numero e par");
        }
        else{
            System.out.println("O numero e impar");
        }

        scanner.close();

    }
}